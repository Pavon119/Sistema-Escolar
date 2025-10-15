
package com.mycompany.sistemaescolar;

import javax.swing.JOptionPane;
//subclase hereda de persona (clase hija )

public class Profesor extends Persona {
    private String materia;
    private double salario;
    
     public Profesor(String nombre, int edad, String dni, String materia, double salario) {
        super(nombre, edad, dni);
        this.materia = materia;
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null,
            "Profesor: " + getNombre() +
            "\nEdad: " + getEdad() +
            "\nDNI: " + getDni() +
            "\nMateria: " + materia +
            "\nSalario: $" + salario
        );
    }
    
}
