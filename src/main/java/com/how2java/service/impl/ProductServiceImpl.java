/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ProductServiceImpl
 * Author:   苏晨宇
 * Date:     2020/11/18 13:35
 * Description: Product  service实现
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.how2java.service.impl;

import com.how2java.mapper.ProductMapper;
import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈Product  service实现〉
 *
 * @author 苏晨宇
 * @create 2020/11/18
 * @since 1.0.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> list(Map m) {
        return productMapper.list(m);
    }

    @Override
    public int total(Category c) {
        return productMapper.total(c);
    }

    @Override
    public void add(Product c) {
        productMapper.add(c);
    }

    @Override
    public void update(Product c) {
        productMapper.update(c);
    }

    @Override
    public void delete(Product c) {
        productMapper.delete(c.getId());
    }

    @Override
    public Product get(int id) {
        return productMapper.get(id);
    }
}
 
