package com.imooc.product.service;

import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.repository.ProductInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {


    /**
     * 查询所有在架商品
     */
    List<ProductInfo> findAll();
}
