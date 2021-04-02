package Ejercicio4;

public class Cuentabancaria {

    private int id;
    private String nombre;
    private double balance;

    public Cuentabancaria()
    {

    }

    public Cuentabancaria(int id,String nombre,double balance)
    {
        this.id=id;
        this.nombre=nombre;
        this.balance=balance;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id=id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance=balance;
    }

    public double deposito(double ingreso)///Preguntar si puedo usar el this.balance para modificar directamente la variable del objeto llamado
    {
        double total=0;

        System.out.println("Ingrese monto a cargar a la cuenta : "+ingreso);

        if(ingreso<=0)
        {
            System.out.println("Imposible ingresar 0 o valor negativo,reingrese...");
        }else
        {
            System.out.println("Depositado con exito!");
            total=ingreso+getBalance();
        }

        return total;
    }

    public double retirar(double ingreso)
    {
        double total =getBalance();

        System.out.println("Ingrese monto a retirar : "+ingreso);
        if(ingreso<=getBalance())
        {
            System.out.println("Retirando dinero ... ");
            total=getBalance() - ingreso ;
        }else
        {
            System.out.println("Imposible retirar mas de lo que tenes,vuelva prontos");
        }

        return total;
    }


    @Override
    public String toString() {
        return "ID Cuenta bancaria : "+id + " || Nombre del titular : "+nombre + "  || Balance : "+balance;
    }
}


