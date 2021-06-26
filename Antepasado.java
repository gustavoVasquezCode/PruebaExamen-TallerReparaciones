/*
* @author Gustavo Alberto Vasquez Damaso
* Antepasado.java
*/

public class Antepasado{

  private String clave;
  private String nombre;
  private int antiguedad;
  private float sueldoQuincenal;
  private float pagoAdicional;

  public void setClave(String clave){
    this.clave = clave;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void setAntiguedad(int antiguedad){
    this.antiguedad = antiguedad;
  }

  public void setSueldoQuincenal(float sueldoQuincenal){
    this.sueldoQuincenal = sueldoQuincenal;
  }

  public void setPagoAdicional(float pagoAdicional){
    this.pagoAdicional = pagoAdicional;
  }

  /* metodos get() */
  public String getClave(){
    return clave;
  }

  public String getNombre(){
    return nombre;
  }

  public int getAntiguedad(){
    return antiguedad;
  }

  public float getSueldoQuincenal(){
    return sueldoQuincenal;
  }

  public float getPagoAdicional(){
    return pagoAdicional;
  }

}
