/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.*;

/**
 *
 * @author Diego
 */
public class TipoRol {
    private String nombre;
    private ArrayList<Rol> roles;
    
    //Constructores
    public TipoRol(){
        
    }
    public TipoRol(String unNombre){
        this.nombre=unNombre;
        this.roles=new ArrayList();
    }
    
    //Set & Get
    public void setNombre(String unNombre){
        this.nombre=unNombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    //Metodos
    public void agregarRol(Rol unRol){
        this.roles.add(unRol);
    }
    
}
