package ipc1.tarea3_201708864;

import java.util.Scanner;

public class ContadorDigitos {
    
    public static void main(String[] args) {
        
        System.out.println("");
        System.out.println("Ingrese el numero de la opcion");
        System.out.println("______________________________");
        System.out.println("1. Ingresar Numero");
        System.out.println("2. Mostrar Numero de Digitos");
        System.out.println("3. Menu Principal");
        System.out.println("______________________________");
        System.out.println("");
        
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        System.out.println("");
        
        switch(numero){
            
            case 1:
                ContadorDigitos.ingresar(args);
                break;
                
            case 2:
                ContadorDigitos.main(args);
                break;
            case 3:
                IPC1Tarea3_201708864.main(args);
                break;                
            default:
                System.out.print("Debes insertar un número entre 1 y 3");
                ContadorDigitos.main(args);
            }
    }
    
    public static void ingresar(String args[]){
        System.out.println("Ingrese un numero entre 0 y 1000");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        {
        System.out.println("El número " + n + " tiene " + Integer.toString(n).length() + " dígitos");
            System.out.println("");
        ContadorDigitos.main(args);
     }
    }
    
}
