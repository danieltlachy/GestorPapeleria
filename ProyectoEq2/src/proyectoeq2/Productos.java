/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeq2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Samuel
 */
public class Productos{
    private  ArrayList<Producto> productos;

    public Productos() {
        productos = new ArrayList<>();
        try {
            Cargar();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Producto> getLista(){
        return productos;
    }
    
    //Lanza un IOException si el elemento ya existe, o devuelve el objeto Producto si se agrega con éxito.
    public Producto NuevoProducto(String modulo, String catalogo, String id_producto, String nombre_producto, double precio, long existencias)  throws IOException{
        //MECANISMO DE ANEXION INEFICIENTE EN GRANDES CANTIDADES DE DATOS, DEBERÍA REVISAR DIRECTAMENTE EL ARCHIVO EN LUGAR DE CARGAR Y GUARDAR TODA LA LISTA CON CADA ELEMENTO NUEVO.
        //PUEDE GENERAR ERRORES DE INCONSISTENCIA DADO QUE PUEDEN CREARSE VARIOS OBJETOS "PRODUCTOS" Y TENER INFORMACIÓN DISTINTA (PARA CORREGIR ESTO, LA CLASE PODRÍA SER STATIC -NO CREABLE-)

        if (BuscarPorID(id_producto)!=null) {
            throw new IOException("El id del producto " + id_producto + " ya existe.");
        }
        else{
            Producto prod = new Producto(modulo, catalogo, id_producto, nombre_producto, precio, existencias);
            productos.add(prod);
            Grabar();
            return prod;
        }
    }
    
    public Producto ModificarProducto(String id_producto, String nombre_producto, double precio, long existencias)  throws IOException{
        //MECANISMO DE ANEXION INEFICIENTE EN GRANDES CANTIDADES DE DATOS, DEBERÍA REVISAR DIRECTAMENTE EL ARCHIVO EN LUGAR DE CARGAR Y GUARDAR TODA LA LISTA CON CADA ELEMENTO NUEVO.
        //PUEDE GENERAR ERRORES DE INCONSISTENCIA DADO QUE PUEDEN CREARSE VARIOS OBJETOS "PRODUCTOS" Y TENER INFORMACIÓN DISTINTA (PARA CORREGIR ESTO, LA CLASE PODRÍA SER STATIC -NO CREABLE-)
        Producto prod  = BuscarPorID(id_producto);
        if (prod!=null) {
            prod.setNombre (nombre_producto);
            prod.setPrecio (precio);
            prod.setExistencias(existencias);
            Grabar();
            return prod;
        }
        else{
            throw new IOException("El id del producto " + id_producto + " no existe.");
        }
    }
    
    //Método sobrecargado: Si se envía sólo un string después del id_producto asume que cambiará el nombre del producto
    public Producto ModificarProducto(String id_producto, String nombre_producto)  throws IOException{
        Producto prod  = BuscarPorID(id_producto);
        if (prod!=null) {
            prod.setNombre (nombre_producto);
            Grabar();
            return prod;
        }
        else{
            throw new IOException("El id del producto " + id_producto + " no existe.");
        }
    }
    
    //Método sobrecargado: Si se envía sólo un double después del id_producto asume que cambiará el precio unitario
    public Producto ModificarProducto(String id_producto, double precio)  throws IOException{
        Producto prod  = BuscarPorID(id_producto);
        if (prod!=null) {
            prod.setPrecio (precio);
            Grabar();
            return prod;
        }
        else{
            throw new IOException("El id del producto " + id_producto + " no existe.");
        }
    }    
    
    //Método sobrecargado: Si se envía sólo un long después del id_producto asume que cambiará la existencia
    public Producto ModificarProducto(String id_producto, long existencias)  throws IOException{
        Producto prod  = BuscarPorID(id_producto);
        if (prod!=null) {
            prod.setExistencias(existencias);
            Grabar();
            return prod;
        }
        else{
            throw new IOException("El id del producto " + id_producto + " no existe.");
        }
    }

    
    public Producto EliminarProducto(String id_producto)  throws IOException{
        //MECANISMO DE ELIMINACION INEFICIENTE EN GRANDES CANTIDADES DE DATOS, DEBERÍA REVISAR DIRECTAMENTE EL ARCHIVO EN LUGAR DE CARGAR Y GUARDAR TODA LA LISTA CON CADA ELEMENTO ELIMINADO.
        //MECANISMO DE ELIMINACION PELIGROSO PUES AUN NO REVISA SI YA SE USA EL PRODUCTO EN VENTAS, SI YA EXISTE SÓLO DEBERÍA DESACTIVARSE Y NO ELIMINARSE.
        //PUEDE GENERAR ERRORES DE INCONSISTENCIA DADO QUE PUEDEN CREARSE VARIOS OBJETOS "PRODUCTOS" Y TENER INFORMACIÓN DISTINTA (PARA CORREGIR ESTO, LA CLASE PODRÍA SER STATIC -NO CREABLE-)
        Producto prod  = BuscarPorID(id_producto);
        if (prod!=null) {
            productos.remove(prod);
            Grabar();
            return prod;
        }
        else{
            throw new IOException("El id del producto " + id_producto + " no existe.");
            
        }
    }    
    
    public void Grabar() throws IOException{
        try{
            FileOutputStream file = new FileOutputStream("productos.obj");
            ObjectOutputStream output = new ObjectOutputStream(file);
            for(Producto prod:productos){
                output.writeObject(prod);
            }
            output.close();
            file.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            throw new IOException("Error al grabar el archivo de datos: "+e.getMessage());
        }
    }
    private void Cargar() throws IOException{    
        productos.clear();
        try{
            FileInputStream file = new FileInputStream("productos.obj");
            ObjectInputStream input = new ObjectInputStream(file);
            Producto prod = (Producto)input.readObject();
            while(prod != null){
                productos.add(prod);
                prod = (Producto)input.readObject();
            }
            input.close();
            file.close();
	}catch (EOFException e) {         
            System.out.println("Fin de archivo. Productos cargados.");
        }catch(Exception e){
            System.out.println(e.getMessage());
            throw new IOException("Error al leer el archivo de datos: "+e.getMessage()); 
	}
    }
    
    public Producto BuscarPorID(String id_producto) {
        id_producto = id_producto.toLowerCase();
        for(Producto prod:productos){
            if (id_producto.equals( prod.getIDProducto())) 
                return prod;
        }
        return null;
    }

   //Genera una lista de los productos que pertenecen a un módulo específico.
    //NOTA: La implementación es riesgosa pues podrían modificarse los datos directametente en la lista sin que se guarden correctamente en el archivo,
    //      Se debe tener precaución de solo usarlo como lectura.
    //NOTA 2: La solución es implementar Cloneable en Producto para generar una copia y no el acceso al objeto mismo.
    public ArrayList<Producto> FiltrarPor(String modulo) {
        ArrayList<Producto> lista = new ArrayList<>();

        for(Producto prod:productos){
            if (modulo.equalsIgnoreCase( prod.getModulo())) 
                try {
                lista.add((Producto) prod.clone());
                }catch(CloneNotSupportedException e){}
        }
        return lista;
    }

   //Método sobrecargado. Genera una lista de los productos que pertenecen a un módulo y un catálogo específico.
    public ArrayList<Producto> FiltrarPor(String modulo, String catalogo) {
        ArrayList<Producto> lista = new ArrayList<>();
        
        for(Producto prod:productos){
            if (modulo.equalsIgnoreCase(prod.getModulo()) && catalogo.equalsIgnoreCase(prod.getCatalogo()) ) 
                try {
                lista.add((Producto) prod.clone());
                }catch(CloneNotSupportedException e){}
        }
        return lista;
    }
    
}
