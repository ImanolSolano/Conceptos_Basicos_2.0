/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.INEGI;

import ico.fes.dispositivo.SmartPhone;

/**
 *
 * @author escri
 */
public class EncuestadorINEGI {
    private String nombre;
    private SmartPhone dispositivo;

    public EncuestadorINEGI() {
    }

    public EncuestadorINEGI(String nombre, SmartPhone dispositivo) {
        this.nombre = nombre;
        this.dispositivo = dispositivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SmartPhone getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(SmartPhone dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public String toString() {
        return "EncuestadorINEGI{" + "nombre=" + nombre + ", dispositivo=" + dispositivo + '}';
    }
    
}
