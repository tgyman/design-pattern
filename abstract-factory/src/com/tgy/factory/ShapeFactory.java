package com.tgy.factory;

import com.tgy.iface.*;
import com.tgy.iface.impl.*;
import com.tgy.myenum.*;

/**
 * ShapeFactory
 *
 * @author Jerry Tong
 * @create 2017-11-22 14:34
 * @desc 图形工厂
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(ShapeType st) {
        Shape shape=null;
        if(ShapeType.CIRCLE==st)
            shape=new Circle();
        if(ShapeType.RECTANGLE==st)
            shape=new Rectangle();
        if(ShapeType.SQUARE==st)
            shape=new Square();
        return shape;
    }

    @Override
    public Color getColor(ColorType ct) {
        return null;
    }
}
