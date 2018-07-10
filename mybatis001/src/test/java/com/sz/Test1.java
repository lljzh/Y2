package com.sz;

import com.sz.dao.bookDao;
import com.sz.utils.mybatis.uitl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import com.sz.entity.book;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test1 {
    @Test
    public void m1(){
        //定义mybatis核心配置文件的位置
        String resource ="mybatis-cfg.xml";
        //通过mybatis的工具类加载这个文件的输入流
        InputStream in =null;
        SqlSessionFactory sessionFactory=null;
        SqlSession sqlSession=null;
        try {
          in = Resources.getResourceAsStream(resource);
            //创建一个会话工厂
            sessionFactory=new SqlSessionFactoryBuilder().build(in);
            //利用工厂生产会话
            sqlSession=sessionFactory.openSession();
            bookDao book= sqlSession.getMapper(bookDao.class);
            List<book> book1=book.listAll();
            System.out.println(book1);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void m2(){
        SqlSession sqlSession= uitl.getSession();
        bookDao mapper=sqlSession.getMapper(bookDao.class);
        List<book> book=mapper.listAll();
        System.out.println(book);
        if(sqlSession!=null){
            sqlSession.close();
        }
    }
}
