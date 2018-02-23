package ipc1.tarea3_201708864;

import java.util.Scanner;
import ipc1.tarea3_201708864.IPC1Tarea3_201708864;

public class Usuarios {
    
    public static String usuario[]= new String[5];
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Ingrese el numero de la opcion");
        System.out.println("______________________________");
        System.out.println("1. Ingresar Usuarios");
        System.out.println("2. Mostrar Usuarios Ascecndentes");
        System.out.println("3. Mostrar Usuarios Descendentes");
        System.out.println("4. Menu Principal");
        System.out.println("______________________________");
        System.out.println("");
        
        int numero = teclado.nextInt();
        
        
        switch(numero){
            
            case 1:
                Usuarios.ingresar(args);
                break;
                
            case 2:
                Usuarios.main(args);
                break;
                
            case 3:
                Usuarios.main(args);
                break;
            
            case 4:
                IPC1Tarea3_201708864.main(args);
                break;
                
            default:
                System.out.println("Debes insertar un número entre 1 y 4");
        }
    }
    
    public static void ingresar(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de 5 usuarios");
        usuario[0]=teclado.nextLine();
        usuario[1]=teclado.nextLine();
        usuario[2]=teclado.nextLine();
        usuario[3]=teclado.nextLine();
        usuario[4]=teclado.nextLine();
        
        for (int i = 1; i < usuario.length; i++) {
            System.out.println("Ingrese el nombre del usuario a buscar" +i);
            usuario[i]=teclado.nextLine();
            for (int j = 1; j < usuario.length; j++) {
                if (usuario[j].equals(usuario[i])) {
                    System.out.println("ya existe");
                    
                }
                
            }
        }
    }
    
}
