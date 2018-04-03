package CreationalPatterns.AbstractFactoryPattern;
import CreationalPatterns.FactoryPattern.Shape;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
