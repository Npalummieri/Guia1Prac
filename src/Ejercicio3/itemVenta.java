package Ejercicio3;

public class itemVenta {

    private int id;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public itemVenta()
    {

    }

    public itemVenta(int id,String descripcion,int cantidad,double precioUnitario)
    {
        this.id=id;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
        this.precioUnitario=precioUnitario;

    }

    public int getId()
    {
        return id;
    }

    public void getId(int id)
    {
        this.id=id;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String description)
    {
        this.descripcion=description;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(int quantity)
    {
        this.cantidad=quantity;
    }

    public double getPrecioUnitario()
    {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnico)
    {
        this.precioUnitario=precioUnico;
    }

    public double calculoTotal()
    {
        double total=0;

        total= getCantidad()*getPrecioUnitario();

        return total;
    }

    public String muestraProducto()
    {
        return "Producto : "+getId() +"|| Descripcion :  "+getDescripcion() + " ||Cantidad : "+getCantidad() + "  ||Precio Unitario : "+getPrecioUnitario();
    }

}
