package com.bcj.SpringMaven;
import com.bcj.SpringMaven.School;
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

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        School scl = (School)context.getBean("Student");
        scl.teach();
    }
}
