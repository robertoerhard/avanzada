package Negocio;
import java.util.*;

/**
 * @author Diego
 * @version 1.0
 * @created 28-sep-2013 21:39:01 p.m.
 */
public class Ingreso {

	private MateriaPrima materiaPrima;
	private Personal empleado;
	private Vehiculo vehiculo;
	private Deposito deposito;
        private float pesoBruto;
        private float pesoTara;
        

	//constructores
        public Ingreso(){

	}
        public Ingreso(MateriaPrima unaMateriaPrima, Personal unEmpleado, Vehiculo unVehiculo, Deposito unDeposito, float unPesoBruto, float unPesoTara){
            this.materiaPrima = unaMateriaPrima;
            this.empleado = unEmpleado;
            this.vehiculo = unVehiculo;
            this.deposito = unDeposito;
            this.pesoBruto = unPesoBruto;
            this.pesoTara = unPesoTara;
        }
        
        //Set & Get
        public void setMateriaPrima(MateriaPrima unaMateriaPrima){
            this.materiaPrima = unaMateriaPrima;
        }
        public void setEmpleado(Personal unEmpleado){
            this.empleado = unEmpleado;
        }
        public void setVehiculo (Vehiculo unVehiculo){
            this.vehiculo = unVehiculo;
        }
        public void setDeposito(Deposito unDeposito){
            this.deposito = unDeposito;
        }
        public void setPesoBruto(float unPesoBruto){
            this.pesoBruto = unPesoBruto;
        }
        public void setPesoTara(float unPesoTara){
            this.pesoTara = unPesoTara;
        }
        public MateriaPrima getMateriaPrima(){
            return this.materiaPrima;
        }
        public Personal getEmpleado(){
            return this.empleado;
        }
        public Vehiculo getVehiculo(){
            return this.vehiculo;
        }
        public Deposito getDeposito(){
            return this.deposito;
        }
        public float getPesoBruto(){
            return this.pesoBruto;
        }
        public float getPesoTara(){
            return this.pesoTara;
        }
        //Metodos
        public float kilajeTotal(){
            float kilaje =  pesoBruto - pesoTara;
            return kilaje;
        }

}