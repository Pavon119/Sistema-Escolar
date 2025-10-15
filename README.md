# 🏫 Mini Sistema Escolar

Este proyecto fue desarrollado en *Java* utilizando *NetBeans* y los *pilares de la Programación Orientada a Objetos*: Herencia, Polimorfismo, Abstracción y Encapsulamiento.

---

## 📂 Estructura del Proyecto

- *Principal.java*: Clase principal que inicia el sistema.
- *SistemaEscolar.java*: Contiene la lógica principal del sistema (agregar, mostrar, buscar y eliminar personas).
- *Persona.java*: Superclase con atributos y métodos comunes (nombre, edad, DNI, captura de datos).
- *Alumno.java*: Subclase de Persona, representa a los estudiantes.
- *Profesor.java*: Subclase de Persona, representa a los docentes.

Todas las clases se encuentran dentro del paquete sistemaescolar.

---

## 💻 Funcionalidades

1. *Agregar personas*  
   Permite crear alumnos y profesores, ingresando sus datos mediante cuadros de diálogo JOptionPane.

2. *Mostrar personas*  
   Lista todos los alumnos y profesores registrados.

3. *Buscar personas*  
   Permite buscar un alumno o profesor por nombre.

4. *Eliminar personas*  
   Permite eliminar un alumno o profesor por nombre.

5. *Interfaz*  
   Toda la interacción con el usuario se realiza mediante JOptionPane para simplificar la entrada y salida de datos.

---

## 🛠️ Tecnologías y conceptos usados

- *Java*
- *NetBeans IDE*
- *Programación Orientada a Objetos*
  - Herencia: Alumno y Profesor heredan de Persona.
  - Polimorfismo: Métodos que se comportan distinto según la clase.
  - Abstracción: La superclase Persona define métodos generales que las subclases implementan.
  - Encapsulamiento: Atributos privados con getters y setters.

---

## 🚀 Cómo ejecutar el proyecto

1. Abrir *NetBeans* y crear un proyecto Java nuevo.
2. Copiar las clases dentro del paquete sistemaescolar.
3. Ejecutar la clase Principal.java.
4. Seguir las instrucciones en los cuadros de diálogo JOptionPane.

---

## 📘 Autor

*Evelin Pavón*
