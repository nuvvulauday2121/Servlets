package com.uday.SpringConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        
        Employee emp = (Employee) context.getBean("employee");
        emp.show();
    }
}
