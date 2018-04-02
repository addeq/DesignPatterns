package FactoryPattern;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside FactoryPattern.Rectangle::draw() method.");
    }
}
