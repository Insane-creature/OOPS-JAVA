abstract class Shape{
    // Abstract method for calculating area and parameter
    public abstract double CalcArea();
    public abstract double CalcParameter();
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double CalcArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public double CalcParameter(){
        return 2 * Math.PI * radius;
    }
}

class main{
    public static void main(String[] args) {
        Shape circle = new Circle(1);
        System.out.println("Circle Area: " + circle.CalcArea());
        System.out.println("Circle Perimeter: " + circle.CalcParameter());
    }
}
