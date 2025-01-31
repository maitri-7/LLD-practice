package org.example.lld.visitor;

public class Circle implements IShape<Double> {

    public Double radius;

    public Circle (Double radius) {
        this.radius = radius;
    }

    @Override
    public Double accept(IGeometryVisitor<Double> geometryVisitor) {
        return geometryVisitor.visit(this);
    }
}
