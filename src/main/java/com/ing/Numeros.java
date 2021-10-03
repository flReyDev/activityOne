/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ing;

import java.util.Scanner;

/**
 *
 * @author leonardo
 */
public class Numeros {
    
    private final Scanner sc;
    private final Validacion v;
    
    
    public Numeros(){
        
        this.sc = new Scanner(System.in);
        this.v = new Validacion();
    }
    
   
    public void mostrar(){
        
       int salir = 1;
        
        
        while(salir != 0){
        
            System.out.println("Ingresa el numero 1");
            int numero  = this.v.valor(sc.next());
            System.out.println("Ingresa el numero 2");
            int numero2  = this.v.valor(sc.next());
            System.out.println("Ingresa el numero 3");
            int numero3  = this.v.valor(sc.next());
            System.out.println("Ingresa el numero 4");
            int numero4  = this.v.valor(sc.next());
            
            
            
            int arreglo[] = {numero, numero2, numero3, numero4};

            for(int a: arreglo){
                System.out.println("Numero "+a);
            }
            
            System.out.println("Si desea salir de programa de numeros precione 0 de lo contrario 1");
            salir  = this.sc.nextInt();
        }
        
    }
    
}
