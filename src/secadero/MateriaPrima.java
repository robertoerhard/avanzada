package Negocio;
import java.util.*;

/**
 * @author Diego
 * @version 1.0
 * @created 28-sep-2013 21:38:36 p.m.
 */
public class MateriaPrima {
	public Parcela parcela;

        //Constructores
	public MateriaPrima(){

	}
        public MateriaPrima(Parcela unaParecela){
            this.parcela = unaParecela;
        }
        
        //Set & Get
        public void setParcela(Parcela unaParcela){
            this.parcela = unaParcela;
        }
        public Parcela getParcela(){
            return this.parcela;
        }
        //Metodos


	

}