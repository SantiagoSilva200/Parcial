import java.util.ArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class Tienda {

    private final Map<producto, Integer> productos;
    private final List<stock> stocks;

    public Tienda() {
        producto = new HashMap<>();
        stocks = new ArrayList<>();
    }


    public boolean agregarNuevoProducto(producto producto, stock stock){
        boolean estado = true;
        if (producto == null){
            estado = false;
        } else if (productos.containsKey(producto)){
            productos.put(producto, producto.getCantStock()+1);
            System.out.println("Un nuevo producto ha sido añadido");
            estado = true;
        }
        return estado;
    }
    
    public boolean verificacionProductos(producto producto, stock stock){
        boolean estado = true;
        if (producto.getCantStock() == stock.getCantidad())
            return 
    }
    
}