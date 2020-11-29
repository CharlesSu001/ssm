package com.how2java.service.impl;

import java.util.List;

import com.how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;


    public List<Category> list() {
        return categoryMapper.list();
    }

    @Override
    public int total() {
        return categoryMapper.total();
    }

    @Override
    public List<Category> list(Page page) {
        return categoryMapper.list(page);
    }

    @Override
    public void add(Category c) {
        categoryMapper.add(c);

    }

    @Override
    public void update(Category c) {
        categoryMapper.update(c);
    }

    @Override
    public void delete(Category c) {
        categoryMapper.delete(c.getId());
    }

    @Override
    public Category get(int id) {
        return categoryMapper.get(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackForClassName = "Exception")
    public void addTwo() {
        Category c1=new Category();
        c1.setName("新的名字");
        categoryMapper.add(c1);

        Category c2=new Category();
        c2.setName("名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下," +
                "名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下," +
                "名字长对应字段放不下,名字长对应字段放不下,");
        categoryMapper.add(c2);
    }

    @Override
    public void deleteAll() {
        List<Category> cs=list();
        for(Category c:cs){
            categoryMapper.delete(c.getId());
        }

    }


}
