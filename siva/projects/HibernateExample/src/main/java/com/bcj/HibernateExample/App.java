package com.bcj.HibernateExample;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Student std=new Student();
      Scanner sc =new Scanner(System.in); 
      System.out.println("Enter the ID ");
      std.setId(sc.nextInt());
      System.out.println("Enter the name ");
      std.setName(sc.next());
      System.out.println("Enter the Branch ");
      std.setBranch(sc.next());
     
      Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
      
      ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
      SessionFactory fac= con.buildSessionFactory(reg);
      Session shsn=fac.openSession();
      
      Transaction tx = shsn.beginTransaction();
      shsn.save(std);
      tx.commit();
    } 
}
