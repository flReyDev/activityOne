/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ing;

/**
 *
 * @author leonardo
 */
public class Validacion {
    
    private int numero;
    
    public Validacion(){}
        
    public int valor(String valor){
        
        if(!valor.matches("[0-9]*")){
            System.out.println("Ingresa solo numeros...");
            this.setNumero(-0);
        }else{
            this.setNumero(Integer.parseInt(valor));
        }
        
        return this.getNumero();
    }
    
    

    private int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
