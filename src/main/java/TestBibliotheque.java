import domain.Emprunt;
import domain.Livre;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestBibliotheque {

    public static void main (String[] args){

        /* EntityManagerFactory emf = Persistence.createEntityManagerFactory("fc-b3"); */
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "fc-b3");
        EntityManager em = emf.createEntityManager();

        Emprunt e1 = em.find(Emprunt.class, 1);
        System.out.println(e1.toString());

        Livre l1 = em.find(Livre.class, 4);
        System.out.println(l1.toString());


        em.getTransaction().commit();
        em.close();

    }

}
