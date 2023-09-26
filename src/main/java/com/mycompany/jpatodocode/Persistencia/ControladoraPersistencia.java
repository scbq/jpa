package com.mycompany.jpatodocode.Persistencia;

import com.mycompany.jpatodocode.Logica.Alumno;
import com.mycompany.jpatodocode.Logica.Carrera;
import com.mycompany.jpatodocode.Logica.Materia;
import com.mycompany.jpatodocode.Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felipeaguilerafuentealba
 */
public class ControladoraPersistencia {
    
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    CarreraJpaController carreJpa = new CarreraJpaController();
    MateriaJpaController matJpa = new  MateriaJpaController();
    
    
    //---------------ALUMNO---------------
    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }

    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return aluJpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumno() {
        List<Alumno> listita = aluJpa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(listita);
        return listaAlumnos;
    }

    //----------------CARRERA------------------
    public void crearCarrera(Carrera car) {
        carreJpa.create(car);
    }

    public void eliminarCarrera(int idCarrera) {
        try {
            carreJpa.destroy(idCarrera);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera car) {
        try {
            carreJpa.edit(car);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int idCarrera) {
        return carreJpa.findCarrera(idCarrera);
    }

    public ArrayList<Carrera> traerListaCarrera() {
        List<Carrera> carrerita = carreJpa.findCarreraEntities();
        ArrayList<Carrera> listaCarrera = new ArrayList<>(carrerita);
        return listaCarrera;
    }
    
    
    //--------------MATERIA----------------
    public void crearMateria(Materia materia) {
        matJpa.create(materia);
    }

    public void eliminarMateria(int idMateria) {
        try {
            matJpa.destroy(idMateria);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia materia) {
        try {
            matJpa.edit(materia);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int idMateria) {
        return matJpa.findMateria(idMateria);
    }

    public ArrayList<Materia> traerListaMateria() {
        List<Materia> mater = matJpa.findMateriaEntities();
        ArrayList<Materia> listaMateria = new ArrayList<>(mater);
        return listaMateria;
    }
}
