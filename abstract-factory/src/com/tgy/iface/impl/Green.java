package com.tgy.iface.impl;

import com.tgy.iface.Color;

/**
 * Red
 *
 * @author Jerry Tong
 * @create 2017-11-22 14:29
 * @desc 红色
 */
public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Green::method fill.");
    }
}
