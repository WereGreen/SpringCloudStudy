package com.wsz.entity;

import com.test.entity.Book;
import com.test.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.List;

@Data
@AllArgsConstructor
public class BorrowDetail {
    User user;
    List<Book> bookList;

}