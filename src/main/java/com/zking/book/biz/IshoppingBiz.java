package com.zking.book.biz;

import com.zking.book.model.bookShopping;


public interface IshoppingBiz {

    void addsop(bookShopping bookShopping);

    bookShopping loadbid(bookShopping bookShopping);

    void updateshop(bookShopping bookShopping);
}
