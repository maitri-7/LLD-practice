package org.example.lld.visitor;

public class GetAreaVisitor implements IGeometryVisitor<Double> {
    @Override
    public Double visit(Circle c) {
        System.out.println(c.radius*2*Math.PI);
        return c.radius*2*Math.PI;
    }

    @Override
    public Double visit(Square s) {
        return s.side*s.side;
    }
}
