package com.wsz.service.impl;

import com.test.entity.Book;
import com.wsz.mapper.BookMapper;
import com.wsz.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper mapper;

    @Override
    public Book getBookById(int bid) {
        return mapper.getBookById(bid);
    }
}
