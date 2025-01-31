package org.example.lld.visitor;

public class VisitorRunner {
    public static void main(String[] args) {
        // we have shapes and we want to get area of the shapes
        //ideally we can use shape: interface
        // have methods like getArea and let concrete implementations of the shape take care of it
        //what if tomorrow we want to calculate perimeter as well and we have 20 implementations of shape
        // thats where there is a problem. We can use visitor pattern in this case.

        //use visitor when you know that:
//        new operations need to be added frequently
//        the hierarchy of classes i.e new shapes is known and not expected to change

        IShape<Double> s = new Circle(4.0);
        IGeometryVisitor<Double> areaVisitor = new GetAreaVisitor();

        s.accept(areaVisitor);
    }
}
