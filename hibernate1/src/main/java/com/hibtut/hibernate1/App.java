package com.hibtut.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        System.out.println("session created");
        MyStudent st=new MyStudent();
        
        st.setId(101);
        st.setName("Abhishek");
        
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        
        s.save(st);
        t.commit();
        
        s.close();
    }
}
