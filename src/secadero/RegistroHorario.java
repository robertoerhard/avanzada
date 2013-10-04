package Negocio;
import java.util.*;

/**
 * @author Diego
 * @version 1.0
 * @created 29-sep-2013 18:02:14 p.m.
 */
public class RegistroHorario {

	private Date ingreso;
	private Date salida;
	public Personal empleado;

	//Constructores
        public RegistroHorario(){

	}
        
        public RegistroHorario(Date unIngreso,Personal unEmpleado){
            this.ingreso = unIngreso;
            this.empleado = unEmpleado;
            this.salida = null;
        }
        
        //Set & Get
        public void setIngreso(Date unIngreso){
            this.ingreso = unIngreso;
        }
        public void setSalida(Date unaSalida){
            this.salida = unaSalida;
        }
        public void setEmpleado(Personal unEmpleado){
            this.empleado = unEmpleado;
        }
        public Date getIngreso(){
            return this.ingreso;
        }
        public Date getSalida(){
            return this.salida;
        }
        public Personal getEmpleado(){
            return this.empleado;
        }
        
        //Metodos
        

	

}