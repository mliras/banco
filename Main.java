
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
  public static void main(String args[])
  {
      Cliente yo=new Cliente("Luis", 99);
      
      yo.abrirCuenta();
      
      yo.ingresarDinero(3000);
      
      yo.sacarDinero(2000.59);
      
      yo.consultarSaldo();
      
  }
}
