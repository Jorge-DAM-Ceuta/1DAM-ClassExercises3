package pckg2;

import pckg1.Prueba;

public class Test {
    
    private char c1;
    protected char c2;
    
    public Test(){
    
    }
    
    public Test(char a, char b){
    
        c1=a;
        c2=b;        
    }
    
    public void setC1(char a){
    c1=a;
    }
    
    public void setC2(char b){
    c2=b;
    }
    
    public int getN1(){
    return c1;
    }
    
    public int getN2(){
    return c2;
    }
    
    public void printPrueba(){
    pckg2.Prueba t=new pckg2.Prueba();
        System.out.println(t.n2);
    }
    
    /*public void otraPrueba(){
    pckg1.Test o=new pckg1.Test();
        System.out.println(o.);
    }*/
    
}
