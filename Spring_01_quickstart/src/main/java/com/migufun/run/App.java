package com.migufun.run;

import com.migufun.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author NJR10byh
 * @date 2022/8/14 21:09:50
 * @description IOC、DI
 */
public class App {
    public static void main(String[] args) {
        // 获取IOC容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        // bookDao.save();
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

        // 确保destory被执行
        ctx.registerShutdownHook();
    }
}
