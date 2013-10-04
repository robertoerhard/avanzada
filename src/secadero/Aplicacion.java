package Negocio;
import java.util.*;



/**
 * @author Diego
 * @version 1.0
 * @created 28-sep-2013 21:39:06 p.m.
 */
public class Aplicacion {

	private float duracion;
	private Date fecha;
	private Plantacion plantacion;
	private ArrayList<Insumo> insumos=new ArrayList<Insumo>();
	private Personal personal;

	
        //Constructores
        public Aplicacion(){

	}
        
        public Aplicacion(float unaDuracion,Date unaFecha,Plantacion unaPlantacion,Personal unPersonal){
            this.duracion = unaDuracion;
            this.fecha = unaFecha;
            this.plantacion = unaPlantacion;
            this.personal = unPersonal;
        }
        
        // Set & Get
        public void setDuracion(float unaDuracion){
            this.duracion = unaDuracion;
        }
        public void setFecha (Date unaFecha){
            this.fecha = unaFecha;
        }
        public void setPlantacion (Plantacion unaPlantacion){
            this.plantacion = unaPlantacion;
        }
        public void setPersonal (Personal unPersonal){
            this.personal = unPersonal;
        }
        public float getDuracion(){
            return this.duracion;
        }
        public Date getFecha(){
            return this.fecha;
        }
        public Plantacion getPlantacion(){
            return this.plantacion;
        }
        public Personal getPersonal(){
            return this.personal;
        }
        
        //Metodos
        
        //Agrego un Insumo
        public void agregarInsumo(Insumo unInsumo){
            this.insumos.add(unInsumo);
        }
        //Remuevo un Insumo
        public void removerInsumo(Insumo unInsumo){
            this.insumos.remove(unInsumo);
            
        }
        
        //



}