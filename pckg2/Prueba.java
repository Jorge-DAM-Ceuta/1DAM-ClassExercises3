package pckg2;

import pckg1.Test;

public class Prueba {
    
    private int n1;
    protected int n2;
    
    public Prueba(){
    
    }
    
    public Prueba(int a, int b){
    
        n1=a;
        n2=b;
    }
    
    public void setN1(int a){
    n1=a;
    }
    
    public void setN2(int b){
    n2=b;
    }
    
    public int getN1(){
    return n1;
    }
    
    public int getN2(){
    return n2;
    }
    
    public void printTest(){
        pckg2.Test y=new pckg2.Test();
        System.out.println(y.c2);
    }
    
    /*public void otroTest(){
        pckg1.Test u=new pckg1.Test();
        System.out.println(u.);
    }*/
    
    
}
