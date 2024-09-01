package ProyectoWalter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura implements IFactura {
    private Integer idFactura;
    private Date fecha;
    private Double total;
    private List<Producto> productos;

    @Override
    public void agregarProducto(Producto producto) {
        if (productos == null) {
            productos = new ArrayList<>();
        }
        productos.add(producto);
    }

    public void generarFactura() {
        System.out.println();
        System.out.println("Generando factura de pedidos: ");
        for (Producto pedido : productos) {
            System.out.println("Pedido:" + pedido.getNombre());
            System.out.println("Cantidad: " + pedido.getCantidad());
            System.out.println("Id del producto: " + pedido.getIdProducto());
        }
        System.out.println("Fin facturacion");
        System.out.println();
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
