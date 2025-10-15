
package com.mycompany.sistemaescolar;

import javax.swing.JOptionPane;
//subclase (clase hija )

public class Alumno extends Persona {
    
    private String curso;
    private double promedio;

    public Alumno(String nombre, int edad, String dni, String curso, double promedio) {
        super(nombre, edad, dni);
        this.curso = curso;
        this.promedio = promedio;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Polimorfismo: implementa el método abstracto de Persona
    @Override
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null,
            "Alumno: " + getNombre() +
            "\nEdad: " + getEdad() +
            "\nDNI: " + getDni() +
            "\nCurso: " + curso +
            "\nPromedio: " + promedio
        );
    } 
    
}
