import domain.Livre;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

    public static void main (String[] args){

       /* EntityManagerFactory emf = Persistence.createEntityManagerFactory("fc-b3"); */
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "fc-b3");
        EntityManager em = emf.createEntityManager();
        Livre livre = em.find(Livre.class, 1);
        System.out.println(livre.toString());

        em.getTransaction().begin();
        Livre nouveau = new Livre();
        nouveau.setId(9);
        nouveau.setAuteur("oui");
        nouveau.setTitre("non");
        em.persist(nouveau);

        Livre livre2 = em.find(Livre.class, 2);
        System.out.println(livre2.toString());


        em.getTransaction().commit();




        em.close();

    }

}
