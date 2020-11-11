/*
 * Practica 5 "Documentación"
 */
package mpoo4;

import mpoo4.Triangulo;
import mpoo4.Circulo;
import mpoo4.Persona;
/**
 *
 * @author Eleazar Humberto Guillen Lambarri
 */
class MPOO4{
     public static void main(String[] args) {
  System.out.println("  ");
  Circulo cir1=new Circulo();
  cir1.setRadio(3.4f);
  System.out.println("Radio circulo 1= "+cir1.getRadio());
  

  Circulo cir2=new Circulo(6.0f);
  System.out.println("Radio circulo 2= "+cir2.getRadio());
  cir2.setRadio(9.0f);
  System.out.println("Radio circulo 2= "+cir2.getRadio());

  System.out.println("Info circulo 1: "+cir1.toString());
  System.out.println("Info circulo 1: "+cir2.toString());
System.out.println("1**************************");
  Persona amigo =new Persona();
  System.out.println("Info amigo "+amigo.toString());
  amigo.setNombre("Juan");
  amigo.setApellido("Ramirez");
  amigo.setfNacimiento(new Fecha(29,1,2000));
  System.out.println("Info amigo "+amigo.toString());
  System.out.println("Info amigo "+amigo);
System.out.println("2**************************");
Persona persona = new Persona("Jose","Rodriguez",4,8,1990);
System.out.println("Info persona"+persona);
System.out.println("3**************************");
Triangulo triangulo=new Triangulo(12,8);
System.out.println("Info Triangulo= "+triangulo);
  }
}
