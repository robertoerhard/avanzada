package Negocio;
import java.util.*;

/**
 * @author Diego
 * @version 1.0
 * @created 28-sep-2013 21:39:03 p.m.
 */
public class Deposito {

	private Empresa empresa;
        private ArrayList<Lote> lotes;

	public Deposito(){

	}
        
        public Deposito(Empresa unaEmpresa){
            this.empresa = unaEmpresa;
            this.lotes = new ArrayList();
        }
        
        public void setEmpresa(Empresa unaEmpresa){
            this.empresa = unaEmpresa;
        }
        public Empresa getEmpresa(){
            return this.empresa;    
        }


}