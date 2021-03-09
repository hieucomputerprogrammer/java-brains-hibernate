package dev.tech;

import dev.tech.domain.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(1);
        userDetails.setUsername("hieu");
        userDetails.setJoinedDate(new Date());
        userDetails.setAddress("Viet Nam");
        userDetails.setDescription("Java Engineer");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(userDetails);
        session.getTransaction().commit();
        session.close();
    }
}