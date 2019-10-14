package ch01.hello;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * @author rancho
 * @date 2019/10/14
 */
public class HelloApp {

    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring-in-action/src/main/resources/hello.xml"));
        GreetingServiceImpl greetingService1 = (GreetingServiceImpl) beanFactory.getBean("greetingService");
        greetingService1.sayGreeting();
    }

}
