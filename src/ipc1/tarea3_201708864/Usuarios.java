package ipc1.tarea3_201708864;

import java.util.Scanner;

public class Usuarios {
    
    public static String usuario1;                                              //cree las variables de los usuarios de forma publica y statica para poder acceder 
    public static String usuario2;                                              //a ellas desde cualquier metodo
    public static String usuario3;
    public static String usuario4;
    public static String usuario5;
    
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);                               //creo el escanner
       
        System.out.println("______________________________");
        System.out.println("Ingrese el numero de la opcion");                   //imprimo mis posibles opciones del menu
        System.out.println("1. Ingresar Usuarios");
        System.out.println("2. Mostrar Usuarios Ascecndentes");
        System.out.println("3. Mostrar Usuarios Descendentes");
        System.out.println("4. Menu Principal");
        System.out.println("______________________________");
        System.out.println("");
        
        int numero = teclado.nextInt();                                         //declaro la varible para poder llamarla desde el switch
        System.out.println("");
        
        switch(numero){
            
            case 1:                                                             //creo mis posibles opciones de menu
                Usuarios.ingresar(args);                                        //mando a llamar la metodo que quiero en el case
                break;
                
            case 2:
                Usuarios.ascendente(args);
                break;
                
            case 3:
                Usuarios.descendente(args);
                break;
            
            case 4:
                IPC1Tarea3_201708864.main(args);
                break;
            default:
                System.out.println("Debes insertar un número entre 1 y 4");
                Usuarios.main(args);
                System.out.println("");
        }
    }
    
    public static void ingresar(String args[]){                                         //creo el metodo para ingresar los usuarios
        System.out.println("Si ingresa un usuario repetido se lo volverea a pedir");
        System.out.println("");
        System.out.println("Ingrese el usuario 1");
        Scanner teclado = new Scanner(System.in);
        usuario1=teclado.next();                                                //pido que ingrese y leo el usuario 1
        System.out.println("");
        do {                                                                    //pido el usuario 2 y con el un do-while hago la comparacion de el con el primero
            System.out.println("Ingrese el usuario 2");
            usuario2=teclado.next();
            System.out.println("");
        }while (comparacion(usuario2, "n2") == true);                           //creo un metodo a parte para poder hacer la comparacion, y al String le mando una cadena para poder identificar
                                                                                //el Stirng que estoy mandandno y asi se hace con los 5 usuarios
                     
        do {
            System.out.println("Inngrese el usuario 3");
            usuario3=teclado.next();
            System.out.println("");
        } while (comparacion(usuario3, "n3") == true);
        
        do {
            System.out.println("Inngrese el usuario 4");
            usuario4=teclado.next();
            System.out.println("");
        } while (comparacion(usuario4, "n4") == true);
        
        do {
            System.out.println("Inngrese el usuario 5");
            usuario5=teclado.next();
            System.out.println("");
        } while (comparacion(usuario5, "n5") == true);
        
        Usuarios.main(args);
        
    }
    
    public static boolean comparacion(String nombreUsuario, String identificador){          //aqui creo el metodo para comprara si un usuario ya esta registrado, y creo un identificador de la cadena
        if (identificador.equals("n2")) {                                                   //aqui llamo la cadena que registro el String
            if (nombreUsuario.equals(usuario1)) {                                           //le pondo un condicional para que lo vefirique si es igual al usuario 1
                return true;
            }
            return false;
        }else if(identificador.equals("n3")) {
            if (nombreUsuario.equals(usuario1)||nombreUsuario.equals(usuario2)) {           //lo mismo se hace con cada uno solo que se le agrega con quien lo voy a comparar
                return true;
            }
            return false;
        }else if (identificador.equals("n4")) {
            if (nombreUsuario.equals(usuario1)||nombreUsuario.equals(usuario2)||nombreUsuario.equals(usuario3)){
                return true;
            }
            return false;
        }else if(identificador.equals("n5")){
            if(nombreUsuario.equals(usuario1)||nombreUsuario.equals(usuario2)||nombreUsuario.equals(usuario3)||nombreUsuario.equals(usuario4)){
                return true;
            }
            return false;
            
        }
        return false;  
    }
    
        
    
    public static void descendente(String args[]){                              //el metodo para que muestre los usuarios de forma descendente
        System.out.println("Los usuarios de forma descendente son:");           //solo imprimo los usuario de uno en uno empezando por el primero
        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);
        System.out.println(usuario4);
        System.out.println(usuario5);
        System.out.println("");
        Usuarios.main(args);                                                    //vuelvo a llamar al main por si quiero hacer otra accion
        
    }
    
    public static void ascendente(String args[]){                               //el metodo para que muestre los usuarios de forma ascendente
        System.out.println("Los usuarios de forma ascendente son:");            //solo imprimo los usuario de uno en uno empezando por el ultimo
        System.out.println(usuario5);
        System.out.println(usuario4);
        System.out.println(usuario3);
        System.out.println(usuario2);
        System.out.println(usuario1);
        System.out.println("");
        Usuarios.main(args);                                                    //vuelvo a llamar al main por si quiero hacer otra accion
    }
}
