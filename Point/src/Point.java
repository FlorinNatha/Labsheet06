
import java.util.Scanner;

public class Point {
    private Scanner scanner=new Scanner(System.in);
    private int numberOfObjects;
    private double x;
    private double y;
    private double Pi = Math.PI;



    public void getNumberObjects() {
        //System.out.println("Enter the number of objects:");
        //numberOfObjects = scanner.nextInt();
        numberOfObjects++;

    }

    public void getCoordinates() {
        System.out.println("Enter the coordinates:");
        System.out.print("Enter the x:");
        x = scanner.nextDouble();
        System.out.print("Enter the y:");
        y = scanner.nextDouble();

    }

    public void getCoordinatesAndAngleInDegrees() {
        double degrees= Math.toDegrees(Math.atan(y/x));
        System.out.println("Angle in Degrees = " + degrees);
    }

    public void getCoordinatesAndAngleInRadians() {
        double radians = Math.atan(y/x);
        System.out.println("Angle in Radians = " + radians);

    }

    public void calculateDistanceFromAnotherPoint() {
        double x2 , y2;
        System.out.println("Enter the x value: ");
        x2= scanner.nextDouble();
        System.out.println("Enter the y value: ");
        y2 = scanner.nextDouble();

        double temp=Math.pow((x2 - x),2) + Math.pow((y2 -y),2);
        double distance = Math.sqrt(temp);
        System.out.println("Distance from another point= " + distance);


    }

    public void calculateDistanceFromOrigin() {
        double temp= Math.pow(x,2) + Math.pow(y,2);
        double distance = Math.sqrt(temp);
        System.out.println("Distance from origin = " + distance);

    }

    public void printCoordinate() {
        System.out.println("Coordinate: (" + x + "," + y + ")");

    }

    public static void main(String[] args) {
        Point point1 = new Point();
        point1.getNumberObjects();
        point1.getCoordinates();
        point1.printCoordinate();
        point1.getCoordinatesAndAngleInDegrees();
        point1.getCoordinatesAndAngleInRadians();
        point1.calculateDistanceFromAnotherPoint();
        point1.calculateDistanceFromOrigin();

    }
}
