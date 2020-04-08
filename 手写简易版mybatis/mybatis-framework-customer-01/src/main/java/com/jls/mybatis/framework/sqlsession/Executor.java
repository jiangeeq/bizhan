package com.jls.mybatis.framework.sqlsession;

import java.util.List;

import com.jls.mybatis.framework.config.Configuration;
import com.jls.mybatis.framework.config.MappedStatement;

public interface Executor {

	<T> List<T> query(Configuration configuration, MappedStatement mappedStatement, Object param);
}
