package org.example.lld.visitor;

public interface IShape<T> {
    T accept(IGeometryVisitor<T> geometryVisitor);
}
