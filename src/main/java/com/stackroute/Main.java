package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {

        //Used Application context with name having two values
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = (Movie)context.getBean("movieA");
        System.out.println(movie1.getActor());

        //Using same context to get beans of other name
        Movie movie2 = (Movie)context.getBean("movieC");
        System.out.println(movie1.getActor());
        //Comparing the objects
        System.out.println(movie1==movie2);

    }
}
