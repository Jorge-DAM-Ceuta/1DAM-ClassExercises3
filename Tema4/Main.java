package Tema4;

    import Diario.Alarma;
    import Mates.*;
    import Personal.Evento_Semanal;
    import Tema4.*;

public class Main {

    
    public static void main(String[] args) {
        
        /*Sumar a=new Sumar();
        a.suma(10, 60);*/
        
        
        /*Potenciar b=new Potenciar();
        System.out.println(b.potencia(2, 4));*/
        
        
        //Esto es un ejemplo de toString()
        /*Alarma n1=new Alarma("Lunes", 14);
        Alarma n2=new Alarma("Lunes", 14);
        Alarma n3=n1;
        
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println(n3.toString());*/
    
        
        /*Evento_Semanal cumpleaños=new Evento_Semanal("Cumpleaños", "Sabado", 19.23);
        Evento_Semanal comida=new Evento_Semanal("Comida", "Jueves", 14.15);
        Evento_Semanal copia=cumpleaños;
        copia=comida;
        
        cumpleaños.revisaEventos();
        comida.revisaEventos();
        copia.revisaEventos();
        
        System.out.println(cumpleaños.equals(comida));
        System.out.println(cumpleaños.equals(copia));
        System.out.println(comida.equals(copia));
    
        copia.setHora(20.35);
        copia.revisaEventos();
        cumpleaños.revisaEventos();
        comida.revisaEventos();

        //System.out.println(comida.toString());
        
        System.out.println(cumpleaños.clone());
        
        //Ejercicio 8
        System.out.println(cumpleaños.equals(copia));
        
        System.out.println("Numero de eventos activos: " + Evento_Semanal.getN_eventos());*/
        
        /*System.out.println(Math.cos(4.5));
        System.out.println(Math.sin(4.4));
        System.out.println(Math.tan(4.4));
        System.out.println(Math.max(4,6));
        System.out.println(Math.min(4,6));*/
        
        /*Operaciones n=new Operaciones();
        //System.out.println(n.sumaNaturales(5));
        //System.out.println(n.factorial(10));
        //System.out.println(n.fibonacci(8));
        System.out.println(n.sumaDigitos(73));*/
        
        Direcciones n=new Direcciones("23456789ABDE", "192.232.123.431");
        
        
    }
    
}
