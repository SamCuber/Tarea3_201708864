package ipc1.tarea3_201708864;

import java.util.Scanner;
import ipc1.tarea3_201708864.IPC1Tarea3_201708864;

public class Usuarios {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Ingrese el numero de la opcion");
        System.out.println("______________________________");
        System.out.println("1. Ingresar Usuarios");
        System.out.println("2. Mostrar Usuarios Ascecndentes");
        System.out.println("3. Mostrar Usuarios Descendentes");
        System.out.println("4. Menu Principal");
        System.out.println("______________________________");
        
        int numero = teclado.nextInt();
        
        
        switch(numero){
            
            case 1:
                Usuarios.main(args);
                break;
                
            case 2:
                ContadorDigitos.main(args);
                break;
                
            case 3:
                Numeros.main(args);
                break;
            
            case 4:
                IPC1Tarea3_201708864.main(args);
                break;
                
            default:
                System.out.println("Debes insertar un número entre 1 y 4");
        }
    }
    
    
    
}
