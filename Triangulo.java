package entities;

public class Triangulo {
    public double a; //atributo do tipo public pode ser acessada por outro arquivo
    public double b;
    public double c;

    public double getArea(){
        double p = (a + b + c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
}
