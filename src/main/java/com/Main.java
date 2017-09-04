package com;

import com.model.Employee;
import com.persistance.HibernateUtil;
import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");

        Employee emp1 = new Employee();
        emp1.setEmpName("Rajuuyy");
        emp1.setEmpPhone(12345);

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(emp1);
        session.getTransaction().commit();
        session.close();

    }
}
