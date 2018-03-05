package com.zking.book.mapper;

import com.zking.book.model.Bookr;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookrMapper {
    int deleteByPrimaryKey(Integer bId);

    int insert(Bookr record);

    int insertSelective(Bookr record);

    Bookr selectByPrimaryKey(Integer bId);

    int updateByPrimaryKeySelective(Bookr record);

    int updateByPrimaryKey(Bookr record);

    List<Bookr> list(Bookr bookr);

    List<Bookr> listtop(Bookr bookr);

    List<Bookr> listtype(Bookr bookr);

    List<Bookr> listzt(Bookr bookr);

    void editzt(Bookr bookr);
}