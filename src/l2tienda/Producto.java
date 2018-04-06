/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2tienda;

/**
 *
 * @author Pablo López
 */
public class Producto {
    public Producto(){
    }
    public String CódigoProducto, NombreP, Marca, Proveedor;
    public Float PrecioCompra, PrecioVenta;
    public int Cantidad;
    
    public String getCódigoProducto(){
    return CódigoProducto;
    }
    public void setCódigoProducto(String CódigoProducto){
    this.CódigoProducto = CódigoProducto;
    }
    public String getNombreP (){
    return NombreP;
    }
    public void setNombreP(String NombreP){
    this.NombreP = NombreP;
    }
    public String getMarca(){
    return Marca;
    }
    public void setMarca(String Marca){
    this.Marca = Marca;
    }
    public String getProveedor(){
    return Proveedor;
    }
    public Float getPrecioCompra() {
        return PrecioCompra;
    }

    public Float getPrecioVenta() {
        return PrecioVenta;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public void setPrecioCompra(Float PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }

    public void setPrecioVenta(Float PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    
    
    
}
