/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22.arraylist;

import java.util.ArrayList;



/**
 *
 * @author ViviPc
 */
public class Clases {
    ArrayList<String> cedula;
    ArrayList<String> nombre;
    ArrayList<Integer> curso;

    public Clases() {
        nombre = new ArrayList<>();
        cedula = new ArrayList<>();
        curso = new ArrayList<>();
    }

    public void ingresar(String nombre, String cedula, int curso){
        this.nombre.add(nombre);
        this.cedula.add(cedula);
        this.curso.add(curso);
    }

    public String getNombre(int posicion){
        return nombre.get(posicion);
    }
    
    public String getCedula(int posicion){
        return cedula.get(posicion);
    }
    
    public int getCurso(int posicion){
        return curso.get(posicion);
    }
    
    public int tamaño(){
        return nombre.size();
    }
    
    public int buscar(String buscar){
        int posicion = -1;
        
        for(int i = 0;i < cedula.size();i++ ){
            if(buscar.equals(cedula.get(i))){
                posicion = i;
            }
        }
        return posicion;
    }    
}
