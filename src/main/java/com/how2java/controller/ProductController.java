/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ProductController
 * Author:   苏晨宇
 * Date:     2020/11/18 13:40
 * Description: Controller配置
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.how2java.controller;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import com.how2java.service.CategoryService;
import com.how2java.service.ProductService;
import com.how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈Controller配置〉
 *
 * @author 苏晨宇
 * @create 2020/11/18
 * @since 1.0.0
 */
@Controller
@RequestMapping("")
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;

    @RequestMapping("listProduct")
    public ModelAndView listProduct(Category category, Page page) {
        System.out.println(category);
        category = categoryService.get(category.getId());
        System.out.println(category);
        ModelAndView mav = new ModelAndView();

        Map m = new HashMap<>();
        m.put("category", category);
        m.put("page", page);

        List<Product> ps = productService.list(m);
        int total = productService.total(category);

        page.caculateLast(total);

        //放入转发参数
        mav.addObject("ps", ps);
        mav.addObject("category", category);

        //放入jsp路径
        mav.setViewName("listProduct");
        return mav;
    }


    @RequestMapping("addProduct")
    public ModelAndView addProduct(Product product) {
        System.out.println(product);
        productService.add(product);
        ModelAndView mav = new ModelAndView("redirect:/listProduct?id=" + product.getCategory().getId());
        return mav;
    }

    @RequestMapping("deleteProduct")
    public ModelAndView deleteProduct(Product product) {
        product = productService.get(product.getId());
        productService.delete(product);
        ModelAndView mav = new ModelAndView("redirect:/listProduct?id=" + product.getCategory().getId());
        return mav;
    }

    @RequestMapping("editProduct")
    public ModelAndView editProduct(Product product) {
        Product p = productService.get(product.getId());
        ModelAndView mav = new ModelAndView("editProduct");
        mav.addObject("p", p);
        return mav;
    }

    @RequestMapping("updateProduct")
    public ModelAndView updateProduct(Product product) {
        productService.update(product);
        ModelAndView mav = new ModelAndView("redirect:/listProduct?id=" + product.getCategory().getId());
        return mav;
    }
}
 
