package com.sz.utils.mybatis;

import com.sz.dao.bookDao;
import com.sz.entity.book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class uitl {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        //定义mybatis核心配置文件的位置
        String resource ="mybatis-cfg.xml";
        //通过mybatis的工具类加载这个文件的输入流
        InputStream in =null;
        SqlSessionFactory sessionFactory=null;
        SqlSession sqlSession=null;

        try {
            in = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建一个会话工厂
            sessionFactory=new SqlSessionFactoryBuilder().build(in);
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
    }
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}

