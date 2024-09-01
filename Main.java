package ProyectoWalter;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setDireccion("5 Calle C 4-48, Zona 3, Boca del Monte, El Matazano, Villa Canales");
        cliente.setIdCliente(1);
        cliente.setNombre("Walter Ramos");
        cliente.setTelefono("+502 5843-0234");

        Producto producto1 = new Producto();
        producto1.setIdProducto(1731082024);
        producto1.setNombre("Producto 1");
        producto1.setCantidad(17);

        Producto producto2 = new Producto();
        producto2.setIdProducto(1531082024);
        producto2.setNombre("Producto 2");
        producto2.setCantidad(15);

        Producto producto3 = new Producto();
        producto3.setIdProducto(22310824);
        producto3.setNombre("Producto 3");
        producto3.setCantidad(22);

        Pedido pedido1 = new Pedido();
        pedido1.setIdPedido(1);
        pedido1.setIdCliente(1234);
        pedido1.setFecha(new Date());
        pedido1.agregarProducto(producto1);
        pedido1.agregarProducto(producto2);
        pedido1.agregarProducto(producto3);
        pedido1.modificarEstado("Enviado");

        Producto producto4 = new Producto();
        producto4.setIdProducto(5310824);
        producto4.setNombre("Producto 4");
        producto4.setCantidad(05);

        Producto producto5 = new Producto();
        producto5.setIdProducto(14310824);
        producto5.setNombre("Producto 5");
        producto5.setCantidad(14);

        Pedido pedido2 = new Pedido();
        pedido2.setIdPedido(2);
        pedido2.setIdCliente(4545);
        pedido2.setFecha(new Date());
        pedido2.agregarProducto(producto4);
        pedido2.agregarProducto(producto5);
        pedido2.modificarEstado("Creado");

        cliente.setPedidos(List.of(pedido1, pedido2));

        Factura factura = new Factura();
        factura.setIdFactura(1);
        factura.setFecha(new Date());
        factura.setTotal(1000.0);
        cliente.setFactura(factura);

        cliente.realizarPedido();
    }
}