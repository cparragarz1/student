
package operaciones;


public class Resta  extends Operacion{
    public Resta (double numero1,double numero2){
    super (numero1,numero2);
    }
    public void mostrarResultado() {
        resultado=numero1-numero2;
        super.mostraResultado();
    }
   
    }

