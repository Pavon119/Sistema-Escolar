
package com.mycompany.sistemaescolar;

import java.util.ArrayList;
import javax.swing.JOptionPane;

//clase de logica(control de listas)
//separacion de responabilidades o modularidad
public class SistemaEscolar {
    
    private final ArrayList<Persona> personas;

    public SistemaEscolar() {
        personas = new ArrayList<>();
    }

    public void agregarAlumno() {
        String nombre = JOptionPane.showInputDialog("Ingrese nombre del alumno:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad:"));
        String dni = JOptionPane.showInputDialog("Ingrese DNI:");
        String curso = JOptionPane.showInputDialog("Ingrese curso:");
        double promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese promedio:"));

        Alumno alumno = new Alumno(nombre, edad, dni, curso, promedio);
        personas.add(alumno);
        JOptionPane.showMessageDialog(null, "Alumno agregado con éxito.");
    }

    public void agregarProfesor() {
        String nombre = JOptionPane.showInputDialog("Ingrese nombre del profesor:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad:"));
        String dni = JOptionPane.showInputDialog("Ingrese DNI:");
        String materia = JOptionPane.showInputDialog("Ingrese materia que dicta:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese salario:"));

        Profesor profesor = new Profesor(nombre, edad, dni, materia, salario);
        personas.add(profesor);
        JOptionPane.showMessageDialog(null, "Profesor agregado con éxito.");
    }

    public void mostrarPersonas() {
        if (personas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay personas registradas.");
        } else {
            for (Persona p : personas) {
                p.mostrarDatos();
            }
        }
    }
    
}
//cerebro del sistema 