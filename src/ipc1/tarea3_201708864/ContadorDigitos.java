package ipc1.tarea3_201708864;

import java.util.Scanner;

public class ContadorDigitos {
    
    public static int numero;                                                   //variable local para el digito
    
    public static void main(String[] args) {                                    //main
        
        System.out.println("______________________________");                   //opciones del menu
        System.out.println("Ingrese el numero de la opcion");
        System.out.println("");
        System.out.println("1. Ingresar Numero");
        System.out.println("2. Mostrar Numero de Digitos");
        System.out.println("3. Menu Principal");
        System.out.println("______________________________");
        System.out.println("");
        
        Scanner teclado = new Scanner(System.in);                               //escaner y variable para las opciones
        int numero = teclado.nextInt();
        System.out.println("");
        
        switch(numero){                                                         //posibles casos
            
            case 1:
                ContadorDigitos.ingresar(args);
                break;
                
            case 2:
                ContadorDigitos.mostrar(args);
                break;
            case 3:
                IPC1Tarea3_201708864.main(args);
                break;                
            default:
                System.out.print("Debes insertar un número entre 1 y 3");
                ContadorDigitos.main(args);
            }
    }
    
    public static void ingresar(String args[]){                                 //metodo para ingresar el digito
        System.out.println("Ingrese un numero entre 0 y 100,000");
        Scanner teclado = new Scanner(System.in);
        
        do {
            numero=teclado.nextInt();                                           //pido un numero
            System.out.println("Debe ingresar un numero menor a 100,000");
        } while (validacionNumero(numero)== true);                              //creo un motodo para verificar que el numero tenga un rango
        
        ContadorDigitos.main(args);
      
        
    }
    
    public static boolean validacionNumero(int numero){                         //metodo para validar el numereo
        if(numero >=100000){                                                    //condicional
                return true;
            
        }
        return false;
           
    }
    
    public static void mostrar(String args[]){                                  //metodo para mostar los digitos    
        System.out.println("El número " + numero + " tiene " + Integer.toString(numero).length() + " dígitos");         //imprimo el numero, luego con la variable para conttar los digitos lo analizo
        ContadorDigitos.main(args);
     
    }
    
}
