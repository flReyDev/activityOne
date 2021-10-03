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
public class Caracteres {
    
    private final Scanner sc;
    
    private String crt1;
    private String crt2;
    private String crt3;
    private String crt4;
    private String crt5;
    private String crt6;

    
    public Caracteres(){
        this.sc =  new Scanner(System.in);
        
    }
    
    public void arregloCaracteres(){
        int salir = 1;
        
        
        
        while(salir != 0){
            
            System.out.println("Ingresa el primer caracter!!");
            this.setCrt1(sc.next());

            System.out.println("Ingresa el segundo caracter!!");
            this.setCrt2(sc.next());

            System.out.println("Ingresa el tercer caracter!!");
            this.setCrt3(sc.next());

            System.out.println("Ingresa el cuarto caracter!!");
            this.setCrt4(sc.next());

            System.out.println("Ingresa el quinto caracter!!");
            this.setCrt5(sc.next());

            System.out.println("Ingresa el sexto caracter!!");
            this.setCrt6(sc.next());

            String arreglo[] = {
                this.getCrt1(),
                this.getCrt2(),
                this.getCrt3(),
                this.getCrt4(),
                this.getCrt5(),
                this.getCrt6()
            };

            for(int i = arreglo.length-1; i>=0; i--){
                System.out.println("Caracteres en orden inverso: "+ arreglo[i]);
            }
            System.out.println("Si desea salir del programa de caracteres precione 0 de lo contrario 1");
            salir = sc.nextInt();
        }
        
    }

    public String getCrt1() {
        return crt1;
    }

    public void setCrt1(String crt1) {
        this.crt1 = crt1;
    }

    public String getCrt2() {
        return crt2;
    }

    public void setCrt2(String crt2) {
        this.crt2 = crt2;
    }

    public String getCrt3() {
        return crt3;
    }

    public void setCrt3(String crt3) {
        this.crt3 = crt3;
    }

    public String getCrt4() {
        return crt4;
    }

    public void setCrt4(String crt4) {
        this.crt4 = crt4;
    }

    public String getCrt5() {
        return crt5;
    }

    public void setCrt5(String crt5) {
        this.crt5 = crt5;
    }

    public String getCrt6() {
        return crt6;
    }

    public void setCrt6(String crt6) {
        this.crt6 = crt6;
    }
    
    
}
