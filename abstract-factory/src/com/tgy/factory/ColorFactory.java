package com.tgy.factory;

import com.tgy.iface.Color;
import com.tgy.iface.Shape;
import com.tgy.iface.impl.Blue;
import com.tgy.iface.impl.Green;
import com.tgy.iface.impl.Red;
import com.tgy.myenum.ColorType;
import com.tgy.myenum.ShapeType;

/**
 * ColorFactory
 *
 * @author Jerry Tong
 * @create 2017-11-22 14:34
 * @desc 颜色工厂
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(ColorType ct) {
       Color color=null;
       if(ColorType.RED==ct)
           color=new Red();
        if(ColorType.GREEN==ct)
            color=new Green();
        if(ColorType.BLUE==ct)
            color=new Blue();
       return color;
    }

    @Override
    public Shape getShape(ShapeType st) {
        return null;
    }
}
