/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repasobasico;

import ico.fes.INEGI.EncuestadorINEGI;
import ico.fes.dispositivo.SmartPhone;

/**
 *
 * @author escri
 */
public class RepasoBasico {
    
    public static void main(String[]args){
        SmartPhone cel1= new SmartPhone("Samsung");
        SmartPhone cel2= new SmartPhone("Huawei", "P40", "Gris", 5.5f);
        System.out.println(cel1);
        System.out.println(cel2);
        
        // Uso de metodo de acceso 
        cel1.setModelo("Galaxy Note 10");
        System.out.println(cel1);
        
        
        System.out.println("Marca del cel #1: " + cel1.getMarca());
        
        EncuestadorINEGI enc1 = new EncuestadorINEGI();
        enc1.setDispositivo(cel2);
    }
}
