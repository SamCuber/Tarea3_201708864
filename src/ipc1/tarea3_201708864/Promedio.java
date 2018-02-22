package ipc1.tarea3_201708864;

import java.util.Scanner;

public class Promedio {
    
    public static int alumno1[] = new int[4];   
    public static int suma1=0;
    public static float promedio1;
    
    public static int alumno2[] = new int[4];   
    public static int suma2=0;
    public static float promedio2;
    
    public static int alumno3[] = new int[4];   
    public static int suma3=0;
    public static float promedio3;
    
    public static int alumno4[] = new int[4];   
    public static int suma4=0;
    public static float promedio4;
    
    public static int alumno5[] = new int[4];   
    public static int suma5=0;
    public static float promedio5;
    
    public static int alumno6[] = new int[4];   
    public static int suma6=0;
    public static float promedio6;
    
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Ingrese el id del alumno que desea registrar");
        System.out.println("______________________________");
        System.out.println("1. Alumno 1");
        System.out.println("2. Alumno 2");
        System.out.println("3. Alumno 3");
        System.out.println("4. Alumno 4");
        System.out.println("5. Alumno 5");
        System.out.println("6. Alumno 6");
        System.out.println("7. Menu Principal");
        System.out.println("______________________________");
        System.out.println("");
        
        int numero = teclado.nextInt();
        
        
        switch(numero){
            
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
                IPC1Tarea3_201708864.main(args);
                break;
            default:
                System.out.println("Debes insertar un número entre 1 y 7");
            }
        }
    
    public static void alumno1(String args[]){
        Scanner teclado = new Scanner(System.in);    

        System.out.println("Ingresse las notas del alumno 1");
        alumno1[0]=teclado.nextInt();
        alumno1[1]=teclado.nextInt();
        alumno1[2]=teclado.nextInt();
        alumno1[3]=teclado.nextInt();
        
        for (int i = 0; i < alumno1.length; i++) {
            suma1+=alumno1[i];           
        }
        promedio1=(suma1/alumno1.length);
        Promedio.main(args);
    }
    
    public static void alumno2(String args[]){
        Scanner teclado = new Scanner(System.in);    
        
        System.out.println("Ingresse las notas del alumno 2");
        alumno2[0]=teclado.nextInt();
        alumno2[1]=teclado.nextInt();
        alumno2[2]=teclado.nextInt();
        alumno2[3]=teclado.nextInt();
        
        for (int i = 0; i < alumno2.length; i++) {
            suma2+=alumno2[i];  
        }
        promedio2=(suma2/alumno2.length);
        Promedio.main(args);
        }
    
    public static void alumno3(String args[]){
        Scanner teclado = new Scanner(System.in);    
        
        System.out.println("Ingresse las notas del alumno 3");
        alumno3[0]=teclado.nextInt();
        alumno3[1]=teclado.nextInt();
        alumno3[2]=teclado.nextInt();
        alumno3[3]=teclado.nextInt();
        
        for (int i = 0; i < alumno3.length; i++) {
            suma3+=alumno3[i];   
        }
        promedio3=(suma3/alumno3.length);
        Promedio.main(args);
        }
    
    public static void alumno4(String args[]){
        Scanner teclado = new Scanner(System.in);    
        
        System.out.println("Ingresse las notas del alumno 4");
        alumno4[0]=teclado.nextInt();
        alumno4[1]=teclado.nextInt();
        alumno4[2]=teclado.nextInt();
        alumno4[3]=teclado.nextInt();
        
        for (int i = 0; i < alumno4.length; i++) {
            suma4+=alumno4[i];            
        }
        promedio4=(suma4/alumno4.length);
        Promedio.main(args);
        }
      
    public static void alumno5(String args[]){
        Scanner teclado = new Scanner(System.in);    
        
        System.out.println("Ingresse las notas del alumno 5");
        alumno5[0]=teclado.nextInt();
        alumno5[1]=teclado.nextInt();
        alumno5[2]=teclado.nextInt();
        alumno5[3]=teclado.nextInt();
        
        for (int i = 0; i < alumno5.length; i++) {
            suma5+=alumno5[i];           
        }
        promedio5=(suma5/alumno5.length);  
        Promedio.main(args);
        }
    
    public static void alumno6(String args[]){
        Scanner teclado = new Scanner(System.in);    
        
        System.out.println("Ingresse las notas del alumno 6");
        alumno6[0]=teclado.nextInt();
        alumno6[1]=teclado.nextInt();
        alumno6[2]=teclado.nextInt();
        alumno6[3]=teclado.nextInt();
        
        for (int i = 0; i < alumno6.length; i++) {
            suma6+=alumno6[i];           
        }
        promedio6=(suma6/alumno6.length);
        Promedio.main(args);
        }
                            
}                  

