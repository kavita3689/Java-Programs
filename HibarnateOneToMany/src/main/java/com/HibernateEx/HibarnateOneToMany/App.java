package com.HibernateEx.HibarnateOneToMany;

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
        
        Employee s = new Employee();
        s.setEmp_id(11);
        s.setEmp_name("Kavita");
        s.setEmp_add("Dhamori");
        s.setEmp_con_no(26446476);
        
        Department d1 = new Department();
        d1.setDep_id(100);
        d1.setDep_name("Computer");
        d1.setEmployee(s);
        
        Department d2 = new Department();
        d2.setDep_id(200);
        d2.setDep_name("IT");
        d2.setEmployee(s);
        
        Department d3 = new Department();
        d3.setDep_id(300);
        d3.setDep_name("E&TC");
        d3.setEmployee(s);
        
        Department d4 = new Department();
        d4.setDep_id(400);
        d4.setDep_name("Electrical");
        d4.setEmployee(s);
       
        List<Department> list=new ArrayList<Department>();
        list.add(d1);
        list.add(d2);
        list.add(d3);
        
        s.setDepartment(list);
        
        Session session = factory.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(s);
        session.save(d1);
        session.save(d2);
        session.save(d3);
        
        tx.commit();
        
        session.close();
        factory.close();
     }
        
}
