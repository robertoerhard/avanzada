package Negocio;
import java.util.*;

/**
 * @author Diego
 * @version 1.0
 * @created 28-sep-2013 21:38:56 p.m.
 */
public class Equipamiento extends Insumo {

	private Personal personal;
        private Date fecha;

	//Constructores
        public Equipamiento(){

	}
        public Equipamiento(String unNombre, String unaDescripcion,Proveedor unProveedor,Aplicacion unaAplicacion, TipoDeInsumo unTipoDeInsumo,Personal unEmpleado, Date unaFecha){
            super(unNombre,unaDescripcion,unProveedor,unaAplicacion, unTipoDeInsumo);
            this.personal = unEmpleado;
            this.fecha = unaFecha;
        }
        //Set & Get
        public void setEmpleado(Personal unEmpleado){
            this.personal = unEmpleado;
        }
        public void setFecha(Date unaFecha){
            this.fecha = unaFecha;
        }
        public Personal getPersonal(){
            return this.personal;
        }
        public Date getFecha(){
            return this.fecha;
        }
        //Metodos
        
        
                


}