package org.example.lld.visitor;

public class Square implements IShape<Double> {

    public Double side;

    @Override
    public Double accept(IGeometryVisitor<Double> geometryVisitor) {
        return geometryVisitor.visit(this);
    }
}
