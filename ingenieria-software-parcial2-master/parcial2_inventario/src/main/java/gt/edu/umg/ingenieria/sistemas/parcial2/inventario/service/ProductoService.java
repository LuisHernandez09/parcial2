package gt.edu.umg.ingenieria.sistemas.parcial2.inventario.service;

import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.ProductoEntity;
import gt.edu.umg.ingenieria.sistemas.parcial2.inventario.dao.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    
    public List<ProductoEntity> buscarTodos() {
        return (List<ProductoEntity>) this.productoRepository.findAll();
    }
 
    
    public ProductoEntity registrar(ProductoEntity productovar){
        
       
        
        return this.productoRepository.save(productovar);
    }
    public String eliminar(Long Id){
     this.productoRepository.deleteById(Id);
     return "Producto Eliminado";
    }
    
    public ProductoEntity actualizar(ProductoEntity productovar, Long id){
            return this.productoRepository.save(productovar);
            }
    
    public ProductoEntity buscarid(Long id){
        return this.productoRepository.findById(id).get();
    }
    }
