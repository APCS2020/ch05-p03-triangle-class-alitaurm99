public class Triangle{
    private double base;
    private double height;
    private String color;
    public Triangle(){
        base = 6.0;
        height = 10.0;
        color = "red";
    }
    public Triangle(double b, double h, String color){
        base = b;
        height = h;
        this.color = color;
    }
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
    public String color(){
        return color;
    }
    
    public void setBase(double b){
       base = b;
    }
    public void setHeight(double h){
        height = h;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        return base * height / 2;
    }
}
