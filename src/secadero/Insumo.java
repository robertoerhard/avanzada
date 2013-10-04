package Negocio;

import java.util.*;

/**
 * @author Diego
 * @version 1.0
 * @created 28-sep-2013 21:39:00 p.m.
 */
public class Insumo {

	private String descripcion;
	private String nombre;
	private HashMap<String, Proveedor> proveedores;
	private ArrayList<Aplicacion> aplicaciones;
        private TipoDeInsumo tipoDeInsumo;

	//Constructores
        public Insumo(){

	}
        
        public Insumo(String unNombre, String unaDescripcion,Proveedor unProveedor,Aplicacion unaAplicacion, TipoDeInsumo unTipoDeInsumo){
            this.nombre = unNombre;
            this.descripcion = unaDescripcion;
            this.proveedores = new HashMap();//<Integer, Cuenta>()
            this.aplicaciones = new ArrayList();
            this.tipoDeInsumo = unTipoDeInsumo;    
        }
        
        //Set & Get
        public void setNombre(String unNombre){
            this.nombre = unNombre;
        }
        public void setDescripcion(String unaDescripcion){
            this.descripcion = unaDescripcion;
        }
        public void setTipoDeInsumo(TipoDeInsumo unTipoDeInsumo){
            this.tipoDeInsumo = unTipoDeInsumo;
        }
        public String getNombre(){
            return this.nombre;
        }
        public String getDescripcion (){
            return this.descripcion;
        }
        public TipoDeInsumo getTipoDeInsumo(){
            return this.tipoDeInsumo;
        }
        
        
        
        //Metodos
        public void agregarProveedor(Proveedor unProveedor){
            this.proveedores.put(unProveedor.getCuit(), unProveedor);
        }
        public void agregarAplicacion(Aplicacion unaAplicacion){
            this.aplicaciones.add(unaAplicacion);
        }
        
	

}