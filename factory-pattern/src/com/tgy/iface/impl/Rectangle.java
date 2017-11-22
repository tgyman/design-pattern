package com.tgy.iface.impl;

import com.tgy.iface.Shape;

/**
 * Circle
 *
 * @author Jerry Tong
 * @create 2017-11-22 11:00
 * @desc 矩形类
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
