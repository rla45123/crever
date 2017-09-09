package com.crever.service.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.crever.utils.DynamicValueObject;
@Repository
public class AjaxPersistence {
	@Inject private SqlSession sqlSession;
	private final String NAMESPACE ="mapper.AjaxMapper";
	public SqlSession getSqlSession() {return sqlSession;}
	public void setSqlSession(SqlSession sqlSession) {this.sqlSession = sqlSession;}
	
	public List<DynamicValueObject> getDateTime(DynamicValueObject dy){
		return sqlSession.selectList(NAMESPACE+".schedule_list",dy);
	}
}
