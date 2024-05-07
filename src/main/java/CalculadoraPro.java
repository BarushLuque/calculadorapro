import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class CalculadoraPro {

    public static void main(String[] args) {
        //Hola mi bros
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer digito.");
        int numero1= sc.nextInt();
        
        System.out.println("Ingresa el segundo digito.");
        int numero2= sc.nextInt();
        
        System.out.println("Elige el operador que deseas usar: suma(1), resta(2), multiplicacion(3), division(4)");
        int valor=sc.nextInt();
        
        if (valor == 1 ) {
            int resultado = numero1 + numero2;
            System.out.println("El resultado de la suma es: " + resultado);
            /*
            subido al octogato mi apa
            */
        }
        else if (valor == 2) {
            int resultado = numero1 - numero2;
            System.out.println("El resultado de la resta es: " + resultado);
        }
        else if (valor == 3) {
            int resultado = numero1 * numero2;
            System.out.println("El resultado de la multiplicacion es: " + resultado);
        }
        else if (valor == 4) {
            int resultado = numero1 / numero2;
            System.out.println("El resultado de la division es: " + resultado);
        } else {
            System.out.println("Error");
        }
        
    } catch (Exception ex) {
        System.out.println("No es posible la operacion, tonto.");
    }
}
}