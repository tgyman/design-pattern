package com.tgy.iface.impl;

import com.tgy.iface.Shape;

/**
 * Circle
 *
 * @author Jerry Tong
 * @create 2017-11-22 14:05
 * @desc 圆形
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw method.");
    }
}
