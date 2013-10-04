package Negocio;

import java.util.*;

/**
 * @author Diego
 * @version 1.0
 * @created 28-sep-2013 21:39:04 p.m.
 */
public class Mantenimiento {

	private Date fecha;
	private String notas;
	private Vehiculo vehiculo;
        private Personal empleado;

	//Constructores
        public Mantenimiento(){

	}
        public Mantenimiento(Date unaFecha, String unasNotas,Vehiculo unVehiculo, Personal unEmpleado){
            this.fecha = unaFecha;
            this.notas = unasNotas;
            this.vehiculo = unVehiculo;
            this.empleado = unEmpleado;
        }
        //Set & Get
        public void setFecha(Date unaFecha){
            this.fecha = unaFecha;
        }
        public void setNotas (String unasNotas){
            this.notas = unasNotas;
        }
        public void setVehiculo(Vehiculo unVehiculo){
            this.vehiculo = unVehiculo;
        }
        public void setEmpleado(Personal unEmpleado){
            this.empleado = unEmpleado;
        }
        public Date getFecha(){
            return this.fecha;
        }
        public String getNotas(){
            return this.notas;
        }
        public Vehiculo getVehiculo(){
            return this.vehiculo;
        }
        public Personal getEmpleado(){
            return this.empleado;
        }
        
        //Metodos


}