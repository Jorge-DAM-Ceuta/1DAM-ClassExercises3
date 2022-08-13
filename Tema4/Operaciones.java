package Tema4;


public class Operaciones implements Operaciones_Simples{
    
    
    public int sumaNaturales(int a){
    
        if(a==1){
        
            return 1;
        }else{
        
            //System.out.println(a);
            return a+sumaNaturales(a-1);
        }
    }
    
    public int factorial(int a){
    
        if(a==1){
        
            return 1;
        }else{
        
            //System.out.println(a);
            return a*factorial(a-1);
        }
    }
    
    public int fibonacci(int a){
    
        if(a==0){
        
            return 0;
            
        }if(a==1){
           
            //System.out.println(a);
            return 1;
        }
        return fibonacci(a-1)+fibonacci(a-2);
    }
    
    public int sumaDigitos(int a){
    
        if(a==0){
        
            return 0;
        }else{
        
            return sumaDigitos(a/10)+a%10;
        }
    }

    public int suma(int a, int b) {
        return a+b;
    }

    public int resta(int a, int b) {
        return a-b;
    }

    public int multiplicacion(int a, int b) {
        return a*b;
    }

    public int división(int a, int b) {
        return a/b;
    }
    
    
}
