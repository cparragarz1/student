
package operaciones;


public class Division extends Operacion{
    public Division (double numero1,double numero2){
    super (numero1,numero2);
    }
    public void mostrarResultado() {
        if(numero2==0)System.out.println("No se puede dividir con el cero");
        else 
        resultado=numero1/numero2;
        super.mostraResultado();
    }
}