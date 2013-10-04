package Negocio;

import java.util.*;

/**
 * @author Diego
 * @version 1.0
 * @created 28-sep-2013 21:38:47 p.m.
 */
public class Vehiculo {

	private String matricula;
	private int modelo;
	private int nro;
	private Empresa empresa;
        private ArrayList<Ingreso> ingresos;
        private ArrayList<Salida> salidas;
        private ArrayList<Mantenimiento> mantenimientos;
        
                
	//Constructores
        public Vehiculo(){

	}

	public Vehiculo(String unaMatricula,int unModelo,int unNumero, Empresa unaEmpresa){
            this.matricula = unaMatricula;                  
            this.modelo = unModelo;
            this.nro = unNumero;
            this.empresa = unaEmpresa;
            this.ingresos = new ArrayList();
            this.mantenimientos  = new ArrayList();
            this.salidas  = new ArrayList();
        }
        
        //Set & Get
        public void setMatricula(String unaMatricula){
            this.matricula = unaMatricula;
        }
        public void setModelo(int unModelo){
            this.modelo = unModelo;
        }
        public void setNumero(int unNumero){
            this.nro = unNumero;
        }
        public void setEmpresa(Empresa unaEmpresa){
            this.empresa = unaEmpresa;
        }
        public String getMatricula(){
            return this.matricula;
        }
        public int getModelo(){
            return this.modelo;
        }
        public int getNumero(){
            return this.nro;
        }
        public Empresa getEmpresa(){
            return this.empresa;
        }
        
        //Metodos
        @Override
        public String toString(){
            return this.getMatricula() + " - " + this.getNumero();
        }
        
        //Agregar ingreso
        public void agregarIngreso(Ingreso unIngreso){
            this.ingresos.add(unIngreso);
        }
        //Agregar Salida
        public void agregarSalida(Salida unaSalida){
            this.salidas.add(unaSalida);
        }
        //Agregar Mantenimiento
        public void agregarMantenimiento(Mantenimiento unMantenimiento){
            this.mantenimientos.add(unMantenimiento);
        }
        
        public Mantenimiento ultimoMantenimiento(){
            //Retorno el ultimo Mantenimiento
            Mantenimiento unMantenimiento = null;
            return unMantenimiento;
        }

}