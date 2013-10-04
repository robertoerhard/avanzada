package Negocio;
import java.util.*;

/**
 * @author Diego
 * @version 1.0
 * @created 28-sep-2013 21:39:12 p.m.
 */
public class Rol {

	private Date desde;
	private Date hasta;
	private TipoRol tipoRol;
	private Personal empleado;

	//Constructores
        public Rol(){

	}
        
        public Rol(Date unaFechaDesde,TipoRol unRol, Personal unEmpleado){
            this.desde = unaFechaDesde;
            this.tipoRol =unRol;
            this.empleado = unEmpleado;
        }
        //Set & Get
        public void setDesde(Date unaFechaDesde){
            this.desde = unaFechaDesde;
        }
        public void setEmpleado(Personal unEmpleado){
            this.empleado = unEmpleado;
        }
        public void setHasta(Date unaFechaHasta){
            this.hasta = unaFechaHasta;
        }
        public void setTipoRol(TipoRol unRol){
            this.tipoRol = unRol;
        }
        public Date getDesde(){
            return this.desde;
        }
        public Date getHasta(){
            return this.hasta;
        }
        public TipoRol getTipoRol(){
            return this.tipoRol;
        }
        public Personal getEmpleado (){
            return this.empleado;
        }
        //Metodos



}