package Diario;


public class Alarma {
  
    private String dia;
    protected double hora;
    
    public Alarma(){
        
        dia="";
        hora=0;
    }
    
    public Alarma(String d, double h){
    
        dia=d;
        hora=h;
    }
    
    public void setDia(String d){
    
        if(d.equals("Lunes")){
        dia=d;
        }
        
        if(d.equals("Martes")){
        dia=d;
        }
        
        if(d.equals("Miercoles")){
        dia=d;
        }
        
        if(d.equals("Jueves")){
        dia=d;
        }
        
        if(d.equals("Viernes")){
        dia=d;
        }
        
        if(d.equals("Sabado")){
        dia=d;
        }
        
        if(d.equals("Domingo")){
        dia=d;
        }
        
    }
    
    public void setHora(double h){
    
        hora=h;
    }
    
    public String getDia(){
    
        return dia;
    }
    
    public double getHora(){
    
        return hora;
    }
    
    
}
