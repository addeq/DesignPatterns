package CreationalPatterns.AbstractFactoryPattern;

import CreationalPatterns.FactoryPattern.Shape;

public class AbstractFactoryPatternDemo {
        public static void main(String [] args){
            AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
            Shape shape = shapeFactory.getShape("CIRCLE");
            shape.draw();

            AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
            Color color = colorFactory.getColor("BLUE");
            color.fill();
        }
}
