package com.shmily.service.impl;

import com.shmily.controller.Code;
import com.shmily.dao.BookDao;
import com.shmily.domain.Book;
import com.shmily.exception.BusinessException;
import com.shmily.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.shmily.service.impl
 * @ClassName: BookServiceImpl
 * @author: shmily
 * @createTime: 2023/7/12 20:20
 * @version: 17
 * @Description:
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    public Book getById(Integer id) {
        if(id == 1){
            throw new BusinessException(Code.BUSINESS_ERR,"请不要使用你的技术挑战我的耐性!");
        }
        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
