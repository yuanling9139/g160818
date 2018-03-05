package com.zking.book.biz.impl;

import com.zking.book.biz.ItypeBiz;
import com.zking.book.mapper.bookTypeMapper;
import com.zking.book.model.bookType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeBizImpl implements ItypeBiz {
    @Autowired
    private bookTypeMapper bTypeMapper;
    @Override
    public List<bookType> listtypename(bookType bookType) {
        return bTypeMapper.listTypeName(bookType);
    }
}
