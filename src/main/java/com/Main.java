package com;

import com.model.*;
import com.persistance.HibernateUtil;
import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("Car");

        TwoWeeler twoWeeler = new TwoWeeler();
        twoWeeler.setVehicleName("bike");
        twoWeeler.setStearingHandle("pulsar");

        FourWeeler fourWeeler= new FourWeeler();
        fourWeeler.setVehicleName("bmw");
        fourWeeler.setStearingWheel("bmw");




        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(twoWeeler);
        session.save(fourWeeler);
        session.getTransaction().commit();
        session.close();


    }
}
