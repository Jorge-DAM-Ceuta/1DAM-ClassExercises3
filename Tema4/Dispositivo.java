package Tema4;


public class Dispositivo {
    
    private Direcciones n;
    private String codigo_Identificacion, departamento;
    
    public Dispositivo(){
        codigo_Identificacion="";
        departamento="";
        n=new Direcciones();
    }
    
    public Dispositivo(String c, String d, String MAC, String IP){
        
        
        if(departamento!="informatica" || departamento!="comercio" || departamento!="administracion"){
            System.err.println("No existe el departamento");
        }else{
            this.departamento=d;
            
            if(!codigo_Identificacion.contains(departamento.substring(0, 1))){
                System.err.println("Error en el codigo");
            }else {
                this.codigo_Identificacion=c;
            }
        }
        
        if(MAC.length()==12){
            for(int i=0; i<12; i++){                
                if((MAC.charAt(i)>='A' && MAC.charAt(i)<='F') || (MAC.charAt(i)>='0' && MAC.charAt(i)<='9')){
                    if(i==11){
                        n.direccionMAC=MAC;
                        System.out.println(n.direccionMAC);
                    } 
                }    
            } 
        }            
        
        int o1=Integer.parseInt(IP.substring(0, 3));
        int o2=Integer.parseInt(IP.substring(4, 7));
        int o3=Integer.parseInt(IP.substring(8, 11));
        int o4=Integer.parseInt(IP.substring(12, 14));
        
        if(IP.length()==15){
            if((o1>0 && o1<=255) && (o2>0 && o2<=255) && (o3>0 && o3<=255) && (o4>0 && o4<=255)){
                n.direccionIP=IP;
            }
        }
    }

    
    public Dispositivo(Dispositivo v){
        v.codigo_Identificacion=this.codigo_Identificacion;
        v.departamento=this.departamento;
        v.n.direccionIP=this.n.direccionIP;
        v.n.direccionMAC=this.n.direccionMAC;
    }
    
    public String toString(){
        String estado="El dispositivo "+codigo_Identificacion+" perteneciente al departamento "+departamento+ " con direccion MAC "+ n.direccionMAC + " y direccion IP " + n.direccionIP;
        return estado;
    }
    
    public Dispositivo clone(){
        Dispositivo v=new Dispositivo();
        
        v.codigo_Identificacion=this.codigo_Identificacion;
        v.departamento=this.departamento;
        v.n.direccionIP=this.n.direccionIP;
        v.n.direccionMAC=this.n.direccionMAC;
        
        return v;
    }
}
