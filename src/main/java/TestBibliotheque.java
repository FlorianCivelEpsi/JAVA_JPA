import domain.Client;
import domain.Emprunt;
import domain.Livre;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Set;

public class TestBibliotheque {

    public static void main (String[] args){

        /* EntityManagerFactory emf = Persistence.createEntityManagerFactory("fc-b3"); */
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "fc-b3");
        EntityManager em = emf.createEntityManager();
/*
        Emprunt e1 = em.find(Emprunt.class, 1);
        System.out.println(e1.toString());
*/
        Livre l1 = em.find(Livre.class, 4);
        System.out.println(l1.toString());

        List<Livre> liste = null;
        liste = em.createQuery("from Livre", Livre.class).getResultList();
        System.out.println(liste.toString());

        List<Emprunt> liste2 = null;
        liste2 = em.createQuery("from Emprunt WHERE client.id = 2", Emprunt.class).getResultList();
        System.out.println(liste2.toString());



        em.getTransaction().commit();
        em.close();

    }

}
