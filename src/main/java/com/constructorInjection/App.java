package com.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //AbstractApplicationContext is interface used to call context.registerShutdownHook();
        AbstractApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
        Person person=(Person) context.getBean("person1");
        System.out.println(person);
        Code code=(Code) context.getBean("ambiguityProblem");
        code.doSum();
        //context.registerShutdownHook() is a hook to call the destroy method. we can't call destroy method
        // without this hook
        context.registerShutdownHook();
    }
}
