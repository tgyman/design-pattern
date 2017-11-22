package com.tgy.factory;

import com.tgy.myenum.*;
import com.tgy.iface.*;

/**
 * AbstractFactory
 *
 * @author Jerry Tong
 * @create 2017-11-22 14:27
 * @desc 抽象工厂
 */
public abstract class AbstractFactory {
   public abstract Shape getShape(ShapeType st);
   public abstract Color getColor(ColorType ct);
}
