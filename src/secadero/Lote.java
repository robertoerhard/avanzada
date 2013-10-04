
import java.util.*;



/**
 * @author Diego
 * @version 1.0
 * @created 28-sep-2013 21:39:14 p.m.
 */
public class Lote {

	private ArrayList<Lote> lotes;
        private int numero;
        private float porcenLeniaVerde;
        private float porcenLeniaSeca;

	//Constructores
        public Lote(){

	}
        public Lote(int unNumero,float unPorcenLSeca, float unPorcenLVerde){
            this.numero = unNumero;
            this.lotes=new ArrayList();
            this.porcenLeniaSeca = unPorcenLSeca;
            this.porcenLeniaVerde = unPorcenLVerde;
            
        }
        
        //Set & Get
        public void setNumero(int unNumero){
            this.numero = unNumero;
        }
        public void setPorceLSeca(float unPorcen){
            this.porcenLeniaSeca = unPorcen;
        }
        public void setPorcenLVerde(float unPorcen){
            this.porcenLeniaVerde = unPorcen;
        }
        
        public int getNumero(){
            return this.numero;
        }
        public float getPorcenLSeca(){
            return this.porcenLeniaSeca;
        }
        public float getPorcenLVerde(){
            return this.porcenLeniaVerde;
        }
        
        //Metodos



}