package com.HibernateEx.HibarnateManyToMany;

import java.util.ArrayList;
import java.util.List;

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
        cfg.configure("Hibarnate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory.isClosed());
        
        Employees e1 = new Employees();
        e1.setEmp_id(101);
        e1.setEmp_name("Kavita");

        Employees e2 = new Employees();
        e2.setEmp_id(102);
        e2.setEmp_name("Neha");

        Project p1 = new Project();
        p1.setProj_Id(501);
        p1.setProj_Name("Clg Managament");
        
        Project p2 = new Project();
        p2.setProj_Id(502);
        p2.setProj_Name("E-Commerce ");
        
        Project p3 = new Project();
        p3.setProj_Id(503);
        p3.setProj_Name("Shop Managament");
        
        Project p4 = new Project();
        p4.setProj_Id(504);
        p4.setProj_Name("Library Managament");
        
        List<Employees> emp=new ArrayList<Employees>();
        List<Project> pro=new ArrayList<Project>();
        
        pro.add(p1);
        pro.add(p2);
        pro.add(p4);
        e1.setProject(pro);
        
        emp.add(e1);
        emp.add(e2);
        p1.setEmployees(emp);
        
        Session session = factory.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(e1);
        session.save(e2);
        
        session.save(p1);
        session.save(p2);
        session.save(p3);
        session.save(p4);
        
        tx.commit();
        
        session.close();
        factory.close();
     }

}

