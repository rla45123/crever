package com.crever.app;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAO {
	@Inject private SqlSession sqlSession;
	private final String NAMESPACE ="mapper.TestMapper";
	public SqlSession getSqlSession() {return sqlSession;}
	public void setSqlSession(SqlSession sqlSession) {this.sqlSession = sqlSession;}
	
	public List<TestVO> select(){
		return sqlSession.selectList(NAMESPACE+".list");
	}
	
	public int insert(){
		TestVO vo = new TestVO();
		vo.setName("ohs");
		return sqlSession.insert(NAMESPACE+".insert",vo);
	}
	
}
