/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Alejandro
 */
public class JPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        CONFIGURAR PRIMERO EL ARCHIVO persistence.xml:
        En services -> Databases -> Java DB.
        click derecho 'start server'
        click derecho 'Create Database'
        meter los datos de la base de datos en persistence.xml
        En javax.persistence.jdbc.url despues del puerto 1527/ va el nombre de la base de datos
        
        Para las nuevas entidades deben añadirse al archivo de persistence.xml con <class>
        */
    	
    	Demandante user = new Demandante();
    	user.setNombre("Carlos");
    	user.setEmail("a@a.a");
    	user.setEdad(23);

        // TODO Auto-generated method stub
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AprendizajeServicioVoluntario");
        EntityManager em = emf.createEntityManager();
        // 3-Persists the book to the database
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(user);
        tx.commit();
        
        em.close();
        emf.close();
    }
    
}
