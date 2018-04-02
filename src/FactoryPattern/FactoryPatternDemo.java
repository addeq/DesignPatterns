package FactoryPattern;

public class FactoryPatternDemo {
    public static void main (String [] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shapeCircle = shapeFactory.getFactory("CIRCLE");
        shapeCircle.draw();

        Shape shapeRectangle = shapeFactory.getFactory("RECTANGLE");
        shapeRectangle.draw();

        Shape shapeSquare= shapeFactory.getFactory("SQUARE");
        shapeSquare.draw();



    }
}
