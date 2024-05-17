/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6;

/**
 *
 * @author Cynth
 */
class Facturar {
    public void aplicarDescuento(double precioProducto, int numProductos){     double Total;
    if(numProductos>LIMITE_DESCUENTO)
        precioProducto-=5;
            if (numProductos!=0){
            Total = precioProducto*DESCUENTO_ALTO;
            mostrarTotal(Total);
        }else {
            Total = precioProducto*DESCUENTO_BAJO;
            mostrarTotal(Total);
        }   

    }
    private static final int LIMITE_DESCUENTO = 3;
    private static final double DESCUENTO_BAJO = 0.95;
    private static final double DESCUENTO_ALTO = 0.8;

    private void mostrarTotal(double Total) {
        System.out.println("El total a pagar es:"+Total);
        System.out.println("Enviado");
    }
    
}
