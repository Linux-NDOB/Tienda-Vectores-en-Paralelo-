
package com.mycompany.parallel;


public class POJO {
    private int codigo;
    private String nombre;
    private float precio; 
    private int cantidad;
    private float multiplicacion;

    public POJO(int codigo, String nombre, float precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public POJO(float multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public float getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(float multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
  
     
}
