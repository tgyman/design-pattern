package com.tgy.iface.impl;

import com.tgy.iface.Shape;

/**
 * Rectangle
 *
 * @author Jerry Tong
 * @create 2017-11-22 14:06
 * @desc 矩形
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::method draw.");
    }
}
