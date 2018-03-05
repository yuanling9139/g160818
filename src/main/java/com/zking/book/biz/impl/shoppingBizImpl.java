package com.zking.book.biz.impl;

import com.zking.book.biz.IshoppingBiz;
import com.zking.book.mapper.bookShoppingMapper;
import com.zking.book.model.bookShopping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class shoppingBizImpl implements IshoppingBiz {
    @Autowired
    private bookShoppingMapper shoppingMapper;

    @Override
    public void addsop(bookShopping bookShopping) {
        shoppingMapper.insert(bookShopping);
    }

    @Override
    public bookShopping loadbid(bookShopping bookShopping) {
        return  shoppingMapper.loadbid(bookShopping);
    }

    @Override
    public void updateshop(bookShopping bookShopping) {
        shoppingMapper.updateshop(bookShopping);
    }
}
