package App;

import java.util.Scanner;

/**
 *
 * @author FARID YESID RICO FURNIELES
 */
public class MyAppReport {

  
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        
        System.out.println("Ingresa el 1er número para la operación suma");
        int num1 = sc.nextInt();
        System.out.println("Ingresa el segundo número para la operación suma");
        int num2 = sc.nextInt();
        
        System.out.println("El resultado es: " + operaciones.suma(num1, num2));
        
        
        
    }
    
}
