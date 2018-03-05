package com.zking.book.mapper;

import com.zking.book.model.bookShopping;
import org.springframework.stereotype.Repository;

@Repository
public interface bookShoppingMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(bookShopping record);

    int insertSelective(bookShopping record);

    bookShopping selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(bookShopping record);

    int updateByPrimaryKey(bookShopping record);

    bookShopping loadbid(bookShopping bookShopping);

    void updateshop(bookShopping bookShopping);

}