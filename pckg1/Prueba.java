package pckg1;

import pckg2.Test;

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
        pckg1.Test t=new pckg1.Test();
        System.out.println(t.c2);
    }
    
    /*public void otroTest(){
        pckg2.Test y=new pckg2.Test();
        System.out.println(y.);
    }*/
}
