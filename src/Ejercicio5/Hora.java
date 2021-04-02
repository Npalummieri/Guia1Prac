package Ejercicio5;

public class Hora {

    private int h;
    private int m;
    private int s;


    public Hora(){

    }

    public Hora(int h,int m,int s)
    {
        this.h=h;
        this.m=m;
        this.s=s;
    }

    public int getH()
    {
        return h;
    }

    public void setH(int h)
    {
      this.h=h;
    }

    public int getM()
    {
        return m;
    }

    public void setM(int m){
        this.m=m;
    }

    public int getS(){
        return s;
    }

    public void setS(int s){
        this.s=s;
    }


    ///Preguntar como funciona lo del '%02d' porque no entendi el prefix ese extraño
    public void muestraHora()
    {

        if(h>23 || m>=60 || s>=60)
        {
            System.out.println("Hora invalida");
        }else
            System.out.println(String.format("%02d:%02d:%02d", h, m, s));
    }

    public void agregarSegundo()  ///Aca creo que podria usar el '?' tambien pero no lo tengo claro
    {
        if(h==23 && s==59 && m==59)
        {
            h=0;
            m=0;
            s=0;
            System.out.println(String.format("%02d:%02d:%02d", h, m, s));
        }
        if(s==59 && m==59)
        {
            s=0;
            m=0;
            h++;
        }if(s==59)
        {
            s=0;
            m++;
        }
        s++;

    }


    public void restarSegundo()
    {
        if(h==00 && s==00 && m==00)
        {

            h=23;
            m=59;
            s=59;
            System.out.println(String.format("%02d:%02d:%02d", h, m, s));

        }
        if(s==00 && m==00)
        {
            s=59;
            m=59;
            h--;
        }if(s==00)
        {
            s=59;
            m--;

         }
        s--;
    }



}
