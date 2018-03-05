package com.zking.book.biz.impl;

import com.zking.book.biz.IbookBiz;
import com.zking.book.mapper.BookrMapper;
import com.zking.book.model.Bookr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class bookBizImpl implements IbookBiz {

    @Autowired
    private BookrMapper bkrmapper;
    @Override
    public List<Bookr> list(Bookr bookr) {
       List<Bookr> list= bkrmapper.list(bookr);
        return list;
    }

    @Override
    public List<Bookr> listtop(Bookr bookr) {
       List<Bookr> list=bkrmapper.listtop(bookr);
        return list;
    }

    @Override
    public List<Bookr> listtype(Bookr bookr) {
        List<Bookr> list=bkrmapper.listtype(bookr);
        return list;
    }

    @Override
    public void addbook(Bookr bookr) {
        bkrmapper.insert(bookr);
    }

    @Override
    public List<Bookr> listnotbook(Bookr bookr) {
        return bkrmapper.listzt(bookr);
    }

    @Override
    public void editzt(Bookr bookr) {
        bkrmapper.editzt(bookr);
    }

    @Override
    public void delbook(Bookr bookr) {
        bkrmapper.deleteByPrimaryKey(bookr.getbId());
    }

    @Override
    public Bookr loadedit(Bookr bookr) {
       Bookr bk= bkrmapper.selectByPrimaryKey(bookr.getbId());
        return bk;
    }

    @Override
    public void editbook(Bookr bookr) {
        bkrmapper.updateByPrimaryKey(bookr);
    }

}
