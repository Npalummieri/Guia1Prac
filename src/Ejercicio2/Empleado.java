package Ejercicio2;

public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private float salario;


    public Empleado()
    {

    }

    public Empleado(int dni,String nombre,String apellido,float salario)
    {
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;
    }

    public int getDni()
    {
        return dni;
    }
    public void setDni(int dni)
    {
        this.dni=dni;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre()
    {
        this.nombre=nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido()
    {
        this.apellido=apellido;
    }

    public float getSalario()
    {
        return salario;
    }

    public void setSalario()
    {
        this.salario=salario;
    }

    public void mostrarEmpleado() ///Quiza esta sea menos prolija x tantos 'sout' en un metodo
    {
        System.out.println("DNI : "+getDni());
        System.out.println(String.format("Nombre y Apellido : %s %s",getNombre(),getApellido()));
        System.out.println("Salario : "+getSalario());
    }

    ///Siguiendo el ejemplo de la guia medio copy/paste pero bueno ahora sé que se puede retornar asi
    public String getEmpleado()
    {
        return "  Empleado : [DNI : "+this.dni + "  Nombre : " +this.nombre +"  Apellido : "+this.apellido +"  Salario : "+this.salario +"]";
    }

    public String aumentoSueldo(float sueldo) {
        float aumento = (sueldo * 15) / 100;
        this.salario=sueldo+aumento;

        return "Salario : "+this.salario;

    }

    public float calculoAnual(float sueldo)
    {
        return sueldo*12;
    }

}
