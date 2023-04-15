class Shape {
    private String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Method to calculate area (placeholder)
    public double calculateArea() {
        return 0.0;
    }

    // Method to display shape details
    public void displayDetails() {
        System.out.println("Color: " + color);
    }
}

// Class representing a circle, inheriting from Shape class
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Method to calculate area of circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display circle details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Shape: Circle");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}

// Class representing a rectangle, inheriting from Shape class
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Method to display rectangle details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Shape: Rectangle");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
    }
}

// Main class to run the program
public class OOPsConcepts {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle classes
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        // Accessing object properties and methods
        circle.displayDetails();
        rectangle.displayDetails();
    }
}
//code get executed
// it has only overriden methods
