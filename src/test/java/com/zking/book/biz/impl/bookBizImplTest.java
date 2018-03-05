package com.zking.book.biz.impl;

import com.zking.book.biz.IbookBiz;
import com.zking.book.model.Bookr;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;
import java.awt.print.Book;
import java.util.List;

import static org.junit.Assert.*;

public class bookBizImplTest extends BaseTest{
    @Autowired
    private IbookBiz bookBiz;

    private Bookr bookr;
    @Before
    public void setUp() throws Exception {
        super.setUp();
        bookr = new Bookr();
    }

    @Test
    public void list() throws Exception {
        List<Bookr> list=bookBiz.list(bookr);
        for (Bookr b : list) {
            System.out.println(b.getbBt()+"标题"+b.getbJg()+"价格");
        }
    }

}