

package com.mycompany.sistemaescolar;

import javax.swing.JOptionPane;

//clase principal 
//Sirve como interfaz entre el usuario y la lógica del sistema.
public class Principal {

    public static void main(String[] args) {
      
         SistemaEscolar sistema = new SistemaEscolar();
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  === SISTEMA ESCOLAR ===
                                                                  1. Agregar Alumno
                                                                  2. Agregar Profesor
                                                                  3. Mostrar Personas
                                                                  4. Salir
                                                                  Seleccione una opci\u00f3n:"""));

            switch (opcion) {
                case 1 -> sistema.agregarAlumno();
                case 2 -> sistema.agregarProfesor();
                case 3 -> sistema.mostrarPersonas();
                case 4 -> JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                default -> JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (opcion != 4);
    }
    }
//la persona que usa el cerebro 