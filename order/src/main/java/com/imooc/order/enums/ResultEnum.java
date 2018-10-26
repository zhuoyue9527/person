package com.imooc.order.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {
    PARAM_ERROR(1,"参数错误"),
    CART_EMPTY(2,"购物车为空")
        ;
    private Integer code ;
    private String messge;

     ResultEnum(Integer code, String messge) {
        this.code = code;
        this.messge = messge;
    }
}
