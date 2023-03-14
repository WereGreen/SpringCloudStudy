package com.wsz.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wsz.entity.BorrowDetail;
import com.wsz.service.BorrowService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collections;

@RestController
public class BorrowController {

    @Resource
    BorrowService service;

    @RequestMapping("/borrow/{uid}")
    BorrowDetail findUserBorrows(@PathVariable("uid") int uid){
        System.out.println("正常执行");
        return service.getBorrowDetailByUid(uid);
    }


}
