public class TestGeometricObject {
    public static void main(String[] args){
        Circle c=new Circle(1);
        System.out.println("A circle " + c.toString());
        System.out.println("The color is " + c.getColor());
        System.out.println("The radius is " + c.getRadius());
        System.out.println("The area is " + c.getArea());
        System.out.println("The diameter is " + c.getDiameter());

        Rectangle r=new Rectangle(2,4);
        System.out.println("A rectangle " + r.toString());
        System.out.println("The area is " + r.getArea());
        System.out.println("The perimeter is " + r.getPerimeter());
    }
}
