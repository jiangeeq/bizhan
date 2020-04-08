package com.jls.mybatis.test;

import java.io.InputStream;

import com.jls.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.builder.xml.XMLConfigBuilder;
import org.junit.Test;

public class MybatisTest {

	@Test
	public void test() throws Exception {
		// 指定全局配置文件的类路径
		String resource = "SqlMapConfig2.xml";
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(resource);
		// InputStream inputStream = Resources.getResourceAsStream(resource);

		XMLConfigBuilder builder = new XMLConfigBuilder(inputStream);
		Configuration configuration = builder.parse();
		System.out.println(configuration);
	}

	@Test
	public void test1() throws Exception {
		// 指定全局配置文件的类路径
		String resource = "SqlMapConfig2.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);

		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession sqlSession = sqlSessionFactory.openSession();

		User user = sqlSession.selectOne("findUserById", 1);

		System.out.println(user);
	}
}
