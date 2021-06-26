/*
* @author Gustavo Alberto Vasquez Damaso
* Main.java
*/

import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    boolean logica = true;
    int opc, i=0, suma=0;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    Descendiente tecnico = new Descendiente();

    System.out.print("Ingrese la clave: ");
    tecnico.setClave(reader.readLine());

    System.out.print("Ingrese el nombre: ");
    tecnico.setNombre(reader.readLine());

    System.out.print("Ingrese la antiguedad: ");
    tecnico.setAntiguedad(Integer.parseInt(reader.readLine()));

    while(logica){
      System.out.println("\n\n>>>>>>>>>> Menu de pagos <<<<<<<<<<" +
                        "\n 1.Calcular sueldo por hora" +
                        "\n 2.Calcular sueldo por trabajo" +
                        "\n 3.Imprimir recibo de pago" +
                        "\n 4. Salir");
      System.out.print("\n Opcion: ");
      opc = Integer.parseInt(reader.readLine());

      if(opc == 1){
        System.out.print("\nIngrese el numero de horas trabajados: ");
        tecnico.setNumeroDeHoras(Integer.parseInt(reader.readLine()));

        System.out.print("Ingrese el precio por hora: ");
        tecnico.setPrecioPorHora(Float.parseFloat(reader.readLine()));

        tecnico.calcularQuincenaHora();
      }
      else if(opc == 2){
        System.out.print("Ingrese los que dedico de trabajo: ");
        tecnico.setNumeroDeDias(Integer.parseInt(reader.readLine()));

        System.out.print("\nIngrese el numero de trabajos: ");
        tecnico.setNumeroDeTrabajos(Integer.parseInt(reader.readLine()));

        while(i < tecnico.getNumeroDeTrabajos()){
          System.out.print("Ingrese el precio por trabajo: ");
          tecnico.setPrecioPorTrabajo(Float.parseFloat(reader.readLine()));
          tecnico.setPrecioPorTrabajo(suma += tecnico.getPrecioPorTrabajo());
          i++;
        }

        tecnico.calcularQuincenaTrabajo();
      }
      else if(opc == 3){
        System.out.println("\n\n>>>>>>>>>>>>>>> RECIBO DE PAGO QUINCENAL <<<<<<<<<<<<<<<");
        System.out.println("CLAVE: " + tecnico.getClave());
        System.out.println("NOMBRE: " + tecnico.getNombre());
        System.out.println("ANTIGUEDAD: " + tecnico.getAntiguedad());
        System.out.println("PAGO: " + tecnico.getSueldoQuincenal());

        logica = false;
      }
      else if(opc == 4){
        logica = false;
      }
      else
        System.out.println("ERROR, la opcion no existe");
    }
  }
}
