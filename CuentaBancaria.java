
/**
 * Write a description of class CuentaBancaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaBancaria
{
  double saldo;
  double tipo_de_interes;
  Cliente propietario;
  
   public CuentaBancaria()
   {
       saldo=0;
       tipo_de_interes=2.95;
   }
  
   public void consultarSaldo()
    {
        System.out.println(saldo);
    }
  
    public void introducirDinero(double cantidad)
    {
        saldo=saldo+cantidad;

        System.out.println("Tras ingresar " + cantidad + " euros. Ahora tengo " + saldo);
    }
    
    public void sacarDinero(double cantidad)
    {
        saldo=saldo-cantidad;

        System.out.println("Tras sacar " + cantidad + " euros. Ahora tengo " + saldo);
    }
    
    
}
