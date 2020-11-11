/*
 * Clase Persona de la práctica 4.
 */
package mpoo4;

/**
 *
 * @author Eleazar Humberto Guillen Lambarri
 */
public class Persona {
    private String nombre;
  private String apellido;
  private Fecha fNacimiento;

  
  /**
   * 
   * @param nombre Nombre tipo String.
   * @param apellido Apellido tipo String.
   * @param fNacimiento Fecha de nacimiento tipo Fecha.
   */
  public Persona(String nombre, String apellido, Fecha fNacimiento){
   this.nombre=nombre;
   this.apellido=apellido;
   this.fNacimiento=fNacimiento;
  }

  public Persona(){
  }

  /**
   * 
   * @param nombre Nombre tipo String.
   * @param apellido Apellido tipo String.
   * @param dia Dia tipo entero.
   * @param mes Mes tipo entero.
   * @param anio Año tipo entero.
   */
  public Persona(String nombre, String apellido, int dia, int mes, int anio){
   this.nombre=nombre;
   this.apellido=apellido;
   this.fNacimiento=new Fecha(dia,mes,anio);
  }
  
   /**
    * 
    * @return Nombre tipo String.
    */
   public String getNombre(){
     return nombre;
   }
   
   /**
    * 
    * @param nombre Nombre tipo String. 
    */
   public void setNombre(String nombre){
     this.nombre=nombre;
   }

   /**
    * 
    * @return Apellido tipo String.
    */
  public String getApellido(){
     return apellido;
   }

  /**
   * 
   * @param apellido Apellido tipo String.
   */
  public void setApellido(String apellido){
     this.apellido=apellido; 
  }

  /**
   * 
   * @return Fecha de Nacimiento de tipo Fecha.
   */
  public Fecha getfNacimiento(){
    return fNacimiento;
  }

  /**
   * 
   * @param fNacimiento Fecha de Nacimiento de tipo Fecha.
   */
  public void setfNacimiento(Fecha fNacimiento){
    this.fNacimiento=fNacimiento;
  }

    /**
     * 
     * @return Información de la persona en texto.
     */
  public String toString(){
    return "Persona{" + "nombre="+ nombre + ", apellido="
+apellido+", fNacimiento=" +fNacimiento + '}';
  }
}
