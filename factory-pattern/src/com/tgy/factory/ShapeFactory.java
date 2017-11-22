package com.tgy.factory;

import com.tgy.iface.Shape;
import com.tgy.iface.impl.Circle;
import com.tgy.iface.impl.Rectangle;
import com.tgy.iface.impl.Square;
import com.tgy.myenum.ShapeType;

/**
 * ShapeFactory
 *
 * @author Jerry Tong
 * @create 2017-11-22 11:10
 * @desc 图形制造工厂
 */
public class ShapeFactory {
    public static Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
    public static Shape getShape(ShapeType s){
        Shape shape=null;
        if(ShapeType.CIRCLE==s)
            shape=new Circle();
        if(ShapeType.RECTANGLE==s)
            shape=new Rectangle();
        if(ShapeType.SQUARE==s)
            shape=new Square();
        return shape;
    }
}
