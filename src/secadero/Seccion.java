package Negocio;

/**
 * @author Diego
 * @version 1.0
 * @created 29-sep-2013 23:12:29 p.m.
 */
public class Seccion {

	private Ingreso ingreso;
        private ZonaDeDescarga zonaDeDescarga;
        //Constructores
	public Seccion(){
	}
        
        public Seccion(Ingreso unIngreso, ZonaDeDescarga unaZonaDeDescarga){
            this.ingreso = unIngreso;
            this.zonaDeDescarga = unaZonaDeDescarga;
        }
        //Set & Get
        public void setIngreso(Ingreso unIngreso){
            this.ingreso = unIngreso;
        }
        public Ingreso getIngreso(){
            return this.ingreso;
        }
        //MEtodos
                



}