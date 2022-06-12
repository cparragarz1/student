
package operaciones;

public class Multiplicacion extends Operacion{
    
    public Multiplicacion (double numero1,double numero2){
    super (numero1,numero2);
    }
    public void mostrarResultado() {
        resultado=numero1*numero2;
        super.mostraResultado();
    }    
}
