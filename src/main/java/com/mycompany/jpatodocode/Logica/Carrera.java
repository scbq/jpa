package com.mycompany.jpatodocode.Logica;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author felipeaguilerafuentealba
 */

@Entity
public class Carrera implements Serializable {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idCarrera;
    @Basic
    private String nombreCarrera;
    
    @OneToMany(mappedBy = "carre")
    private LinkedList<Materia> listaMateria;

    //Constructores
    public Carrera() {
    }

    public Carrera(int idCarrera, String carrera, String nombreCarrera, LinkedList<Materia> listaMateria) {
        this.idCarrera = idCarrera;
        this.nombreCarrera = nombreCarrera;
        this.listaMateria = listaMateria;
    }
    
    //Get y Set
    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public LinkedList<Materia> getListaMateria() {
        return listaMateria;
    }

    public void setListaMateria(LinkedList<Materia> listaMateria) {
        this.listaMateria = listaMateria;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }
    
    
    
}
