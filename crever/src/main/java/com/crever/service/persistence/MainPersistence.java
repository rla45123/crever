package com.crever.service.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.crever.utils.DynamicValueObject;
@Repository
public class MainPersistence {
	@Inject private SqlSession sqlSession;
	private final String NAMESPACE ="mapper.MainMapper";
	public SqlSession getSqlSession() {return sqlSession;}
	public void setSqlSession(SqlSession sqlSession) {this.sqlSession = sqlSession;}
	
	public int image_add(DynamicValueObject dy){
		return sqlSession.insert(NAMESPACE+".image_add",dy);
	}
}
