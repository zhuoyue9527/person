package com.imooc.product.dataobject;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Data
//@Table(name="T_proxxxx")
@Entity
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String  productDescription;

    private String productIcon ;

    private Integer productStatus ;

    private Integer categoryType;

    private Date createTime ;

    private Date updateTime ;


}

