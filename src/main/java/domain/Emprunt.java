package domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "EMPRUNT")
public class Emprunt implements Serializable {

    @Id
    private int id;

    @Column(name = "DATE_DEBUT")
    private Date date_debut;

    @Column(name = "DATE_FIN")
    private Date date_fin;

    @Column(name = "DELAI")
    private int delai;


    @ManyToOne
    @JoinColumn(name= "ID_CLIENT")
    private Client client;

    @ManyToMany(mappedBy = "emprunt")
    private Set<Livre> livre;




    public Emprunt() {
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "id=" + id +
                ", date_debut=" + date_debut +
                ", date_fin=" + date_fin +
                ", delai=" + delai +
       /*         ", id_client=" + id_client +  */
                '}';
    }
}