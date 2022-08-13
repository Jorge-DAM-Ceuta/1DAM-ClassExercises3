package Tema4;


public class Direcciones {
    
    protected String direccionMAC, direccionIP;
    
    public Direcciones(){
        direccionMAC="";
        direccionIP="";
    }
    
    public Direcciones(String dM, String dI){
        if(dM.length()==12){
            for(int i=0; i<12; i++){                
                if((dM.charAt(i)>='A' && dM.charAt(i)<='F') || (dM.charAt(i)>='0' && dM.charAt(i)<='9')){
                    if(i==11){
                        direccionMAC=dM;
                        System.out.println(direccionMAC);
                    } 
                }
            }
        }else{
                System.out.println("Error, direccion MAC no valida");
        }
        
        int o1=Integer.parseInt(dI.substring(0, 3));
        int o2=Integer.parseInt(dI.substring(4, 7));
        int o3=Integer.parseInt(dI.substring(8, 11));
        int o4=Integer.parseInt(dI.substring(12, 14));
        
        if(dI.length()==15){
            if((o1>0 && o1<=255) && (o2>0 && o2<=255) && (o3>0 && o3<=255) && (o4>0 && o4<=255)){
                direccionIP=dI;
            }
        }else{
            System.err.println("Error, direccion IP no valida");
        }
    }
    
}
