package top.luyuni.ss.custom;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;
import top.luyuni.ss.entity.People;

public class PeopleDefinitionParser extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class getBeanClass(Element element) {
		return People.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder bean) {
		String id = element.getAttribute("id");
		String name = element.getAttribute("name");
		String age = element.getAttribute("age");
		if (StringUtils.hasText(id)) {
			bean.addPropertyValue("id", id);
		}
		if (StringUtils.hasText(name)) {
			bean.addPropertyValue("name", name);
		}
		if (StringUtils.hasText(age)) {
			bean.addPropertyValue("age", Integer.valueOf(age));
		}
	}
}