package com.endes.ejercicio1;

import java.util.*;


/**
 * @version 1.0
 * @author Pablo
 * 
 * 
 * Class Libro
 */
public class Libro {

  //
  // Fields
  //
  private String titulo;
  private String autor;
  private String isbn;
  
  //
  // Constructors
  //
  public Libro () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of titulo
   * @param newVar the new value of titulo
   */
  public void setTitulo (String titulo) {
    this.titulo = titulo;
  }

  /**
   * Get the value of titulo
   * @return the value of titulo
   */
  public String getTitulo () {
    return titulo;
  }

  /**
   * Set the value of autor
   * @param newVar the new value of autor
   */
  public void setAutor (String autor) {
    this.autor = autor;
  }

  /**
   * Get the value of autor
   * @return the value of autor
   */
  public String getAutor () {
    return autor;
  }

  /**
   * Set the value of isbn
   * @param newVar the new value of isbn
   */
  public void setIsbn (String isbn) {
    this.isbn = isbn;
  }

  /**
   * Get the value of isbn
   * @return the value of isbn
   */
  public String getIsbn () {
    return isbn;
  }

  //
  // Other methods
  //

  /**
   */
  public void prestar()
  {
  }


  /**
   */
  public void devolver()
  {
  }


}
