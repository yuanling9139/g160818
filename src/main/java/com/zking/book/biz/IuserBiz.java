package com.zking.book.biz;

import com.zking.book.model.bookUser;

import java.util.List;

public interface IuserBiz {
    void addreq(bookUser bookUser);

    bookUser login(bookUser bookUser);
}
