package com.zking.book.mapper;

import com.zking.book.model.bookUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface bookUserMapper {
    int deleteByPrimaryKey(Integer uId);

    int insert(bookUser record);

    int insertSelective(bookUser record);

    bookUser selectByPrimaryKey(Integer uId);

    int updateByPrimaryKeySelective(bookUser record);

    int updateByPrimaryKey(bookUser record);

    bookUser login(bookUser bookUser);
}