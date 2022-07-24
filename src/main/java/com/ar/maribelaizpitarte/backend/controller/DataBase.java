
package com.ar.maribelaizpitarte.backend.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataBase {
    private static EntityManagerFactory emfactory; 
    private static EntityManager entitymanager;
    
    public static void connect(){
       emfactory = Persistence.createEntityManagerFactory( "beojrdfizhw68tzplyt8" );
       entitymanager = emfactory.createEntityManager();       
    }

    public static EntityManager conection(){
        return entitymanager;
    }

    static Object connection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

