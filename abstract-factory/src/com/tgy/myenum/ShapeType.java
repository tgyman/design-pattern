package com.tgy.myenum;

/**
 * ShapeType
 *
 * @author Jerry Tong
 * @create 2017-11-22 14:09
 * @desc 图形枚举
 */
public enum ShapeType {
    CIRCLE(0,"圆形"),
    RECTANGLE(1,"矩形"),
    SQUARE(2,"正方形");
    private int code;
    private String desc;

    ShapeType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int code(){
        return code;
    }
    public String desc(){
        return desc;
    }
    public static ShapeType getShape(int code){
        ShapeType shapeType=null;
        for(ShapeType s:values()){
            if(s.code==code)
                return s;
        }
        return shapeType;
    }
}
