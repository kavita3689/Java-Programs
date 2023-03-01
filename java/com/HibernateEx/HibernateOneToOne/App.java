package com.HibernateEx.HibernateOneToOne;

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
       Configuration cfg = new Configuration();
       cfg.configure("hibernte.cfg.xml");
       
       SessionFactory factory = cfg.buildSessionFactory();
       System.out.println(factory.isClosed());
       
       Student s = new Student();
       s.setStd_id(101);
       s.setStd_name("Kavita");
       s.setCont_no(98237482);
       s.setAddr("Dhanori");
       
       Laptop l = new Laptop();
       l.setMod_no(501);
       l.setLap_name("HP");
       
       s.setLatop(l);
       l.setStudent(s);
       
       Session session= factory.openSession();
       
       Transaction tx = session.beginTransaction();
       
       session.save(s);
       session.save(l);
       
       tx.commit();
       
       session.close();
       factory.close();
    }
}
