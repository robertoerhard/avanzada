package Negocio;

import java.util.*;

/**
 * @author Diego
 * @version 1.0
 * @created 28-sep-2013 21:39:11 p.m.
 */
public class TipoDeInsumo {

	private String descripcion;
	private String nombre;
	private ArrayList<Insumo> insumos;

	//Constructores
        public TipoDeInsumo(){

	}
        
        public TipoDeInsumo(String unNombre, String unaDescripcion){
            this.nombre = unNombre;
            this.descripcion = unaDescripcion;
            this.insumos = new ArrayList();
        }
	//Set & Get
        public void setNombre(String unNombre){
            this.nombre = unNombre;
        }
        public void setDescripcion(String unaDescripcion){
            this.descripcion = unaDescripcion;
        }
        public String getNombre(){
            return this.nombre;
        }
        public String getDescripcion(){
            return this.descripcion;
        }
        
        //Metodos
        @Override
        public String toString(){
            return this.nombre;
        }
        public void agregarInsumo(Insumo unInsumo){
            this.insumos.add(unInsumo);
        }

}