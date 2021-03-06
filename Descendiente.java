/*
* @author Gustavo Alberto Vasquez Damaso
* Descendiente.java
*/

public class Descendiente extends Antepasado{

  private int numeroDeHoras;
  private float precioPorHora;
  private int numeroDeTrabajos;
  private float precioPorTrabajo;
  /*informacion adicional*/
  private float bono;
  private int tipoEmpleado;
  private int numeroDeDias;

  public void calcularQuincenaHora(){
    validarPorcentaje();
    setSueldoQuincenal(numeroDeHoras * precioPorHora);
    setSueldoQuincenal(getSueldoQuincenal() + (getSueldoQuincenal() * bono));
  }

  public void calcularQuincenaTrabajo(){
    validarPorcentaje();
    if(numeroDeDias == 1){
      setPagoAdicional(100.0f);
    }
    setSueldoQuincenal(precioPorTrabajo);
    setSueldoQuincenal(getPagoAdicional() + getSueldoQuincenal() + (getSueldoQuincenal() * bono));
  }

  private void validarPorcentaje(){
    if(getAntiguedad() > 10){
      bono = 12.5f/100;
    } else{
      bono = 4.7f/100;
    }
  }

  /* metodos set() */
  public void setNumeroDeHoras(int numeroDeHoras){
    this.numeroDeHoras = numeroDeHoras;
  }

  public void setPrecioPorHora(float precioPorHora){
    this.precioPorHora = precioPorHora;
  }

  public void setNumeroDeTrabajos(int numeroDeTrabajos){
    this.numeroDeTrabajos = numeroDeTrabajos;
  }

  public void setPrecioPorTrabajo(float precioPorTrabajo){
    this.precioPorTrabajo = precioPorTrabajo;
  }

  public void setBono(float bono){
    this.bono = bono;
  }

  public void setTipoEmpleado(int tipoEmpleado){
    this.tipoEmpleado = tipoEmpleado;
  }

  public void setNumeroDeDias(int numeroDeDias){
    this.numeroDeDias = numeroDeDias;
  }
  /* metodos set() */
  public int getNumeroDeHoras(){ return numeroDeHoras; }

  public float getPrecioPorHora(){ return precioPorHora; }

  public int getNumeroDeTrabajos(){ return numeroDeTrabajos; }

  public float getPrecioPorTrabajo(){ return precioPorTrabajo; }

  public float getBono(){ return bono; }

  public int getTipoEmpleado(){ return tipoEmpleado; }

  public int getNumeroDeDias(){ return numeroDeDias; }
}
