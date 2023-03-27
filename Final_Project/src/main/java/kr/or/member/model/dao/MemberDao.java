package kr.or.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.member.model.vo.Member;

@Repository
public class MemberDao {
	@Autowired
	private SqlSessionTemplate sqlSession;

	public MemberDao() {
		super();
		System.out.println("MemberDao 생성완료");
	}

	public void join(Member m) {
		sqlSession.insert("member.join",m);
	}
	
}
