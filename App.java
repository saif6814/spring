package com.cogni.amir;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	BeanFactory beanfactory = new ClassPathXmlApplicationContext("context.xml");
        BasicBean bean = (BasicBean) beanfactory.getBean("basic");
        System.out.println(bean.getMesg());
       // System.out.println( "Hello World!" );
        ConstructorInject bean1 = (ConstructorInject) beanfactory.getBean("basic1");
        System.out.println(bean1.getName1());
        System.out.println(bean1.getRoll());
    }
}
