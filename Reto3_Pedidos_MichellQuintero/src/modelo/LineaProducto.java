/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author miche
 */
public class LineaProducto extends Producto {
    
    private int cantidad;
    private float precio;
    public static ArrayList listaProductos= new ArrayList();

    /*public LineaProducto(int id, String denominacion, String proveedor) {
        super(id, denominacion, proveedor);
    }*/
    public LineaProducto(int cantidad, float precio, int id, String denominacion, String proveedor) {
        super(id, denominacion, proveedor);
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public static ArrayList<Integer> CargarProductos()
    {
        
        LineaProducto p1 =new LineaProducto(15,1700,1,"Cocosete","Colombina");
        listaProductos.add(p1);
        LineaProducto p2 =new LineaProducto(20,3000,2,"Arroz Diana","Arrocera");
        listaProductos.add(p2);
        LineaProducto p3 =new LineaProducto(10,3800,3,"Cuatro","Cocacola");
        listaProductos.add(p3);
        LineaProducto p4 =new LineaProducto(10,3500,4,"Manzana","Postobon");
        listaProductos.add(p4);
        LineaProducto p5 =new LineaProducto(8,1700,5,"Pasta Doria","Fetuchini");
        listaProductos.add(p5);
        LineaProducto p6 =new LineaProducto(5,2500,6,"Mr Brownie","Colombina");
        listaProductos.add(p6);
        LineaProducto p7 =new LineaProducto(10,1800,7,"Casero","CreamHelado");
        listaProductos.add(p7);
        LineaProducto p8 =new LineaProducto(30,800,8,"Jet","Jumbo");
        listaProductos.add(p8);
        LineaProducto p9 =new LineaProducto(12,900,9,"Oreo galletas","Oreo");
        listaProductos.add(p9);
        LineaProducto p10 =new LineaProducto(7,3800,10,"Bocatto","CreamHelado");
        listaProductos.add(p10);
        LineaProducto p11 =new LineaProducto(5,2500,6,"chokis","Dulceria");
        listaProductos.add(p11);
        LineaProducto p12 =new LineaProducto(10,1800,7,"Trululu","GomasFina");
        listaProductos.add(p12);
        LineaProducto p13 =new LineaProducto(30,800,8,"Trident","Trident SA");
        listaProductos.add(p13);
        LineaProducto p14 =new LineaProducto(12,900,9,"Mentas","Colombina");
        listaProductos.add(p14);
        LineaProducto p15 =new LineaProducto(7,3800,10,"Nescafe","CafeColombian");
        listaProductos.add(p15);
        return listaProductos;
    }
    
}
