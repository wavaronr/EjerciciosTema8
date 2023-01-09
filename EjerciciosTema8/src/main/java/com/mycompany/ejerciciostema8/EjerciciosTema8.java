/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciostema8;

/**
 *
 * @author alexn
 */
public class EjerciciosTema8 {

    public static void main(String[] args) {
        //instancia de clase persona 
        Persona myPersona = new Persona();
                myPersona.setNombre("Wilmer Varon");
                myPersona.setEdad(34);
                myPersona.setTelefono(320123456);
        System.out.println("El nombre es: "+ myPersona.getNombre()+" edad: "+myPersona.getEdad()+" Telefono: "+myPersona.getTelefono());
    }
}
class Persona{
private int edad;
private String nombre;
private int telefono;

    Persona() {   
    }

        public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}