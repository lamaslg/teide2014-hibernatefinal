/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernatefinal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import modelo.EnvioProducto;
import modelo.Etiqueta;
import modelo.TiendaProducto;
import repositorio.IRepositorio;
import repositorio.Repositorio;

/**
 *
 * @author luis
 */
public class HibernateFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IRepositorio<Etiqueta> re=new Repositorio<>();
        
        Map<String,Object> paramsEtiqueta=new HashMap<>();
        paramsEtiqueta.put("nombre", "Electrodomestico");
        
    
        List<Etiqueta> listaEtiquetas=re.find("findEtiquetaByNombre",
                paramsEtiqueta);

        if(listaEtiquetas.size()==0)
            System.out.println("Error, etiqueta desconocida");
        else{
            Etiqueta eti=listaEtiquetas.get(0);
            System.out.println("****Productos por etiqueta****");            
            for (TiendaProducto tiendaProducto : eti.getTiendaProductos()) {
                System.out.println(tiendaProducto.getNombre());
            }
                    
            }
        
        IRepositorio<TiendaProducto> repositorioProducto
                =new Repositorio<>();
        TiendaProducto tp=repositorioProducto.get(TiendaProducto.class, 10);
        System.out.println("****Envios del producto****");
        for (EnvioProducto envioProducto : tp.getEnvioProductos()) {
            System.out.println(envioProducto.getEnvios().getNombre());
            System.out.println(envioProducto.getCoste());
        }
    }
    
}
