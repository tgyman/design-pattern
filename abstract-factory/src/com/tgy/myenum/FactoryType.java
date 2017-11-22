package com.tgy.myenum;

/**
 * FactoryType
 *
 * @author Jerry Tong
 * @create 2017-11-22 14:19
 * @desc 工厂枚举
 */
public enum FactoryType {
    SHAPE_FACTORY(0,"图形工厂"),
    COLOR_FACTORY(1,"颜色工厂");
    private int code;
    private String desc;

    FactoryType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    public int code(){
        return code;
    }
    public String desc(){
        return desc;
    }
    public static FactoryType getFactoryType(int code){
        FactoryType factoryType=null;
        for(FactoryType f:values()){
            if(f.code==code){
                factoryType=f;
                break;
            }
        }
        return factoryType;
    }
}
