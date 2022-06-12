
package operaciones;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Operaciones {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        double numero1=0;
    double numero2=0;
        Scanner sn=new Scanner(System.in);
        boolean salir = false;
        int opcion;
        System.out.println("Hola buenos dias ");
         System.out.println("vamos a calcular dos numeros con las operaciones basicas ");
        System.out.println(" introduce el primer numero:");
        numero1=sn.nextDouble();
        System.out.println(" introduce el segundo numero:");
        ;numero2=sn.nextDouble();
        while(salir);
        System.out.println("1. calcular suma");
        System.out.println("2. calcular resta");
        System.out.println("3. calcular division");
        System.out.println("4. calcular multiplicacion");
        System.out.println("5. salir");
        System.out.println("Por favor seleccione la opcion que desea calcular");
            opcion= sn.nextInt();
            switch (opcion){
                case 1:   
                  Suma suma = new Suma(numero1,numero2);
                  suma.mostrarResultado();
                  break;
                case 2:
                  Resta resta = new Resta(numero1,numero2);
                  resta.mostrarResultado();
                  break;
                case 3:
                   Division division  = new Division (numero1,numero2);
                   division.mostrarResultado();
                   break;
                case 4:
                    Multiplicacion multiplicacion  = new Multiplicacion (numero1,numero2);
                    multiplicacion.mostrarResultado();
                    break;
                    case 5:
                        salir=true;
                        break;
                        default:
                           System.out.println("solo las opciones entre 1 y 4 :  ");       
    }
    } 
}
