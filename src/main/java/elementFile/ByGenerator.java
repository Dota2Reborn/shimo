package elementFile;

import com.google.common.base.Preconditions;
import org.apache.commons.lang.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ByGenerator {
	private static final String locatorFile = "locator.json";

	public static By createBy(String pageName, String elementName, String noteName, Object... replaceValues) {
		Preconditions.checkArgument(StringUtils.isNotEmpty(pageName), "Page elementName is missing.");
		Preconditions.checkArgument(StringUtils.isNotEmpty(elementName), "Element elementName is missing.");

        File file = new File(ByGenerator.class.getClassLoader().getResource(locatorFile).getFile());
		Preconditions.checkArgument(file.exists(), "Unable to locate " + locatorFile);
		JSONObject foundObject = getElementJson(file, pageName, elementName);

		Preconditions.checkState(foundObject != null, "No entry found for the page [" + pageName + "] and element ["
				+ elementName + "] in the " + "locators file [" + locatorFile + "]");
		String locateUsing = foundObject.getString("locateUsing");
		String locator = foundObject.getString("locator");
		if (replaceValues != null && replaceValues.length > 0) {
			locator = String.format(locator, replaceValues);
		}
		Preconditions.checkArgument(StringUtils.isNotEmpty(locator), "Locator cannot be null (or) empty.");

		if (("xpath".equalsIgnoreCase(locateUsing))) {
			return new By.ByXPath(locator);
		}
		if (("id".equalsIgnoreCase(locateUsing))) {
			return new By.ById(locator);
		}
		if (("name".equalsIgnoreCase(locateUsing))) {
			return new By.ByName(locator);
		}
		if (("className".equalsIgnoreCase(locateUsing))) {
			return new By.ByClassName(locator);
		}
		if (("css".equalsIgnoreCase(locateUsing))) {
			return new By.ByCssSelector(locator);
		}
		if (("tagName".equalsIgnoreCase(locateUsing))) {
			return new By.ByTagName(locator);
		}
		if (("linkText".equalsIgnoreCase(locateUsing))) {
			return new By.ByLinkText(locator);
		}
		if (("partialLinkText".equalsIgnoreCase(locateUsing))) {
			return new By.ByPartialLinkText(locator);
		}
		throw new UnsupportedOperationException("Currently " + locateUsing + " is NOT supported.");
	}

	@SuppressWarnings("resource")
	private static JSONObject getElementJson(File file, String pageName, String elementName) {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		StringBuilder stringBuilder = new StringBuilder();
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String temp = bufferedReader.readLine();
			while (null != temp) {
				stringBuilder.append(temp);
				temp = bufferedReader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Can't find file" + file.getName());
		} finally {
			try {
				fileReader.close();
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		JSONArray pages = new JSONArray(stringBuilder.toString());
		for (Object page : pages) {
			JSONObject pageJsonObject = (JSONObject) page;
			if (pageName.equals(pageJsonObject.getString("pageName"))) {
				JSONArray elements = pageJsonObject.getJSONArray("elements");
				for (int i = 0; i < elements.length(); ++i) {
					JSONObject element = elements.getJSONObject(i);
					if (elementName.equals(element.getString("elementName"))) {
//						System.out.println(element.toString());
						return element;
					}
				}
			}
		}

		return null;
	}
}
