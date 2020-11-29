/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Product
 * Author:   苏晨宇
 * Date:     2020/11/18 13:00
 * Description: 实体类Product
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.how2java.pojo;

/**
 * 〈一句话功能简述〉<br>
 * 〈实体类Product〉
 *
 * @author 苏晨宇
 * @create 2020/11/18
 * @since 1.0.0
 */
public class Product {
    private int id;
    private String name;
    private float price;
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
    }
}
 
