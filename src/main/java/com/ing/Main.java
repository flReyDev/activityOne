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
public class Main {
    

    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        int salir  = 1;
        
        while(salir != 0){
        
            System.out.println("Menu principal\n ->Precione 1 para numeros\n ->Preciones 2 para caracteres");
            String numero = sc.next();
            
            if(!numero.matches("[0-9]*")){
                System.out.println("Ingresa solo numeros entre el 1 o 2");
            }else{
                
                int opcion = Integer.parseInt(numero);
                
                if(opcion == 1){
                    Numeros number = new Numeros();
                    number.mostrar();
             
                }else if(opcion == 2){
                    Caracteres ctr = new Caracteres();
                    ctr.arregloCaracteres();
                }
                
            }
            System.out.println("Menu principal si desea salir precione 0 de lo contrario 1");
            salir = sc.nextInt();
        }
    }
    
    
    
    
}
