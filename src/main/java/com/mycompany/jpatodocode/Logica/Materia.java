package com.mycompany.jpatodocode.Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author felipeaguilerafuentealba
 */

@Entity
public class Materia implements Serializable {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idMateria;
    
    @Basic
    private String nombreMateria;
    private String tipo;
    
    @ManyToOne
    private Carrera carre;
    
    //Constructores
    public Materia() {
    }

    public Materia(int idMateria, String nombreMateria, String tipo, Carrera carre) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.tipo = tipo;
        this.carre = carre;
    }
    
    //Get y Set
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Carrera getCarre() {
        return carre;
    }

    public void setCarre(Carrera carre) {
        this.carre = carre;
    }
    
    
}
