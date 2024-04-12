package com.endes.ejercicio1;

import java.util.*;


/**
 * Class Miembro
 */
public class Miembro {

  //
  // Fields
  //

  private String nombre;
  private String idMiembro;
  
  //
  // Constructors
  //
  public Miembro () { };
  
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
   * Set the value of idMiembro
   * @param newVar the new value of idMiembro
   */
  public void setIdMiembro (String idMiembro) {
    this.idMiembro = idMiembro;
  }

  /**
   * Get the value of idMiembro
   * @return the value of idMiembro
   */
  public String getIdMiembro () {
    return idMiembro;
  }

  //
  // Other methods
  //

  /**
   * @param        libro
   */
  public void prestarLibro(Libro libro)
  {
  }


}
