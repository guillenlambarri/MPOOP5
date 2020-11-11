/*
 * Clase Triangulo de la práctica 4.
 */
package mpoo4;

/**
 *
 * @author Eleazar Humberto Guillen Lambarri
 */
public class Triangulo {
     private float cateto1;
  private float cateto2;
  private float angulo1;
  private float angulo2;
  private float hipotenusa;

  public Triangulo(){
  }

  /**
  *
  *@param cateto1 Cateto A de tipo real
  *@param cateto2 Cateto B de tipo real
  */

  public Triangulo(float cateto1, float cateto2){
   this.cateto1=cateto1;
   this.cateto2=cateto2;
   hipotenusa();
   angulos();
  }

  /**
  *
  *@return Cateto 1 Metodo get cateto 1
  */
  public float getCateto1(){
    return cateto1;
  }
/**
 * 
 * @param cateto1 Cateto A de tipo flotante
 */
  public void setCateto1(float cateto1){
    this.cateto1=cateto1;
  }
  /**
   * 
   * @return cateto2 Cateto B de tipo flotante
   */
  public float getCateto2(){
    return cateto2;
  }
  
/**
 * 
 * @param cateto2 Cateto B de tipo flotante
 */
  public void setCateto2(float cateto2){
    this.cateto2=cateto2;
  }

  /**
   * 
   * @return angulo1 Angulo A de tipo flotante
   */
  public float getAngulo1(){
    return angulo1;
  }

  /**
   * 
   * @param angulo1 Angulo A de tipo flotante 
   */
  public void setAngulo1(float angulo1){
    this.angulo1=angulo1;
  }
  
  /**
   * 
   * @return Angulo B de tipo flotante
   */
  public float getAngulo2(){
    return angulo2;
  }
  
  /**
   * 
   * @param angulo2 Angulo B de tipo flotante 
   */
  public void setAngulo2(float angulo2){
    this.angulo2=angulo2;
  }
  
  /**
   * 
   * @return hipotenusa de tipo flotante
   */
  public float getHipotenusa(){
    return hipotenusa;
  }
  
  /**
   * 
   * @param hipotenusa Hipotenusa de tipo flotante
   */
  public void setHipotenusa(float hipotenusa){
    this.hipotenusa=hipotenusa;
  }

  /**
   * 
   * @return Texto de información de triangulo.
   */
  public String toString(){
  return "Triangulo{"+"cateto1="+cateto1+", cateto2="+cateto2+", angulo1="+angulo1+", angulo2="+angulo2+ ", hiponusa="+hipotenusa+'}';
  }

  /**
   * Función para obtener la hipotenusa
   */
  private void hipotenusa(){
    this.hipotenusa=(float) Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2,2));
  }

  /**
   * Función para obtener los angulos A y B.
   */  
  private void angulos(){
    this.angulo1=(float)Math.toDegrees(Math.atan(cateto2/cateto1));
    this.angulo2=180-(90+angulo1);
  }
  
  /**
   * 
   * @return Area del triangulo de tipo flotante.
   */
  public float area(){
    return cateto1*cateto2/2;
  }
  
  
  /**
   * 
   * @return Perimetro del triangulo de tipo flotante. 
   */
  public float perimetro(){
    return cateto1+cateto2+hipotenusa;
  }
}
