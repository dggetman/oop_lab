package ru.ssau.tk._emptiness_._tasks.point;

public class Check {
    public static void main(String[] args) {
        Point firstPoint = new Point(7, 77, 777);
        Point secondPoint = new Point(10.09, 6.1, -2000.1996);
        System.out.println("First point: " + firstPoint.x + ' ' + firstPoint.y + ' ' + firstPoint.z);
        System.out.println("Second point: " + secondPoint.x + ' ' + secondPoint.y + ' ' + secondPoint.z);
        System.out.println("Sum: " + Points.sum(firstPoint, secondPoint).x + ' ' + Points.sum(firstPoint, secondPoint).y + ' ' + Points.sum(firstPoint, secondPoint).z);
        System.out.println("Subtract: " + Points.subtract(firstPoint, secondPoint).x + ' ' + Points.subtract(firstPoint, secondPoint).y + ' ' + Points.subtract(firstPoint, secondPoint).z);
        System.out.println("Multiply: " + Points.multiply(firstPoint, secondPoint).x + ' ' + Points.multiply(firstPoint, secondPoint).y + ' ' + Points.multiply(firstPoint, secondPoint).z);
        System.out.println("Divide: " + Points.divide(firstPoint, secondPoint).x + ' ' + Points.divide(firstPoint, secondPoint).y + ' ' + Points.divide(firstPoint, secondPoint).z);

        //1.5 task
        System.out.println("Multiplication firstPoint by number=9: " + Points.enlarge(firstPoint, 9).x + ' ' + Points.enlarge(firstPoint, 9).y + ' ' + Points.enlarge(firstPoint, 9).z);

        //1.6 task
        System.out.println("Length of radius vector of the first point: " + Points.length(firstPoint));
        System.out.println("Length of radius vector of the second point: " + Points.length(secondPoint));

        //1.7 task
        System.out.println("Opposite of first point: " + Points.opposite(firstPoint).x + ' ' + Points.opposite(firstPoint).y + ' ' + Points.opposite(firstPoint).z);
        System.out.println("Inverse of first point: " + Points.inverse(firstPoint).x + ' ' + Points.inverse(firstPoint).y + ' ' + Points.inverse(firstPoint).z);

        //1.8 task
        System.out.println("Vector product: " + Points.vectorProduct(firstPoint, secondPoint).x + ' ' + Points.vectorProduct(firstPoint, secondPoint).y + ' ' + Points.vectorProduct(firstPoint, secondPoint).z);
        System.out.println("Scalar product: " + Points.scalarProduct(firstPoint, secondPoint));
    }
}
