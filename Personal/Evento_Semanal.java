package Personal;

import Diario.Alarma;

public class Evento_Semanal {
    
    private String descripción;
    private Alarma a;
    private static int eventoActivo=0;
    
    public Evento_Semanal(String d, String di, double h){
    
        descripción=d;
        a=new Alarma(di, h);
        eventoActivo++;
    }
    
    public void setDescripción(String d){
    
        descripción=d;
    }
    
    public void setA(String di, double h){
        
        a=new Alarma(di, h);
    }
    
    public String getDescripcion(){
    
        return descripción;
    }
    
    public double getHora(){
    
        return a.getHora();
    }
    
    public String getDia(){
    
        return a.getDia();
    }
    
    public void revisaEventos(){
    
        String diaAlarma=a.getDia();
        for(int i=1; i<=7; i++){
        
            if(i==1 && diaAlarma.equals("Lunes")){
                System.out.println("Hay un evento de " + descripción + ", hoy lunes a las: " + a.getHora());
            }
            
            if(i==2 && diaAlarma.equals("Martes")){
                System.out.println("Hay un evento de " + descripción + ", hoy Martes a las: " + a.getHora());
            }
            
            if(i==3 && diaAlarma.equals("Miercoles")){
                System.out.println("Hay un evento de " + descripción + ", hoy Miercoles a las: " + a.getHora());
            }
            
            if(i==4 && diaAlarma.equals("Jueves")){
                System.out.println("Hay un evento de " + descripción + ", hoy Jueves a las: " + a.getHora());
            }
            
            if(i==5 && diaAlarma.equals("Viernes")){
                System.out.println("Hay un evento de " + descripción + ", hoy Viernes a las: " + a.getHora());
            }
            
            if(i==6 && diaAlarma.equals("Sabado")){
                System.out.println("Hay un evento de " + descripción + ", hoy Sabado a las: " + a.getHora());
            }
            
            if(i==7 && diaAlarma.equals("Domingo")){
                System.out.println("Hay un evento de " + descripción + ", hoy Domingo a las: " + a.getHora());
            }
        }
    }
    
    public void setHora(double h){
    
        a.setHora(h);
    }
    
    public String toString(){
    
        String resumen;
        resumen="Este evento es " + descripción + " el " + getHora() + " a las " + getDia();
        return resumen;
    }
    
    public Evento_Semanal clone(){
    
        Evento_Semanal copia= new Evento_Semanal(this.descripción, this.a.getDia(), this.a.getHora());
        return copia;
    }
    
    public boolean equals(Evento_Semanal ev){
    
    boolean equal;
        
        if(this.descripción.equals(ev.descripción) && this.a.getDia().equals(ev.a.getDia()) && this.a.getHora()==ev.a.getHora()){
            equal=true;
        }else{
            equal=false;
        }
    
        return equal;
    }
    
    public static int getN_eventos(){
        
        return eventoActivo;
    }
    
}
