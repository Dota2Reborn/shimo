package elementFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class CustomFieldDecorator extends DefaultFieldDecorator {

	public CustomFieldDecorator(ElementLocatorFactory factory) {
		super(factory);
	}

	@Override
	protected boolean isDecoratableList(Field field) {
		if (!List.class.isAssignableFrom(field.getType())) {
			return false;
		} else {
			Type type = field.getGenericType();
			if (!(type instanceof ParameterizedType)) {
				return false;
			} else {
				Type listType = ((ParameterizedType) type).getActualTypeArguments()[0];
				if (WebElement.class.equals(listType)) {
					if (null != field.getAnnotation(SearchWith.class)) {
						return true;
					}
				}
				return false;
			}
		}
	}

}
