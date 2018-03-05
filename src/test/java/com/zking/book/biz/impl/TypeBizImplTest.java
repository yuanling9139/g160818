package com.zking.book.biz.impl;

import com.zking.book.mapper.bookTypeMapper;
import com.zking.book.model.bookType;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class TypeBizImplTest extends BaseTest {
    @Autowired
    private  bookTypeMapper bookTypeMapper;
    private bookType bookType;
    @Before
    public void setUp() throws Exception {
        super.setUp();
        bookType = new bookType();
    }

    @Test
    public void listtypename() throws Exception {
        List<bookType> list=bookTypeMapper.listTypeName(bookType);
        for (bookType b : list) {
            System.out.println(b);
        }
    }

}