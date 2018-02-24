package ipc1.tarea3_201708864;

import java.util.Scanner;

public class Promedio {
    
    public static int id1[] = new int[1];                                       //declaro los id locales para acceder a ellos desde cualquier metodo
    public static int alumno1[] = new int[5];                                   //declaro la variable alumno para las notas 
    public static int suma1=0;                                                  //la suma de sus notas
    public static int promedio1;                                                //el promedio
    
    public static int id2[] = new int[1];
    public static int alumno2[] = new int[5];   
    public static int suma2=0;
    public static int promedio2;
    
    public static int id3[] = new int[1];
    public static int alumno3[] = new int[5];   
    public static int suma3=0;
    public static int promedio3;
    
    public static int id4[] = new int[1];
    public static int alumno4[] = new int[5];   
    public static int suma4=0;
    public static int promedio4;
    
    public static int id5[] = new int[1];
    public static int alumno5[] = new int[5];   
    public static int suma5=0;
    public static int promedio5;
    
    public static int id6[] = new int[1];
    public static int alumno6[] = new int[5];   
    public static int suma6=0;
    public static int promedio6;
    
    
    public static void main(String[] args) {                                    //metodo principal
        
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("_____________________________________________");
        System.out.println("Ingrese el id del alumno que desea registrar");     //vista del menu
        System.out.println("1. Alumno 1");
        System.out.println("2. Alumno 2");
        System.out.println("3. Alumno 3");
        System.out.println("4. Alumno 4");
        System.out.println("5. Alumno 5");
        System.out.println("6. Alumno 6");
        System.out.println("7. Ver tabla de notas");
        System.out.println("8. Menu Principal");
        System.out.println("_____________________________________________");
        System.out.println("");
        
        int numero = teclado.nextInt();     
        
        switch(numero){                                                         //posibles casos
            
            case 1:
                Promedio.alumno1(args);
                break;
                
            case 2:
                Promedio.alumno2(args);
                break;
                
            case 3:
                Promedio.alumno3(args);
                break;
            
            case 4:
                Promedio.alumno4(args);
                break;
                
            case 5:
                Promedio.alumno5(args);
                break;
                
            case 6:
                Promedio.alumno6(args);
                break;
                
            case 7:
                Promedio.matriz(args);
                break;
                
            case 8:
                IPC1Tarea3_201708864.main(args);
                break;
            default:
                System.out.println("Debes insertar un número entre 1 y 8");
                Promedio.main(args);
            }
        }
    
    public static void alumno1(String args[]){                                  //metodo para alumno 1
        Scanner teclado = new Scanner(System.in);                               //su escaner

        System.out.println("Ingresse las notas del alumno 1");
        id1[0]=1;                                                               //el id para cada uno sera igual al alumno
        alumno1[1]=teclado.nextInt();                                           //pido sus 4 notas con un arreglo o array
        alumno1[2]=teclado.nextInt();
        alumno1[3]=teclado.nextInt();
        alumno1[4]=teclado.nextInt();
        
        for (int i = 0; i < alumno1.length; i++) {                              //con un ciclo for le doy un inicio y un final segun el tamaño del alumno
            suma1+=alumno1[i];                                                  //hago la suma de sus notas
        }
        promedio1=(suma1/4);                                                    //calculo el promedio
        Promedio.main(args);                                                    //vuelvo al main
    }
                                                                                //para cada uno de los 6 usuarios es lo mismo
    public static void alumno2(String args[]){
        Scanner teclado = new Scanner(System.in);    
        
        System.out.println("Ingresse las notas del alumno 2");
        id2[0]=2;
        alumno2[1]=teclado.nextInt();
        alumno2[2]=teclado.nextInt();
        alumno2[3]=teclado.nextInt();
        alumno2[4]=teclado.nextInt();
        
        for (int i = 0; i < alumno2.length; i++) {
            suma2+=alumno2[i];  
        }
        promedio2=(suma2/4);
        Promedio.main(args);
        }
    
    public static void alumno3(String args[]){
        Scanner teclado = new Scanner(System.in);    
        
        System.out.println("Ingresse las notas del alumno 3");
        id3[0]=3;
        alumno3[1]=teclado.nextInt();
        alumno3[2]=teclado.nextInt();
        alumno3[3]=teclado.nextInt();
        alumno3[4]=teclado.nextInt();
        
        for (int i = 0; i < alumno3.length; i++) {
            suma3+=alumno3[i];   
        }
        promedio3=(suma3/4);
        Promedio.main(args);
        }
    
    public static void alumno4(String args[]){
        Scanner teclado = new Scanner(System.in);    
        
        System.out.println("Ingresse las notas del alumno 4");
        id4[0]=4;
        alumno4[1]=teclado.nextInt();
        alumno4[2]=teclado.nextInt();
        alumno4[3]=teclado.nextInt();
        alumno4[4]=teclado.nextInt();
        
        for (int i = 0; i < alumno4.length; i++) {
            suma4+=alumno4[i];            
        }
        promedio4=(suma4/4);
        Promedio.main(args);
        }
      
    public static void alumno5(String args[]){
        Scanner teclado = new Scanner(System.in);    
        
        System.out.println("Ingresse las notas del alumno 5");
        id5[0]=5;
        alumno5[1]=teclado.nextInt();
        alumno5[2]=teclado.nextInt();
        alumno5[3]=teclado.nextInt();
        alumno5[4]=teclado.nextInt();
        
        for (int i = 0; i < alumno5.length; i++) {
            suma5+=alumno5[i];           
        }
        promedio5=(suma5/4);  
        Promedio.main(args);
        }
    
    public static void alumno6(String args[]){
        Scanner teclado = new Scanner(System.in);    
        
        System.out.println("Ingresse las notas del alumno 6");
        id6[0]=6;
        alumno6[1]=teclado.nextInt();
        alumno6[2]=teclado.nextInt();
        alumno6[3]=teclado.nextInt();
        alumno6[4]=teclado.nextInt();
        
        for (int i = 0; i < alumno6.length; i++) {
            suma6+=alumno6[i];           
        }
        promedio6=(suma6/4);
        Promedio.main(args);
        }
    
    public static void matriz(String args[]){                                   //esta es la tabla final con todas las notas
                                                                                // imprimo el id del alumno y sus respectivas notas con la posicion del arreglo
        System.out.println(+id1[0]+ "   " +alumno1[1]+ "    " +alumno1[2]+ "    " + alumno1[3]+ "   " +alumno1[4]+ "    " +promedio1);
        System.out.println(+id2[0]+ "   " +alumno2[1]+ "    " +alumno2[2]+ "    " + alumno2[3]+ "   " +alumno2[4]+ "    " +promedio2);
        System.out.println(+id3[0]+ "   " +alumno3[1]+ "    " +alumno3[2]+ "    " + alumno3[3]+ "   " +alumno3[4]+ "    " +promedio3);
        System.out.println(+id4[0]+ "   " +alumno4[1]+ "    " +alumno4[2]+ "    " + alumno4[3]+ "   " +alumno4[4]+ "    " +promedio4);
        System.out.println(+id5[0]+ "   " +alumno5[1]+ "    " +alumno5[2]+ "    " + alumno5[3]+ "   " +alumno5[4]+ "    " +promedio5);
        System.out.println(+id6[0]+ "   " +alumno6[1]+ "    " +alumno6[2]+ "    " + alumno6[3]+ "   " +alumno6[4]+ "    " +promedio6);
        System.out.println("");

        Promedio.main(args);

    }
                            
                
}
