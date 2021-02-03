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

    @Column(name = "ID_CLIENT")
    private int id_client;

    @ManyToOne
    @JoinColumn(name= "ID")
    private Client client;

    @ManyToMany(mappedBy = "emprunt")
    private Set<Livre> livre;




    public Emprunt() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public int getDelai() {
        return delai;
    }

    public void setDelai(int delai) {
        this.delai = delai;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "id=" + id +
                ", date_debut=" + date_debut +
                ", date_fin=" + date_fin +
                ", delai=" + delai +
                ", id_client=" + id_client +
                '}';
    }
}