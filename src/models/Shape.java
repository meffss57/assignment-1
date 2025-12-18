package models;

import java.util.ArrayList;

public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    private ArrayList<Point> points;

    public Shape() {
        points = new ArrayList<>();
    }
    // addPoint(Point) - adds to the container
    public void addPoint(Point p) {
        points.add(p);
    }
    // calculatePerimeter()
    public double calculatePerimeter() {
        double perimeter = 0;

        for (int i = 0; i < points.size(); i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % points.size());
            perimeter += current.distance(next);
        }

        return perimeter;
    }
    // getAverageSide()
    public double getAverageSide() {
        return calculatePerimeter() / points.size();
    }
    // getLongestSide()
    public double getLongest() {
        double longest = 0;

        for (int i = 0; i < points.size(); i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % points.size());
            double length = current.distance(next);

            if (length > longest) {
                longest = length;
            }
        }

        return longest;
    }
}