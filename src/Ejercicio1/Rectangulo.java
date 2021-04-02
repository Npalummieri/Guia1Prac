package Ejercicio1;

public class Rectangulo {

    private double alto;
    private double ancho;

    public Rectangulo()
    {

    }

    public Rectangulo(double alto,double ancho)
    {
        this.alto=alto;
        this.ancho=ancho;
    }

    public double getAlto()
    {
        return alto;
    }

    public void setAlto(double alto)
    {
        this.alto=alto;
    }

    public double getAncho()
    {
        return ancho;
    }
    public void setAncho(double ancho)
    {
        this.ancho=ancho;
    }

    public double calculoArea()
    {

        return ancho*alto;

    }

    public double calculoPerimetro()
    {
        double resultado;
        resultado=(ancho*2) + (alto*2);

        return resultado;
    }
}
