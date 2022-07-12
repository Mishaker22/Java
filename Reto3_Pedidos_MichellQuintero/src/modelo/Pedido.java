/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.*;
import java.util.*;

/**
 *
 * @author miche
 */

public class Pedido  {
    
    
    private int idPedido;
    private LocalDate fechaPedido= LocalDate.now();
    public static enum Estado{PENDIENTE, PAGADO}
    private float total;
    public Estado estado;

    public Pedido() 
    {
       estado=Estado.PENDIENTE; 
    }
    public Pedido(int idPedido, float total) {
        this.idPedido = idPedido;
        this.total = total;
        estado=Estado.PENDIENTE;
        
    }
    
    
   
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    
    
    
    
    
}
