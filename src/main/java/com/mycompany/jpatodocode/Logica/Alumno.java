package com.mycompany.jpatodocode.Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author felipeaguilerafuentealba
 */

@Entity
public class Alumno implements Serializable {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Basic
    private String nombre;
    private String apellido;
    
    @Temporal(TemporalType.DATE)
    private Date fechNac;
    
    @OneToOne
    private Carrera carrera;

    //Constructores
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, Date fechNac, Carrera carrera) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechNac = fechNac;
        this.carrera = carrera;
    }

    //Get y Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechNac() {
        return fechNac;
    }

    public void setFechNac(Date fechNac) {
        this.fechNac = fechNac;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechNac=" + fechNac + ", carrera=" + carrera + '}';
    }

   
    
}
