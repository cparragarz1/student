
package operaciones;
public class Operacion {
    public static void main(String arg){
        
    }
    protected double numero1;
    protected double numero2;
    protected double resultado;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado=0;
    }
    public void mostraResultado()
    { 
        System.out.println("El resultado es :"+this.resultado);
}  
}
