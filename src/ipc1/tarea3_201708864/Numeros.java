package ipc1.tarea3_201708864;

import java.util.Scanner;

public class Numeros {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Ingrese el numero de la opcion");
        System.out.println("______________________________");
        System.out.println("1. Ingrese 3 Numeros");
        System.out.println("2. Mostrar ordenados");
        System.out.println("3. Menu Principal");
        System.out.println("______________________________");
        System.out.println("");
        
        int numero = teclado.nextInt();
        System.out.println("");
        
        
        switch(numero){
            
            case 1:
                Numeros.ingresar(args);
                break;
                
            case 2:
                ContadorDigitos.main(args);
                break;
                
            case 3:
                IPC1Tarea3_201708864.main(args);
                break;
            default:
                System.out.println("Debes insertar un número entre 1 y 5");
            }
        }
    
        
        public static void ingresar(String args[]){
            
            Scanner teclado = new Scanner(System.in);
            int a, b, c;
            
            System.out.println("Ingrese 3 numeros");
            System.out.println("");
            a=teclado.nextInt();
            b=teclado.nextInt();
            c=teclado.nextInt();
            
            if (a>=b && b>=c){
                System.out.println("");
                System.out.println("El orden de los numeros es:" + a + "," + b + "," + c);
                Numeros.main(args);
            }else{
                if (a>=c && c>=b) {
                    System.out.println("");
                    System.out.println("El orden de los numeros es:" + a + "," + c + "," + b);
                    System.out.println("");
                    Numeros.main(args);
                }else{
                    if (b>=a && a>=c) {
                        System.out.println("");
                        System.out.println("El orden de los numeros es:" + b + "," + a + "," + c);
                        System.out.println("");
                        Numeros.main(args);
                    }else{
                        if (b>=c && c>=a) {
                            System.out.println("");
                            System.out.println("El orden de los numeros es:" + b + "," + c + "," + a);
                            System.out.println("");
                            Numeros.main(args);
                        }else{
                            if (c>=a && a>=b) {
                                System.out.println("");
                                System.out.println("El orden de los numeros es:" + c + "," + a + "," + b);
                                System.out.println("");
                                Numeros.main(args);
                            }else{
                                    System.out.println("");
                                    System.out.println("El orden de los numeros es:" + c + "," + b + "," + a);
                                    System.out.println("");
                                    Numeros.main(args);                       
                            }
                        }
                    }
                }
            }
        }
    }   