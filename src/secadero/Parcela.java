package secadero;

/**
 * @author Diego
 * @version 1.0
 * @created 28-sep-2013 21:38:50 p.m.
 */
public class Parcela {

	private String NombreChacra;
	private int NroParcela;
	private Plantacion plantacion;
        private float densidad;

	
        //Constructores
        public Parcela(){

	}
        
        public Parcela(String unNombreChacra,int unNroDeParcela,Plantacion unaPlantacion,float unaDensidad){
            this.NombreChacra = unNombreChacra;
            this.NroParcela = unNroDeParcela;
            this.plantacion = unaPlantacion;
            this.densidad = unaDensidad;
        }
        
        //Set & Get
        public void setNombreChacra(String unNombreChacra){
            this.NombreChacra = unNombreChacra;
        }
        public void setNroParcela(int unNroParcela){
            this.NroParcela = unNroParcela;
        }
        public void setPlantacion(Plantacion unaPlantacion){
            this.plantacion = unaPlantacion;
        }
        public void setDensidad(float unaDensidad){
            this.densidad = unaDensidad;
        }
        public String getNombreChacra(){
            return this.NombreChacra;
        }
        public int getNroParcela(){
            return this.NroParcela;
        }
        public Plantacion getPlantacion(){
            return this.plantacion;
        }
        public float getDensidad(){
            return this.densidad;
        }
       

}