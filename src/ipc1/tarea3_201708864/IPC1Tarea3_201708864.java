package ipc1.tarea3_201708864;

import java.util.Scanner;
import java.util.InputMismatchException;
import ipc1.tarea3_201708864.Usuarios;
import ipc1.tarea3_201708864.ContadorDigitos;
import ipc1.tarea3_201708864.Numeros;
import ipc1.tarea3_201708864.Promedio;

public class IPC1Tarea3_201708864 {

    public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("Ingrese el numero de la opcion");
        System.out.println("______________________________");
        System.out.println("1. Usuarios");
        System.out.println("2. Contador de digitos");
        System.out.println("3. Tres numeros de mayor a menor");
        System.out.println("4. Calcular promedio");
        System.out.println("5. Salir");
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
                Promedio.main(args);
                break;
                
            case 5:
                break;
            default:
                System.out.println("Debes insertar un número entre 1 y 5");
            }
        }
    }   
    

