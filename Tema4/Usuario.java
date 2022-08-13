package Tema4;

import java.time.LocalDate;

public class Usuario {
    
    private String nombre_Usuario, contraseña, email;
    private LocalDate fecha;

    public Usuario(){
        nombre_Usuario="";
        contraseña="";
        email="";
        fecha=null;
    }
    
    public Usuario(String nu, String e, String c){
        if(nombre_Usuario.contains(" ") || nombre_Usuario.isEmpty()){
            System.out.println("Error con el usuario");
        }else{
            this.nombre_Usuario=nu;
        }
        
        if(!email.contains("@") || email.isEmpty()){
            System.out.println("Error con el email");
        }else{
            this.email=e;
        }
        
        boolean c8= (c.length()>=8);
        boolean cMay= !c.equals(c.toLowerCase());
        boolean cMin= !c.equals(c.toUpperCase());
        
        if(c8 && cMay && cMin){
            this.contraseña=c;
        }else{
            System.out.println("Error con la contraseña");
        }
        
        this.fecha=LocalDate.now();
    }
    
    public Usuario(Usuario copia){
        this.nombre_Usuario=copia.nombre_Usuario;
        this.contraseña=copia.contraseña;
        this.email=copia.email;
        this.fecha=copia.fecha;
    }
    
}
