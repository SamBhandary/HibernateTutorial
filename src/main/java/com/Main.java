package com;

import com.model.Address;
import com.model.Employee;
import com.persistance.HibernateUtil;
import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");

        Employee emp1 = new Employee();
        emp1.setEmpName("Rajuuyy");
        emp1.setEmpPhone(12345);

        Address address = new Address();
        address.setStreet("123 street");
        address.setCity("city");


        Address officeAddress = new Address();
        officeAddress.setStreet("office Street");
        officeAddress.setCity("office city");
        officeAddress.setPincode("office pin");
        officeAddress.setState("office state");
        emp1.getAddress().add(address);
        emp1.getAddress().add(officeAddress);



        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(emp1);
        session.getTransaction().commit();
        session.close();

        emp1 = null;
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        emp1 = (Employee) session.get(Employee.class, 1);
        officeAddress = null;
        //officeAddress =(Address) session.get(Address.class,1);
        System.out.print("Employee Name retrived is: "+emp1.getEmpName());
        for(Address address1: emp1.getAddress()) {
            System.out.print("Office Address retrived is: "+address1.getCity());
        }

        session.close();

    }
}
