/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeq2;

import java.io.Serializable;


/**
 *
 * @author Camilo
 */
public class VentaGeneral implements Serializable{
    private String idVenta;
    private String fecha;
    private String hora;
    private String usuario;
    private double total;
    
    public VentaGeneral(String idVenta, String fecha, String hora, String usuario, double total) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.hora = hora;
        this.usuario = usuario;
        this.total = total;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
