package com.jls.mybatis.framework.sqlsession;

import com.jls.mybatis.framework.config.Configuration;

public class DefaultSqlSessionFactory implements SqlSessionFactory {

	private Configuration configuration;

	public DefaultSqlSessionFactory(Configuration configuration) {
		this.configuration = configuration;
	}

	//真正实现SqlSession接口的代码
	@Override
	public SqlSession openSession() {

		return new DefaultSqlSession(configuration);
	}

}
