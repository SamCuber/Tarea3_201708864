package ipc1.tarea3_201708864;

import java.util.Scanner;

public class IPC1Tarea3_201708864 {

    public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in);                                //Creo el escaner para poder leer los numeros que voy a ingresar del mennu
       
        System.out.println("______________________________");                   //En esta porcion de codigo solamente imprimo
        System.out.println("Ingrese el numero de la opcion");                   //todas las opciones posibles de mi menu
        System.out.println("");
        System.out.println("1. Usuarios");
        System.out.println("2. Contador de digitos");
        System.out.println("3. Tres numeros de mayor a menor");
        System.out.println("4. Calcular promedio");
        System.out.println("5. Salir");
        System.out.println("______________________________");
        System.out.println("");
        
        int numero = teclado.nextInt();                                         //declaro una variable para poner llamarla en el switch
        System.out.println("");
        
        switch(numero){                                                         //creo es switch con las opciones posibles de mi menu
            
            case 1:                                                             //en cada caso segun el numero, mando a llamar la clase a la que quiero accedere
                Usuarios.main(args);                                            // en este caso es a al main de la clase usuario
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
                
            case 5:                                                             //este caso solo me saca del programa
                break;
            default:                                                            //en el dado caso que no ingrese un numero de los que esta en el case me indica 
                System.out.println("Debes insertar un número entre 1 y 5");     //que escriba un numero entre 1 y 5 que son los posibles submenus y vuelve a llamar al
                IPC1Tarea3_201708864.main(args);                                //main de la clase principal
            }
        }
    }   
    

