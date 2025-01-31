package org.example.lld.visitor;

public interface IGeometryVisitor<T> {
    T visit(Circle c);
    T visit(Square s);
}
