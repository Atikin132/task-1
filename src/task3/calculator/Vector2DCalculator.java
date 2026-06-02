package task3.calculator;

import task3.Calculator;
import task3.Vector2D;

public class Vector2DCalculator implements Calculator<Vector2D> {
    @Override
    public Vector2D sum(Vector2D a, Vector2D b) {
        return new Vector2D(a.getX() + b.getX(), a.getY() + b.getY());
    }

    @Override
    public Vector2D subtract(Vector2D a, Vector2D b) {
        return new Vector2D(a.getX() - b.getX(), a.getY() - b.getY());
    }

    @Override
    public Vector2D multiply(Vector2D a, Vector2D b) {
        return new Vector2D(a.getX() * b.getX(), a.getY() * b.getY());
    }

    @Override
    public Vector2D divide(Vector2D a, Vector2D b) {
        return new Vector2D(a.getX() / b.getX(), a.getY() / b.getY());
    }
}
