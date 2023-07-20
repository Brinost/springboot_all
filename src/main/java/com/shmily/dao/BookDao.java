package com.shmily.dao;

import com.shmily.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.shmily.dao
 * @ClassName: BookDao
 * @author: shmily
 * @createTime: 2023/7/12 20:20
 * @version: 17
 * @Description:
 */
@Mapper  //TODO springboot 扫描到组件，生成自动代理
public interface BookDao {

    //@Insert("insert into tbl_book values(null,#{type},#{name},#{description})")
    @Insert("insert into tbl_book (type,name,description)values(#{type},#{name},#{description})")
    public int save(Book book);
    @Update("update tbl_book set type=#{type},name=#{name},description=#{description} where id=#{id}")
    public int update(Book book);
    @Delete("delete from tbl_book where id = #{id}")
    public int delete(Integer id);

    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from tbl_book")
    public List<Book> getAll();

}
