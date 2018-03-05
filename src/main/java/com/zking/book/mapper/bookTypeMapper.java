package com.zking.book.mapper;

import com.zking.book.model.bookType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface bookTypeMapper {
    int deleteByPrimaryKey(Integer tId);

    int insert(bookType record);

    int insertSelective(bookType record);

    bookType selectByPrimaryKey(Integer tId);

    int updateByPrimaryKeySelective(bookType record);

    int updateByPrimaryKey(bookType record);

    List<bookType> listTypeName(bookType bookType);
}