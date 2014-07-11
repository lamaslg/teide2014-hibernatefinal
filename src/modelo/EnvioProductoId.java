package modelo;
// Generated 11-jul-2014 16:29:19 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EnvioProductoId generated by hbm2java
 */
@Embeddable
public class EnvioProductoId  implements java.io.Serializable {


     private int idEnvio;
     private int idProducto;

    public EnvioProductoId() {
    }

    public EnvioProductoId(int idEnvio, int idProducto) {
       this.idEnvio = idEnvio;
       this.idProducto = idProducto;
    }
   


    @Column(name="idEnvio", nullable=false)
    public int getIdEnvio() {
        return this.idEnvio;
    }
    
    public void setIdEnvio(int idEnvio) {
        this.idEnvio = idEnvio;
    }


    @Column(name="idProducto", nullable=false)
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EnvioProductoId) ) return false;
		 EnvioProductoId castOther = ( EnvioProductoId ) other; 
         
		 return (this.getIdEnvio()==castOther.getIdEnvio())
 && (this.getIdProducto()==castOther.getIdProducto());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdEnvio();
         result = 37 * result + this.getIdProducto();
         return result;
   }   


}


