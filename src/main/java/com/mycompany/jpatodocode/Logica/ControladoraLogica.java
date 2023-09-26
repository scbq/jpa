package com.mycompany.jpatodocode.Logica;


import com.mycompany.jpatodocode.Persistencia.ControladoraPersistencia;
import java.util.ArrayList;

/**
 *
 * @author felipeaguilerafuentealba
 */
public class ControladoraLogica {
    //Asi conecto las dos controladoras (persistencia y logica)
    ControladoraPersistencia controPer = new ControladoraPersistencia();
    
    
    //-------------ALUMNO-------------
    //Metodo Crear o Crud
    public void crearAlumno(Alumno alu){
        controPer.crearAlumno(alu);
    }
    
    //Metodo Delete o eliminar
    public void eliminarAlumno(int id){
        controPer.eliminarAlumno(id);
    }
    
    //Metodo editar o Update
    public void editarAlumno(Alumno alu){
        controPer.editarAlumno(alu);
    }
    
    //Metodo buscar
    public Alumno traerAlumno(int id){
        return controPer.traerAlumno(id);
    }
    
    //Mostrar lista completa alumnos
    public ArrayList<Alumno> traerAlumno(){
        return controPer.traerListaAlumno();
    }
    
    //------------CARRERA------------------
     //Metodo Crear o Crud
    public void crearCarrera(Carrera car){
        controPer.crearCarrera(car);
    }
    
    //Metodo Delete o eliminar
    public void eliminarCarrera(int idCarrera){
        controPer.eliminarCarrera(idCarrera);
    }
    
    //Metodo editar o Update
    public void editarCarrera(Carrera car){
        controPer.editarCarrera(car);
    }
    
    //Metodo buscar
    public Carrera traerCarrera(int idCarrera){
        return controPer.traerCarrera(idCarrera);
    }
    
    //Mostrar lista completa alumnos
    public ArrayList<Carrera> traeListaCarrera(){
        return controPer.traerListaCarrera();
    }
    
    
    //-----------MATERIA-----------------
     //Metodo Crear o Crud
    public void crearMateria(Materia materia){
        controPer.crearMateria(materia);
    }
    
    //Metodo Delete o eliminar
    public void eliminarMateria(int idMateria){
        controPer.eliminarMateria(idMateria);
    }
    
    //Metodo editar o Update
    public void editarMateria(Materia materia){
        controPer.editarMateria(materia);
    }
    
    //Metodo buscar
    public Materia traerMateria(int idMateria){
        return controPer.traerMateria(idMateria);
    }
    
    //Mostrar lista completa alumnos
    public ArrayList<Materia> traeListaMateria(){
        return controPer.traerListaMateria();
    }
}
