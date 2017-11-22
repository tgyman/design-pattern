package com.tgy.factory;

import com.tgy.myenum.FactoryType;

/**
 * FactoryProducer
 *
 * @author Jerry Tong
 * @create 2017-11-22 14:47
 * @desc 工厂生产者
 */
public class FactoryProducer {
    public  static AbstractFactory getFactory(FactoryType ft){
        AbstractFactory af=null;
        if(FactoryType.SHAPE_FACTORY==ft)
            af=new ShapeFactory();
        if(FactoryType.COLOR_FACTORY==ft)
            af=new ColorFactory();
        return af;
    }
}
