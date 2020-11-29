/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ProductMapper
 * Author:   苏晨宇
 * Date:     2020/11/18 13:05
 * Description: 映射product_
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.how2java.mapper;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;

import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈映射product_〉
 *
 * @author 苏晨宇
 * @create 2020/11/18
 * @since 1.0.0
 */
public interface ProductMapper {
    public int add(Product product);

    public void delete(int id);

    public Product get(int id);

    public int update(Product product);

    public List<Product> list(Map m);

    public int total(Category c);
}
 
