/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logina;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author moises
 */
public class LoginA {
    public static ArrayList<Profesor> profesores = new ArrayList<>();
    public static Profesor profesorLogeado = new Profesor();
    public static ArrayList<Alumno> alumnos = new ArrayList<>();
    public static Alumno alumnoLogeado = new Alumno();
    public static ArrayList<Cursos> curso= new ArrayList<>();

    
    public static void main(String[] args) {
          cargarDatos();
          
        LoginF l = new LoginF();
        l.setVisible(true);
        
         Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            guardarDatos();
        }));
        }   

    public static void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("profesores.dat"))) {
            oos.writeObject(profesores);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("alumnos.dat"))) {
            oos.writeObject(alumnos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cursos.dat"))) {
            oos.writeObject(curso);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("profesores.dat"))) {
            profesores = (ArrayList<Profesor>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumnos.dat"))) {
            alumnos = (ArrayList<Alumno>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cursos.dat"))) {
            curso = (ArrayList<Cursos>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }  }
