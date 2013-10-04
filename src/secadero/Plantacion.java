

/**
 * @author Diego
 * @version 1.0
 * @created 28-sep-2013 21:38:45 p.m.
 */
public class Plantacion {
        private String propietario;
        private String ubicacion;
        
        //Constructores
	public Plantacion(){

	}
        public Plantacion(String unPropietario, String unaUbicacion){
            this.propietario = unPropietario;
            this.ubicacion = unaUbicacion;
        }
        
        //Set & Get
        public void setPropietario(String unPropietario){
            this.propietario = unPropietario;
        }
        public void setUbicacion(String unaUbicacion){
            this.ubicacion = unaUbicacion;
        }
        public String getPropietario(){
            return this.propietario;
        }
        public String getUbicacion(){
            return this.ubicacion;
        }
        //Metodos
        
	

}