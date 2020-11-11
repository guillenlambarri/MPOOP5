/*
 * Clase Fecha de la práctica 4.
 */
package mpoo4;
import mpoo4.Fecha;
/**
 *
 * @author Eleazar Humberto Guillen Lambarri
 */
public class Fecha {
 private int dia;
 private int mes;
 private int anio;

public Fecha(){
}

/**
 * 
 * @param dia Dia de tipo entero.
 * @param mes Mes de tipo entero.
 * @param anio Año de tipo entero:
 */
public Fecha (int dia, int mes, int anio){
  this.dia=dia;
  this.mes=mes;
  this.anio=anio;
}
  
/**
 * 
 * @return Dia de tipo entero.
 */
  public int getDia(){
    return dia;
  }

  /**
   * 
   * @param dia Dia de tipo entero. 
   */
  public void setDia(int dia){
    this.dia=dia;
  }

  /**
   * 
   * @return Mes de tipo entero.
   */
  public int getMes(){
    return mes;
  }

  /**
   * 
   * @param mes Mes de tipo entero.
   */  
  public void setMes(int mes){
    this.mes=mes;
  }
  
  /**
   * 
   * @return Año de tipo entero.
   */
  public int getAnio(){
    return anio;
  }

  /**
   * 
   * @param anio Año de tipo entero.
   */
  public void setAnio(int anio){
    this.anio=anio;
  }
  
  /**
   * 
   * @return Información de la fecha en texto.
   */
  public String toString(){
    return "Fecha{" + "dia=" +dia+ ", mes=" +mes+ ", año=" +anio+ '}';
    }
    
}
