/*
 * Clase Circulo de la práctica 4.
 */
package mpoo4;

/**
 *
 * @author Eleazar Humberto Guillen Lambarri
 */
public class Circulo {
    static double PI = Math.PI;
  private float radio;

  public Circulo(){
  }

  /**
   * 
   * @param radio Radio de tipo flotante.
   */
   public Circulo(float radio){
    this.radio=radio;
  }

   /**
    * 
    * @return Radio de tipo flotante.
    */
  public float getRadio(){
    return radio;
  }

  /**
   * 
   * @param radio Radio de tipo flotante.
   */
  public void setRadio(float radio){
    this.radio=radio;
  }

  /**
   * 
   * @return Perimetro de tipo flotante.
   */
public float perimetro (){
  return(float) (2*PI*radio);
}
/**
 * 
 * @return Area de tipo flotante.
 */
public float area (){
  return(float) (PI*radio*radio);
}

/**
 * 
 * @return Información del circulo en texto.
 */
    public String toString(){
  return "Circulo{"+"radio="+radio+'}'; 
}
}
