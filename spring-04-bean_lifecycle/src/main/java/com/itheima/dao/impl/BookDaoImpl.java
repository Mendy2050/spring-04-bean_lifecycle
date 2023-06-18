package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }

    //Operations corresponding to bean initialization
    public void init(){
        System.out.println("init...");
    }

    //Operations corresponding to bean pre-destruction
    public void destory(){
        System.out.println("destory...");
    }

}
