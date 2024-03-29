package modelo;
// Generated 11-jul-2014 16:29:19 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.annotations.NamedQuery;

/**
 * Etiqueta generated by hbm2java
 */
@Entity
@Table(name="etiqueta"
    ,catalog="teide2014"
)
@NamedQuery(name = "findEtiquetaByNombre",
        query = "from Etiqueta e where e.nombre=:nombre")
public class Etiqueta  implements java.io.Serializable {


     private Integer idEtiqueta;
     private String nombre;
     private Set<TiendaProducto> tiendaProductos = new HashSet<TiendaProducto>(0);

    public Etiqueta() {
    }

	
    public Etiqueta(String nombre) {
        this.nombre = nombre;
    }
    public Etiqueta(String nombre, Set<TiendaProducto> tiendaProductos) {
       this.nombre = nombre;
       this.tiendaProductos = tiendaProductos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idEtiqueta", unique=true, nullable=false)
    public Integer getIdEtiqueta() {
        return this.idEtiqueta;
    }
    
    public void setIdEtiqueta(Integer idEtiqueta) {
        this.idEtiqueta = idEtiqueta;
    }

    
    @Column(name="nombre", nullable=false, length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="etiqueta_producto", catalog="teide2014", joinColumns = { 
        @JoinColumn(name="idEtiqueta", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="idProducto", nullable=false, updatable=false) })
    public Set<TiendaProducto> getTiendaProductos() {
        return this.tiendaProductos;
    }
    
    public void setTiendaProductos(Set<TiendaProducto> tiendaProductos) {
        this.tiendaProductos = tiendaProductos;
    }




}


