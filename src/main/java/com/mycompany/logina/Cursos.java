/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logina;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Moises
 */
public class Cursos implements Serializable{
     private static final long serialVersionUID = 1L;
    public String id;
    public String nombre;
    public String seccion;
    public String fechainicio;
    public String fechafin;
    public String horaInicio;
    public String horaFin;
    public String profesor;
    public  ArrayList<Alumno> Alumnos = new ArrayList<>();
    public static int contador = 1;

    Object profesor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getProfesor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}