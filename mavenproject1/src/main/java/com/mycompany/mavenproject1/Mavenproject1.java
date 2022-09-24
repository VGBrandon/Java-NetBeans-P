/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author eldan
 */
public class Mavenproject1 {

    public static void main(String[] args) throws IOException {
        /*
        String nombre = "Brandon";
        Integer edad = 23;
        String frase = "Hola, mi nombre es " + nombre + ". Tengo " + edad + " años";
        System.out.println(frase);
        */
        
        /*
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        System.out.println("Ingrese su edad:");
        String strEdad = buffer.readLine();
        Integer edad = Integer.parseInt(strEdad);        
        
        Boolean esMayorDeEdad = edad >= 18;
        
         if(esMayorDeEdad){
             System.out.println("Es mayor de edad");
         }else{
             System.out.println("Es menor de edad");
         }
        */
        
        /*
        //Ejercicio 1: Calcular el numero mayor y el menor 
        
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        
        System.out.println("Ingrese el primer numero:");
        String strNumero1 = buffer.readLine();
        //Convirtiendo string a entero
        Integer numero1 = Integer.parseInt(strNumero1);
        
        System.out.println("Ingrese el segundo numero:");
        String strNumero2 = buffer.readLine();
        //Convirtiendo string a entero
        Integer numero2 = Integer.parseInt(strNumero2);
        
        System.out.println("Ingrese el tercer numero:");
        String strNumero3 = buffer.readLine();
        //Convirtiendo string a entero
        Integer numero3 = Integer.parseInt(strNumero3);
        
         Integer numeroMayor =numero1;
         
        //Condicional para saber el numero mayor
         if(numero2 > numeroMayor){
             numeroMayor = numero2;
         }
         if(numero3 > numeroMayor){
             numeroMayor = numero3;
         }
         
        System.out.println("El numero mayor es " + numeroMayor);
         
        Integer numeroMenor =numero1;
         
        //Condicional para saber el numero menor
         if(numero2 < numeroMenor){
             numeroMenor = numero2;
         }
         if(numero3 < numeroMenor){
             numeroMenor = numero3;
         }
         
        System.out.println("El numero menor es " + numeroMenor);
        */
        
        /*
        //Mismo ejercicio pero usando funciones
        
        System.out.println("Ingrese el primer numero:");
        //Convirtiendo string a entero con funcion
        Integer numero1 = cargarNumero();
        
        System.out.println("Ingrese el segundo numero:");
        //Convirtiendo string a entero con funcion
        Integer numero2 = cargarNumero();
        
        System.out.println("Ingrese el tercer numero:");
        //Convirtiendo string a entero con funcion
        Integer numero3 = cargarNumero();
        
        calcularNumeroMayor(numero1, numero2, numero3);
        calcularNumeroMenor(numero1, numero2, numero3);
        */
        
        /*
        //Ejercicio 2: Calcular promedio
        
        System.out.println("Ingrese el primer numero:");
        //Convirtiendo string a entero con funcion
        Integer numero1 = cargarNumero();
        
        System.out.println("Ingrese el segundo numero:");
        //Convirtiendo string a entero con funcion
        Integer numero2 = cargarNumero();
        
        System.out.println("Ingrese el tercer numero:");
        //Convirtiendo string a entero con funcion
        Integer numero3 = cargarNumero();
        
        Integer sumatoria = numero1 + numero2 + numero3;
        //En Java para combinar datos enteros y decimales se debe convertir
        Double numeroPromedio = Double.valueOf(sumatoria)/3;
        System.out.println("El numero promedio es :" + numeroPromedio);
        */
        
        //Ejercicio 3: Mostrar numero par o impar
        System.out.println("Ingrese el primer numero:");
        //Convirtiendo string a entero con funcion
        Integer numero = cargarNumero();
        
        //Los numeros pares son divisibles entre 2 y no retornan resto
        Boolean esPar = numero % 2 == 0;
        
        if(esPar){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
    
    //Funciones
    
    private static Integer cargarNumero() throws IOException{
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        
        String strNumero = buffer.readLine();
        //Convirtiendo string a entero
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
    private static void calcularNumeroMayor(Integer numero1, Integer numero2, Integer numero3){
        
        Integer numeroMayor =numero1;
         
        //Condicional para saber el numero mayor
         if(numero2 > numeroMayor){
             numeroMayor = numero2;
         }
         if(numero3 > numeroMayor){
             numeroMayor = numero3;
         }
         
        System.out.println("El numero mayor es " + numeroMayor);
         
    }
    
    private static void calcularNumeroMenor(Integer numero1, Integer numero2, Integer numero3){
           
        Integer numeroMenor =numero1;
         
        //Condicional para saber el numero mayor
         if(numero2 < numeroMenor){
             numeroMenor = numero2;
         }
         if(numero3 < numeroMenor){
             numeroMenor = numero3;
         }
         
        System.out.println("El numero menor es " + numeroMenor);
           
    }
}
