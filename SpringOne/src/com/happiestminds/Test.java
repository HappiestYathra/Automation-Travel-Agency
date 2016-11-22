package com.happiestminds;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {  
public static void main(String[] args) {  
//    Resource resource=new ClassPathResource("applicationContext.xml");  
//    BeanFactory factory=new XmlBeanFactory(resource);  
     ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");

   // B b=(B)applicationContext.getBean("b");  
    A a=(A)applicationContext.getBean("a");
   a.display();
}  
}  