package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
//    	Demandante user = new Demandante();
//    	user.setNombre("Carlos");
//    	user.setEmail("a@a.a");
//    	user.setEdad(23);

        Actividad act = new Actividad();
        act.setEstado(new Estado(EstadoType.ABIERTA, "Hola"));
        act.setConvalidacion(new Convalidacion());
        act.setTitulo("Jajajajaja Lol");

        Actividad act2 = new Actividad();
        act2.setEstado(new Estado(EstadoType.ACEPTADA, "adios"));
        act2.setTitulo("wooooo");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AprendizajeServicioVoluntario");
        EntityManager em = emf.createEntityManager();
        // 3-Persists the book to the database

        EntityTransaction tx = em.getTransaction();
        tx.begin();
//        em.persist(user);
        em.persist(act);
        tx.commit();

        tx.begin();
        act.getEstado().setEstadoType(EstadoType.CERRADA);
        em.merge(act);
        tx.commit();

        tx.begin();
        em.persist(act2);
        tx.commit();

        em.close();
        emf.close();
    }

    /* Registro de usuario */
    
}
