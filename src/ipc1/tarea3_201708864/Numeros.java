package ipc1.tarea3_201708864;

import java.util.Scanner;

public class Numeros {
    
    public static int a;                                                        //variables locales para los tres numeros
    public static int b;
    public static int c;
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);                               //scanner
       
        System.out.println("______________________________");                   //vista del menu
        System.out.println("Ingrese el numero de la opcion");
        System.out.println("");
        System.out.println("1. Ingrese 3 Numeros");
        System.out.println("2. Mostrar ordenados");
        System.out.println("3. Menu Principal");
        System.out.println("______________________________");
        System.out.println("");
        
        int numero = teclado.nextInt();                                         //variable para la opcion
        System.out.println("");
        
        
        switch(numero){                                                         //switch con los posibles casos
            
            case 1:
                Numeros.ingresar(args);
                break;
                
            case 2:
                Numeros.mostrar(args);
                break;
                
            case 3:
                IPC1Tarea3_201708864.main(args);
                break;
            default:
                System.out.println("Debes insertar un número entre 1 y 3");
                Numeros.main(args);
            }
        }
    
        
        public static void ingresar(String args[]){                             //metodo para ingresar
            
            Scanner teclado = new Scanner(System.in);
            
            
            System.out.println("Ingrese 3 numeros");                            //pido los 3 numeros y los escaneo
            a=teclado.nextInt();
            b=teclado.nextInt();
            c=teclado.nextInt(); 
            System.out.println("");
            Numeros.main(args);                                                 //vuelvo al menu
        }
        
        public static void mostrar(String args[]){                              //metodo para analizarlos y ordenarlos
             if (a>=b && b>=c){                                                 //condicional
                System.out.println("");
                System.out.println("El orden de los numeros es: " + a + ", " + b + ", " + c);       //si lo cumple lo imprimo si no pasa al siguiente hasta que encuentra uno que cumpla
                Numeros.main(args);
            }else{
                if (a>=c && c>=b) {
                    System.out.println("");
                    System.out.println("El orden de los numeros es: " + a + ", " + c + ", " + b);
                    System.out.println("");
                    Numeros.main(args);
                }else{
                    if (b>=a && a>=c) {
                        System.out.println("");
                        System.out.println("El orden de los numeros es: " + b + ", " + a + ", " + c);
                        System.out.println("");
                        Numeros.main(args);
                    }else{
                        if (b>=c && c>=a) {
                            System.out.println("");
                            System.out.println("El orden de los numeros es: " + b + ", " + c + ", " + a);
                            System.out.println("");
                            Numeros.main(args);
                        }else{
                            if (c>=a && a>=b) {
                                System.out.println("");
                                System.out.println("El orden de los numeros es: " + c + ", " + a + ", " + b);
                                System.out.println("");
                                Numeros.main(args);
                            }else{
                                    System.out.println("");
                                    System.out.println("El orden de los numeros es: " + c + ", " + b + ", " + a);
                                    System.out.println("");
                                    Numeros.main(args);                       
                            }
                        }
                    }
                }
            }
        }
    }   