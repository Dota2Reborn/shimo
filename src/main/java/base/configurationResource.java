package base;

import com.google.common.base.Preconditions;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class configurationResource {
    private static final String locatorFile = "resourceFile";
    private static final String testEnvironment = "release"; //dev , release, local
    private String test_url;

    /**
     * 获取测试地址
     *
     * @author 刘晨
     * @Time 2017-11-20
     */
    public String getUrl() {
        if (testEnvironment.equals("release")) {
            test_url = "https://release.shimodev.com/";
        } else if (testEnvironment.equals("dev")) {
            test_url = "https://shimodev.com/";
        } else if(testEnvironment.equals("local")){
            test_url = getUrlWithCookie();
        }
        return test_url;
    }

    public static String getUrlWithCookie() {

        File file = new File(TestInit.class.getClassLoader().getResource(locatorFile).getFile());
        Preconditions.checkArgument(file.exists(), "Unable to locate " + locatorFile);
        JSONObject foundObject = getElementJson(file, "URL", testEnvironment);

        Preconditions.checkState(foundObject != null, "No entry found element ["
                + testEnvironment + "] in the " + "locators file [" + locatorFile + "]");
        String result = foundObject.getString("testURL");
        return  result;
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
                    if (elementName.equals(element.getString("testEnvironment"))) {
                        return element;
                    }
                }
            }
        }

        return null;
    }

}
