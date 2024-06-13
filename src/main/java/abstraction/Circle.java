package abstraction;

public  class Circle extends Shape implements Drawable, Extendable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius*radius*3.14;
    }

    public void draw(){
        System.out.println("draw circle");
    }

    @Override
    public void extend() {
        System.out.println("Extend circle");
    }
}
