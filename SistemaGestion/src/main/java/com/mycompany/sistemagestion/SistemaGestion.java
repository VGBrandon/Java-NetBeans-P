/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sistemagestion;

import com.mycompany.sistemagestion.forms.GestionClientes2;

/**
 *
 * @author eldan
 */
public class SistemaGestion {

    public static void main(String[] args) {
        /*
        //Muestra programa que te da la bienvenida si ingresas tu nombre
        Formulario ventana = new Formulario();
        ventana.show();
        */
        
        /*
        IndiceMasaCorporal ventana = new IndiceMasaCorporal();
        ventana.show();
        */
        
        /*
        GestionClientes ventana = new GestionClientes();
        ventana.show();
        */
        
        GestionClientes2 ventana = new GestionClientes2();
        ventana.show();
        
        /*
        //Ejercicio 4: Programa que muestre los primeros 100 numeros primos
        
        String resultado = "";
        int contador = 0;
        int numero = 1;
        while(contador < 100){
            if(esPrimo(numero)){
                resultado += numero + ", ";
                contador++;
            }
            numero++;          
        }
        System.out.println("Los primeros 100 numeros primos son: " + resultado);
        */
    }
    
    private static Boolean esPrimo(Integer numero){
        
        Boolean esUnNumeroPrimo = true;
        
        for(int i=2;i < numero;i++){
            if(numero % i == 0){
                esUnNumeroPrimo = false;
            }
        }
        return esUnNumeroPrimo;
    }
}
