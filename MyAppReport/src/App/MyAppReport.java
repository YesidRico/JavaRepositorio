package App;

import java.util.Scanner;

/**
 *
 * @author FARID YESID RICO FURNIELES
 */
public class MyAppReport {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Operaciones operaciones = null;
        System.out.println("Ingrese la operación (+,-,*,/)");
        String operacion = sc.nextLine();

        switch (operacion) {

            case "+":
                System.out.println("Ingresa el 1er número para la operación suma");
                int sum1 = sc.nextInt();
                System.out.println("Ingresa el segundo número para la operación suma");
                int sum2 = sc.nextInt();
                operaciones = new Operaciones();
                System.out.println("El resultado es: " + operaciones.suma(sum1, sum2));
                break;

            case "-":
                System.out.println("Ingresa el 1er número para la operación resta");
                int res1 = sc.nextInt();
                System.out.println("Ingresa el segundo número para la operación resta");
                int res2 = sc.nextInt();
                operaciones = new Operaciones();
                System.out.println("El resultado es: " + operaciones.resta(res1, res2));
                break;

            case "*":
                System.out.println("Ingresa el 1er número para la operación multiplicación");
                int mul1 = sc.nextInt();
                System.out.println("Ingresa el segundo número para la operación multiplicación");
                int mul2 = sc.nextInt();
                operaciones = new Operaciones();
                System.out.println("El resultado es: " + operaciones.multiplicacion(mul1, mul2));
                break;

            case "/":
                System.out.println("Ingresa el 1er número para la operación divición");
                int div1 = sc.nextInt();
                System.out.println("Ingresa el segundo número para la operación divición");
                int div2 = sc.nextInt();
                operaciones = new Operaciones();
                System.out.println("El resultado es: " + operaciones.divicion(div1, div2));
                break;

            default:
                System.out.println("No es una operación valida");
                break;
        }

    }

}
