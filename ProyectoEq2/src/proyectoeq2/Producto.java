/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeq2;

import java.io.Serializable;

/**
 *
 * @author Samuel
 */
public class Producto implements Serializable, Cloneable {

    private String Modulo;
    private String Catalogo;
    private String IDProducto;
    private String Nombre;
    private double Precio;
    private long Existencias;

    public Producto(String modulo, String catalogo, String id_producto, String nombre_producto, double precio, long existencias) {
        this.Modulo = modulo;
        this.Catalogo = catalogo;
        this.IDProducto = id_producto.toLowerCase();
        this.Nombre = nombre_producto;
        this.Precio = precio;
        this.Existencias = existencias;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return getIDProducto() +"|" + getModulo() + "|" + getCatalogo() +"|" + getNombre() +"|" + getPrecio() + "|" + getExistencias();
    }

    public String getModulo() {
        return Modulo.toLowerCase();
    }

    public void setModulo(String Modulo) {
        this.Modulo = Modulo.toLowerCase();
    }

    public String getCatalogo() {
        return Catalogo;
    }

    public void setCatalogo(String Catalogo) {
        this.Catalogo = Catalogo;
    }

    public String getIDProducto() {
        return IDProducto.toLowerCase();
    }

    public void setIDProducto(String IDProducto) {
        this.IDProducto = IDProducto.toLowerCase();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        this.Precio = precio;
    }

    public long getExistencias() {
        return Existencias;
    }

    public void setExistencias(long Existencias) {
        this.Existencias = Existencias;
    }

}
