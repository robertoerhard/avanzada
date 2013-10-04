package Negocio;
import java.util.*;



/**
 * @author Diego
 * @version 1.0
 * @created 28-sep-2013 21:38:58 p.m.
 */
public class Empresa {

	private String cuit;
	private String direccion;
	private String localidad;
	private String razonSocial;
	private String telefono;
        private HashMap<String,Proveedor> proveedores; //cuit
        private ArrayList<Deposito> depositos;
        private ArrayList<Descarga> descargas;
        private ArrayList<Zdl> zdls;
        private HashMap<String,Personal> empleados; //cuil
        private ArrayList<Salida> salidas;
        private HashMap<String,Vehiculo> vehiculos; //matricula

	//Constructores
        public Empresa(){

	}
        
        public Empresa(String unaCuit, String unaDireccion, String unaLocalidad,String unaRazonSocial,String unTelefono){
            this.cuit=unaCuit;
            this.direccion = unaDireccion;
            this.localidad = unaLocalidad;
            this.razonSocial = unaRazonSocial;
            this.telefono = unTelefono;
            
            //coleciones
            this.proveedores = new HashMap();//<String, Proveedor>();
            this.depositos = new ArrayList<Deposito>();
            this.descargas = new ArrayList<Descarga>();
            this.zdls = new ArrayList<Zdl>();
            this.empleados = new HashMap();//<String, Personal>();
            this.salidas = new ArrayList<Salida>();
            this.vehiculos = new HashMap();//<String,Vehiculo>();
        }
        
        //Set & Get
        public void setCuit(String unaCuit){
            this.cuit = unaCuit;
        }
        public void setDireccion (String unaDireccion){
            this.direccion = unaDireccion;
        }
        public void setLocalidad(String unaLocalidad){
            this.localidad = unaLocalidad;
        }
        public void setRazonSocial(String unaRazonSocial){
            this.razonSocial = unaRazonSocial;
        }
        public void setTelefono(String unTelefono){
            this.telefono = unTelefono;
        }        
        public String getCuit(){
            return this.cuit;
        }
        public String getDireccion(){
            return this.direccion;
        }
        public String getLocalidad(){
            return this.localidad;
        }
        public String getRazonSocial(){
            return this.razonSocial;
        }
        public String getTelefono(){
            return this.telefono;
        }
        
        
        //Metodos
        //Agrega Proveedor
        public void agregarProveedor(Proveedor unProveedor){
            this.proveedores.put(unProveedor.getCuit(), unProveedor);
        }
        //Agrega un Deposito
        public void agergarDeposito(Deposito unDeposito){
            this.depositos.add(unDeposito);
        }
        //Agrega una Zdl
        public void agregarZdl(Zdl unaZdl){
            this.zdls.add(unaZdl);
        }
        //Agrega un Empleado
        public void agregarEmpleado(Personal unEmpleado){
            this.empleados.put(unEmpleado.getCuil(), unEmpleado);
        }
        //Agrega una Salida
        public void agregarSalida(Salida unaSalida){
            this.salidas.add(unaSalida);
        }
        //Agrega unVehiculo
        public void agregarVehiculo(Vehiculo unVehiculo){
            this.vehiculos.put(unVehiculo.getMatricula(), unVehiculo);   
        }
        //Agrega unaDescarga
        public void agregarDescarga(Descarga unaDescarga){
            this.descargas.add(unaDescarga);
        }
        

}