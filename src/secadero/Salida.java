package Negocio;
import java.util.*;

/**
 * @author Diego
 * @version 1.0
 * @created 28-sep-2013 21:38:51 p.m.
 */
public class Salida {

	private Empresa empresa;
	private Personal personal;
	private Vehiculo vehiculo;
        private Date fecha;

        //Constructores
	public Salida(){

	}
        
        public Salida(Empresa unaEmpresa, Personal unEmpleado, Vehiculo unVehiculo,Date unaFecha){
            this.empresa = unaEmpresa;
            this.personal = unEmpleado;
            this.vehiculo = unVehiculo;
            this.fecha = unaFecha;
        }
        //Set & Get
        
        public void setEmpresa(Empresa unaEmpresa){
            this.empresa = unaEmpresa;
        }
        public void setPersonal(Personal unEmpleado){
            this.personal = unEmpleado;
        }
        public void setVehiculo(Vehiculo unVehiculo){
            this.vehiculo = unVehiculo;
        }
        public void setFecha(Date unaFecha){
            this.fecha = unaFecha;
        }
        
        public Empresa getEmpresa(){
            return this.empresa;
        }
        public Personal getEmpleado(){
            return this.personal;
        }
        public Vehiculo getVehiculo(){
            return this.vehiculo;
        }
        public Date getFecha(){
            return this.fecha;
        }
        
        //Metodos

}