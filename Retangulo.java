package entities;

public class Retangulo {

    public double width;
    public double height;

    public double getArea() {
        return width*height;
    }
    public double getPerimeter() {
        return 2*width + 2*height;
    }
    public double getDiagonal() {
        return Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0)); //Pitágoras
    }
    
}
