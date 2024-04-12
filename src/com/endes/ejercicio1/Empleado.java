package com.endes.ejercicio1;

import java.util.*;

/**
 * Class Empleado
 */
public class Empleado {

  //
  // Fields
  //

  private String nombre;
  private String idEmpleado;
  
  //
  // Constructors
  //
  public Empleado () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String nombre) {
    this.nombre = nombre;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of idEmpleado
   * @param newVar the new value of idEmpleado
   */
  public void setIdEmpleado (String idEmpleado) {
    this.idEmpleado = idEmpleado;
  }

  /**
   * Get the value of idEmpleado
   * @return the value of idEmpleado
   */
  public String getIdEmpleado () {
    return idEmpleado;
  }

  //
  // Other methods
  //

  /**
   * @param        libro
   * @param        miembro
   */
  public void procesarPrestamo(Libro libro, Miembro miembro)
  {
  }


  /**
   * @param        libro 
   * @param        miembro
   */
  public void procesarDevolucion(Libro libro, Miembro miembro)
  {
  }


}
