package com.anucana.services;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.mail.javamail.JavaMailSender;

public class MockedBeanSetup implements BeanPostProcessor {

	private static Map<String, Object> mockedBeanMap = new HashMap<String, Object>();
	static {
		mockedBeanMap.put("mailSender", Mockito.mock(JavaMailSender.class));
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		Object mockedBean = mockedBeanMap.get(beanName);
		if (mockedBean != null) {
			return mockedBean;
		}
		return bean;
	}

	public Object getMockedBean(String beanName) {
		return mockedBeanMap.get(beanName);
	}

}
