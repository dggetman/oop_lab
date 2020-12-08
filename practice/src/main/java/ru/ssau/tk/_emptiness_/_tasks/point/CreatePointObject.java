package ru.ssau.tk._emptiness_._tasks.point;

public class CreatePointObject {
    public static void main(String[] args) {
        Point zeroPoint = new Point(0, 0, 0);
        Point firstPoint = new Point(1, 2, 3);
        Point secondPoint = new Point(66.66, 99.99, -8888.8888);

        System.out.println("Zero point: " + zeroPoint.x + ' ' + zeroPoint.y + ' ' + zeroPoint.z);
        System.out.println("First point: " + firstPoint.x + ' ' + firstPoint.y + ' ' + firstPoint.z);
        System.out.println("Second point: " + secondPoint.x + ' ' + secondPoint.y + ' ' + secondPoint.z);
    }
}
