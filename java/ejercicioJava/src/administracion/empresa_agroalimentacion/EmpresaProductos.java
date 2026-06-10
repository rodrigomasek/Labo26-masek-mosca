package administracion.empresa_agroalimentacion;

import enums.PaisOrigen;

import java.util.ArrayList;

public class EmpresaProductos {
    private ArrayList<Producto> productos;

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public int frescoReciente(){
        Producto p1 = productos.get(0);

        for(Producto p : productos){
            if(p.getFechaEnvasado().isBefore(p1.getFechaEnvasado())){
                p1 = p;
            }
        }
        return p1.getNumeroLote();
    }

    public int cantidadProductoPais(PaisOrigen po){
        int i = 0;

        for(Producto p : productos){
            if(p.getPaisOrigen() == po){
                i++;
            }
        }
        return i;
    }

    public EmpresaProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public static void main(String[] args) {
        Producto pf1 = new ProductoFresco();
        Producto pf2 = new ProductoFresco();

        Producto pr1 = new ProductoRefrigerado();
        Producto pr2 = new ProductoRefrigerado();
        Producto pr3 = new ProductoRefrigerado();

        ArrayList<Producto> ar1 = new ArrayList<>();
        EmpresaProductos ep1 = new EmpresaProductos(ar1);

        ep1.agregarProducto(pf1);
        System.out.println(ep1.frescoReciente());

        System.out.println(ep1.cantidadProductoPais(PaisOrigen.ARGENTINA));

        System.out.println(pf1.toString());
        System.out.println(pf1.infoNutricional());
    }
}
