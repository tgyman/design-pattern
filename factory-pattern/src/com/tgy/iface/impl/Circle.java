package com.tgy.iface.impl;

import com.tgy.iface.Shape;

/**
 * Circle
 *
 * @author Jerry Tong
 * @create 2017-11-22 11:00
 * @desc 圆形类
 */
public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
