package business_logic;

import entities.Bike;
import entities.Car;
import entities.Plane;
import entities.Truck;
import org.hibernate.Session;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // Create;
        create();

        // Read.
        read();

        // Update.
        update();

        // Delete
        delete();

        HibernateUtil.shutdown();

    }

    private static void delete() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        System.out.println("Delete:");
        Truck truck = session.get(Truck.class, 20);
        session.remove(truck);

        session.getTransaction().commit();

        session.close();
    }

    public static void create() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        System.out.println("Create:");
        Bike bike = new Bike("electricity", "BMX", new BigDecimal("107000.00"));
        Plane plane = new Plane("aviation fuel", "SuperJet", new BigDecimal("2540500000.00"), "S7 airlines", 87);
        Car car = new Car("petrol", "BMW", new BigDecimal("7500000.00"), 5);
        Truck truck = new Truck("diesel", "peterbilt", new BigDecimal("13450000"), 40);

        session.persist(bike);
        session.persist(plane);
        session.persist(car);
        session.persist(truck);

        session.getTransaction().commit();
        session.close();
    }

    public static void read() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Bike bike1 = session.get(Bike.class, 1);
        System.out.println("Read:");
        System.out.println(bike1.getModel() + " = " + bike1.getPrice());

        session.close();
    }

    public static void update() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Plane plane = session.get(Plane.class, 18);
        System.out.println("old passenger_capacity = " + plane.getPassenger_capacity());
        System.out.println("Update:");
        plane.setPassenger_capacity(95);
        session.persist(plane);

        session.getTransaction().commit();

        plane = session.get(Plane.class, 2);
        System.out.println("new passenger_capacity = " + plane.getPassenger_capacity());

        session.close();
    }
}