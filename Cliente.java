package ProyectoWalter;

import java.util.List;

public class Cliente {
    private Integer idCliente;
    private String nombre;
    private String direccion;
    private String telefono;

    private List<Pedido> pedidos;
    private Factura factura;


    public void realizarPedido() {
        System.out.println("Realizando pedido");
        System.out.println("/************************************/");
        System.out.println("Cliente: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);

        for (Pedido pedido : pedidos) {
            System.out.println("----------------------------------");
            System.out.println("Id Pedido:" + pedido.getIdPedido());
            System.out.println("Estado: " + pedido.getEstado());
            System.out.println("Fecha de la venta: " + pedido.getFecha());
            List<Producto> productos = pedido.getProductos();
            if (productos != null) {
                for (Producto producto : productos) {
                    System.out.println("Producto: " + producto.getNombre());
                    System.out.println("Cantidad: " + producto.getCantidad());
                    System.out.println("Id del producto: " + producto.getIdProducto());
                    factura.agregarProducto(producto);
                    System.out.println();
                }
            }
            System.out.println();
        }
        factura.generarFactura();
        System.out.println("/************************************/");
        System.out.println("Pedido realizado");
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
