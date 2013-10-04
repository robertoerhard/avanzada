package Negocio;
import java.util.*;

/**
 * @author Diego
 * @version 1.0
 * @created 28-sep-2013 21:50:23 p.m.
 */
public class Personal  {

	private String apellido;
	private String cuil;
	private Date fechaNacimiento;
	private String nombre;
	private Empresa empresa;
        private int legajo;
	private ArrayList<Mantenimiento> mantenimientos;
        private ArrayList<Equipamiento> equipamientos;
        private ArrayList<RegistroHorario> registroHorarios;
        private ArrayList<Rol> roles;
        private ArrayList<Aplicacion> aplicaciones;
        private ArrayList<Ingreso> ingresos;

	//Constructores
        public Personal(){

	}
        
        public Personal(String unNombre, String unApellido,String unaCuil, Date unaFechaNacimiento, int unLegajo,Empresa unaEmpresa ){
            this.nombre = unNombre;
            this.apellido = unApellido;
            this.cuil = unaCuil;
            this.fechaNacimiento = unaFechaNacimiento;
            this.legajo = unLegajo;
            this.empresa = unaEmpresa;
            this.mantenimientos = new ArrayList<Mantenimiento>();
            this.equipamientos = new ArrayList<Equipamiento>();
            this.registroHorarios = new ArrayList<RegistroHorario>();
            this.roles = new ArrayList<Rol>();
            this.aplicaciones = new ArrayList<Aplicacion>();
            this.ingresos = new ArrayList<Ingreso>();
            
        }
        
        //Set & Get
        public void setNombre(String unNombre){
            this.nombre = unNombre;
        }
        public void setApellido(String unApellido){
            this.apellido = unApellido;
        }
        public void setCuil(String unaCuil){
            this.cuil = unaCuil;
        }
        public void setFechaNacimiento(Date unaFechaNacimiento){
            this.fechaNacimiento = unaFechaNacimiento;
        }
        public void setLegajo(int unLegajo){
            this.legajo = unLegajo;
        }
        public void setEmpresa(Empresa unaEmpresa){
            this.empresa = unaEmpresa;
        }
        public String getNombre(){
            return this.nombre;
        }
        public String getApellido(){
            return this.apellido;
        }     
        public String getCuil(){
            return this.cuil;
        }
        public Date getFechaNacimiento(){
            return this.fechaNacimiento;
        }
        public int getLegajo(){
            return this.legajo;
        }
        public Empresa getEmpresa(){
            return this.empresa;
        }
        public Rol getRol(){
            /*
             * Retorno el rol actual 
             * recorro la coleccion buscando el que tiene fecha hasta null
             */
           Rol unRol = null;
           return unRol;
            
        }
        //Metodos
        
        @Override
        public String toString(){
            return this.apellido + " "+ this.nombre + "-" + this.getLegajo();
        }
        
        public void agregarMantenimiento(Mantenimiento unMantenimiento){
            this.mantenimientos.add(unMantenimiento);
        }
        public void agregarEquipamiento(Equipamiento unEquipamiento){
            this.equipamientos.add(unEquipamiento);
        }
        public void agregarRegistroHorario(RegistroHorario unRegistroHorario){
            this.registroHorarios.add(unRegistroHorario);
        }
        public void agregarRol(Rol unRol){
            this.roles.add(unRol);
        }
        
        public float horasTrabajadas(Date desde, Date hasta){
            /*
             * Recorro la coleccion buscando los registro entre las fechas comprendidas y sumo 
             */
            float horasTrabajadas = 0;
            return horasTrabajadas;
        }
        public void agregarAplicacion(Aplicacion unaAplicacion){
            this.aplicaciones.add(unaAplicacion);
        }
        public void agregarIngreso(Ingreso unIngreso){
            this.ingresos.add(unIngreso);
        }
        

}