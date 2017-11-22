package com.tgy.myenum;

/**
 * ColorType
 *
 * @author Jerry Tong
 * @create 2017-11-22 14:15
 * @desc 颜色枚举
 */
public enum ColorType {
    RED(0,"红色"),
    GREEN(1,"绿色"),
    BLUE(2,"蓝色");
    private int code;
    private String desc;

    ColorType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int code() {
        return code;
    }
    public String desc(){
        return desc;
    }
    public static ColorType getColorType(int code){
        ColorType colorType=null;
        for (ColorType c:values()) {
            if(c.code==code){
                colorType=c;
                break;
            }
        }
        return colorType;
    }
}
