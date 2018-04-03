package CreationalPatterns.FactoryPattern;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside CreationalPatterns.FactoryPattern.Rectangle::draw() method.");
    }
}
