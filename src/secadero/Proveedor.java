package Negocio;
import java.util.*;

/**
 * @author Diego
 * @version 1.0
 * @created 28-sep-2013 21:38:49 p.m.
 */
public class Proveedor {

	private String cuit;
	private String direccion;
	private String email;
	private String razonsocial;
	private String telefono;
	private Empresa empresa;
        private ArrayList<Insumo> insumos;

	public Proveedor(){

	}
        public Proveedor(String unaCuit, String unaDireccion, String unEmail,String unaRazonSocial,String unTelefono,Empresa unaEmpresa){
            this.cuit = unaCuit;
            this.direccion = unaDireccion;
            this.email = unEmail;
            this.razonsocial = unaRazonSocial;
            this.telefono = unTelefono;
            this.empresa = unaEmpresa;
            this.insumos = new ArrayList<Insumo>();
        }

        
        //Set & Get
        public void setCuit(String unaCuit){
            this.cuit = unaCuit;
        }
        public void setDireccion(String unaDireccion){
            this.direccion = unaDireccion;
        }
        public void setEmail(String unEmail){
            this.email = unEmail;
        }
        public void setRazonSocial(String unaRazonSocial){
            this.razonsocial = unaRazonSocial;
        }
        public void setTelefono(String unTelefono){
            this.telefono = unTelefono;
        }
        public void setEmpresa (Empresa unaEmpresa){
            this.empresa = unaEmpresa;
        }       
        public String getCuit(){
            return this.cuit;
        }
        public String getDireccion(){
            return this.direccion;
        }
        public String getEmail(){
            return this.email;
        }
        public String getRazonSocial(){
            return this.razonsocial;
        }
        public String getTelefono(){
            return this.telefono;       
        }
        public Empresa getEmpresa(){
            return this.empresa;
        }
        
        //Metodos
        //Agrega un Insumo
        public void agregarInsumo(Insumo unInsumo){
            this.insumos.add(unInsumo);
        }

}