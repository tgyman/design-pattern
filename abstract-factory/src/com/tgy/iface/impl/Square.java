package com.tgy.iface.impl;

import com.tgy.iface.Shape;

/**
 * Square
 *
 * @author Jerry Tong
 * @create 2017-11-22 14:07
 * @desc 正方形
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::method draw.");
    }
}
