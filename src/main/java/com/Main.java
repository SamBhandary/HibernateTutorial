package com;

import com.model.Address;
import com.model.Employee;
import com.model.Vehicle;
import com.persistance.HibernateUtil;
import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");

        Employee emp1 = new Employee();
        emp1.setEmpName("Rajuuyy");

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("Car");

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setVehicleName("Jeep");
        emp1.getVehicle().add(vehicle);
        emp1.getVehicle().add(vehicle1);
        vehicle.setEmployee(emp1);
        vehicle1.setEmployee(emp1);


        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(emp1);
        session.save(vehicle);
        session.getTransaction().commit();
        session.close();


    }
}
