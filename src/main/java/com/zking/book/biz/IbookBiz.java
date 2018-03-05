package com.zking.book.biz;

import com.zking.book.model.Bookr;

import java.util.List;

public interface IbookBiz {
    List<Bookr> list(Bookr bookr);

    List<Bookr> listtop(Bookr bookr);

    List<Bookr> listtype(Bookr bookr);

    void addbook(Bookr bookr);

    List<Bookr> listnotbook(Bookr bookr);

    void editzt(Bookr bookr);

    void delbook(Bookr bookr);

    Bookr loadedit(Bookr bookr);

    void editbook(Bookr bookr);
}
