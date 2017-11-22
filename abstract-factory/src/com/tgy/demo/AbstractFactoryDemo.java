package com.tgy.demo;

import com.tgy.factory.AbstractFactory;
import com.tgy.factory.FactoryProducer;
import com.tgy.myenum.ColorType;
import com.tgy.myenum.FactoryType;
import com.tgy.iface.*;
import com.tgy.myenum.ShapeType;

/**
 * AbstractFactoryDemo
 *
 * @author Jerry Tong
 * @create 2017-11-22 14:49
 * @desc 抽象工厂测试demo
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory= FactoryProducer.getFactory(FactoryType.SHAPE_FACTORY);
        Shape shape=shapeFactory.getShape(ShapeType.CIRCLE);
        shape.draw();
        AbstractFactory colorFactory= FactoryProducer.getFactory(FactoryType.COLOR_FACTORY);
        Color color=colorFactory.getColor(ColorType.BLUE);
        color.fill();
    }


}
