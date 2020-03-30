import model.Actividad;
import model.Convalidacion;
import model.Estado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPA {

    static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("AprendizajeServicioVoluntario");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        generarTablas(em);
//        test(em);

        em.close();
        emf.close();
    }

    static void generarTablas(EntityManager em) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        tx.commit();
    }

    static void test(EntityManager em) {
        Actividad act = new Actividad();
        act.setEstado(new Estado(Estado.Type.ABIERTA, "Hola"));
        act.setConvalidacion(new Convalidacion());
        act.setTitulo("Jajajajaja Lol");

        Actividad act2 = new Actividad();
        act2.setEstado(new Estado(Estado.Type.ACEPTADA, "adios"));
        act2.setTitulo("wooooo");

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(act);
        tx.commit();

        tx.begin();
        act.getEstado().setEstadoType(Estado.Type.CERRADA);
        tx.commit();

        tx.begin();
        em.persist(act2);
        tx.commit();
    }

}
