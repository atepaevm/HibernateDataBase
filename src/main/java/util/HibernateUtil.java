package main.java.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by 12 on 29.01.2017.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private  HibernateUtil(){}
    static{
        try {
            sessionFactory = new Configuration()
                    .configure() // configures settings from hibernate.cfg.xml
                    .buildSessionFactory();
        }
        catch (Exception e){
            System.out.println("!!!");
            e.printStackTrace();
            System.out.println("!!!");
        }
    }
    public  static SessionFactory getSessionFactory(){
        return  sessionFactory;
    }
}
