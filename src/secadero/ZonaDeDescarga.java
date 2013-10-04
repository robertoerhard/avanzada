package Negocio;

import java.util.*;

/**
 * @author Diego
 * @version 1.0
 * @created 29-sep-2013 23:01:04 p.m.
 */
public class ZonaDeDescarga {

	private Empresa empresa;
        private ArrayList<Seccion> secciones;

	//Constructores
        public ZonaDeDescarga(){

	}
        
        public ZonaDeDescarga(Empresa UnaEmpresa, Ingreso unIngreso){
            this.empresa = UnaEmpresa;
            this.secciones = new ArrayList();
            
        }
        
        //Set & Get
        public void setEmpresa(Empresa unaEmpresa){
            this.empresa = unaEmpresa;
        }

        public Empresa getEmpresa(){
            return this.empresa;
        }
       //Metodos
        public void agregarSeccion(Seccion unaSeccion){
            this.secciones.add(unaSeccion);
        }
        

	

}