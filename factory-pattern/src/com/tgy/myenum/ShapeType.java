package com.tgy.myenum;


public enum ShapeType {
    CIRCLE(0,"圆形"),
    RECTANGLE(1,"矩形"),
    SQUARE(2,"正方形");
    private int code;
    private String desc;
    public int code(){//对外暴露的方法
        return code;
    }
    public String desc(){//对外暴露的方法
        return desc;
    }

    ShapeType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ShapeType getShape(int code) {
        for(ShapeType s:values()){
            if(s.code==code){
                return s;
            }
        }
        return null;
    }
}
