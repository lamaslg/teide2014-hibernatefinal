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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TiendaProducto generated by hbm2java
 */
@Entity
@Table(name="tienda_producto"
    ,catalog="teide2014"
)
public class TiendaProducto  implements java.io.Serializable {


     private Integer idProducto;
     private TiendaCategoria tiendaCategoria;
     private String nombre;
     private String descripcion;
     private String foto;
     private int existencias;
     private double precio;
     private Set<Etiqueta> etiquetas = new HashSet<Etiqueta>(0);
     private Set<EnvioProducto> envioProductos = new HashSet<EnvioProducto>(0);

    public TiendaProducto() {
    }

	
    public TiendaProducto(TiendaCategoria tiendaCategoria, String nombre, int existencias, double precio) {
        this.tiendaCategoria = tiendaCategoria;
        this.nombre = nombre;
        this.existencias = existencias;
        this.precio = precio;
    }
    public TiendaProducto(TiendaCategoria tiendaCategoria, String nombre, String descripcion, String foto, int existencias, double precio, Set<Etiqueta> etiquetas, Set<EnvioProducto> envioProductos) {
       this.tiendaCategoria = tiendaCategoria;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.foto = foto;
       this.existencias = existencias;
       this.precio = precio;
       this.etiquetas = etiquetas;
       this.envioProductos = envioProductos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idProducto", unique=true, nullable=false)
    public Integer getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idCategoria", nullable=false)
    public TiendaCategoria getTiendaCategoria() {
        return this.tiendaCategoria;
    }
    
    public void setTiendaCategoria(TiendaCategoria tiendaCategoria) {
        this.tiendaCategoria = tiendaCategoria;
    }

    
    @Column(name="nombre", nullable=false, length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="descripcion", length=65535)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="foto", length=450)
    public String getFoto() {
        return this.foto;
    }
    
    public void setFoto(String foto) {
        this.foto = foto;
    }

    
    @Column(name="existencias", nullable=false)
    public int getExistencias() {
        return this.existencias;
    }
    
    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    
    @Column(name="precio", nullable=false, precision=22, scale=0)
    public double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

@ManyToMany(fetch=FetchType.LAZY, mappedBy="tiendaProductos")
    public Set<Etiqueta> getEtiquetas() {
        return this.etiquetas;
    }
    
    public void setEtiquetas(Set<Etiqueta> etiquetas) {
        this.etiquetas = etiquetas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tiendaProducto")
    public Set<EnvioProducto> getEnvioProductos() {
        return this.envioProductos;
    }
    
    public void setEnvioProductos(Set<EnvioProducto> envioProductos) {
        this.envioProductos = envioProductos;
    }




}


