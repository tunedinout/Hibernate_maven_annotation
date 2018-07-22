/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.hibernate_maven_annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author narottamkrjha
 */
public class StoreData {
    public static void main(String[] args){
//           StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
//           Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//           
//           SessionFactory factory = meta.getSessionFactoryBuilder().build();
//           Session session = factory.openSession();
//  Q -> difference between two methods
           
           
           Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
           Transaction t = session.beginTransaction();
           
           Employee e1 = new Employee();
           e1.setFirstName("Cosmo");
           e1.setSecondName("kramer");
           
           session.save(e1);
           t.commit();
           System.out.println("Sucessfully saved ");
           
           session.close();
           
    }
}
