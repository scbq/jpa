/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jpatodocode;

import com.mycompany.jpatodocode.Logica.Alumno;
import com.mycompany.jpatodocode.Logica.Carrera;
import com.mycompany.jpatodocode.Logica.ControladoraLogica;
import com.mycompany.jpatodocode.Logica.Materia;
import com.mycompany.jpatodocode.Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author felipeaguilerafuentealba
 */
public class JpaTodoCode {

    public static void main(String[] args) {
        
        //Instaciamos nuestra controladora logica
        ControladoraLogica control = new ControladoraLogica();
        
        //Crear lista de materias y las agregamos
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        
         //Creacion de carrera con lista de materias
        Carrera carre = new Carrera(23, "Ingeneria", "Ingeneria Informatica", listaMaterias);
        
         //Guardamos carrera
        control.crearCarrera(carre);
        
        //Crear Materia
        Materia mate1 = new Materia(58, "Programacion I", "Cuatrimestral", carre);
        Materia mate2 = new Materia(60, "Estructura de Datos", "Semestral", carre);
        Materia mate3 = new Materia(59, "Programacion II", "Trimestral", carre);
        
        //Guardar materia en BD
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        //Agregar materias a la lista materias
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        carre.setListaMateria(listaMaterias);
        control.editarCarrera(carre);
        
        //Creamos alumno con carrera
        Alumno al = new Alumno(23, "Felipe", "Aguilera", new Date(), carre);

        //Guardamos el alumno en la BD
        control.crearAlumno(al);
    }
}
