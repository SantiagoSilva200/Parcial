@Component
public class producto{
    private String nombre;
    private int precio;
    private int cantStock;
    private Hashmap categoria;

    @Autorwired
    public producto(String nombre, int precio, int cantStock, Hashmap categoria){
       this.nombre = nombre;
       this.precio = precio;
       this.cantStock= cantStock;
       this.categoria = categoria;
    }

    //Obtiene la cantidad del producto en el stock actual
    public int getCantStock(){
        return cantStock;
    }


}   