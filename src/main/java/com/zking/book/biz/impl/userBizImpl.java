package com.zking.book.biz.impl;

import com.zking.book.biz.IuserBiz;
import com.zking.book.mapper.bookUserMapper;
import com.zking.book.model.bookUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userBizImpl implements IuserBiz {
   @Autowired
   private bookUserMapper buserMapper;
    @Override
    public void addreq(bookUser bookUser) {
        buserMapper.insert(bookUser);
    }

    @Override
    public bookUser login(bookUser bookUser) {
        return buserMapper.login(bookUser);
    }
}
