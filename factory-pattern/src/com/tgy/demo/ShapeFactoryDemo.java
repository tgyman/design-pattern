package com.tgy.demo;

import com.tgy.factory.ShapeFactory;
import com.tgy.iface.Shape;
import com.tgy.myenum.ShapeType;

/**
 * ShapeFactoryDemo
 *
 * @author Jerry Tong
 * @create 2017-11-22 11:17
 * @desc 图形工厂类测试主方法,演示设计模式-工厂模式
 */
public class ShapeFactoryDemo {
    public static void main(String[] args) {
        Shape shape=ShapeFactory.getShape("CIRCLE");
        shape.draw();
        Shape shape2=ShapeFactory.getShape(ShapeType.SQUARE);
        shape2.draw();
    }
}
