/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

public class Aba {
    int idCategoria;
    String marca;
    int IdProveedor;
    Float peso;
    Float litro;
    float precio;
    String idAbarrote;
    int unidad;
    String Categoria;
    String Proveedor;
    int Id;
    String estado;
    float venta;
    float precioUnidad;
    int idPersonal;
    int Producto;
    int cantidad;
    float total;
    
    
    

    public Aba() {

    }

    public Aba(String marca,float venta,int Producto,int cantidad,float total,int idPersonal, float precioUnidad, int IdProveedor,String estado, float precio, int idCategoria, Float litro, Float peso, int unidad, String Categoria, String Proveedor, int Id) {
        this.marca = marca;
        this.IdProveedor = IdProveedor;
        this.precio = precio;
        this.litro = litro;
        this.peso = peso;
        this.unidad = unidad;
        this.idCategoria = idCategoria;
        this.Categoria = Categoria;
        this.Proveedor = Proveedor;
        this.Id = Id;
        this.estado = estado;
        this.venta = venta;
        this.precioUnidad = precioUnidad;
        this.idPersonal = idPersonal;
        this.Producto = Producto;
        this.cantidad = cantidad;
        this.total = total;
        
    }
    
    public interface ItemBase {
    String getDisplayAea();
    int getAea();
}
    
    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }
    
    public String getEstado() {
        return Proveedor;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    public int getProducto() {
        return Producto;
    }

    public void setProducto(int Producto){
        this.Producto = Producto;
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int getidPersonal() {
        return idPersonal;
    }

    public void setidPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }
    
    public int getIdProveedor() {
        return IdProveedor;
    }

    public void setIdProveedor(int IdProveedor) {
        this.IdProveedor = IdProveedor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public float getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(float precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
    
    public float getVenta() {
        return venta;
    }

    public void setVenta(float venta) {
        this.venta = venta;
    }
    
    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
    
    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }
    
    public Float getLitro() {
        return litro;
    }

    public void setLitro(Float litro) {
        this.litro = litro;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    
    

    @Override
    public String toString() {
        return "Abarrote{" +
                "marca=" + marca +
                ", proveedor=" + IdProveedor +
                ", precio=" + precio +
                ", peso=" + peso +
                ", litro=" + litro +
                ", unidad=" + unidad +
                ", idCategoria=" + idCategoria +
                ", Categoria=" + Categoria +
                ", Proveedor=" + Proveedor +
                ", Id=" + Id +
                ", estado=" + estado +
                ", venta=" + venta +
                ", precioUnidad=" + precioUnidad +
                ", idPersonal=" + idPersonal +
                ", Producto=" + Producto +
                ", cantidad=" + cantidad +
                ", total=" + total +
                '}';
    }
    
}
    