package org.zerock;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.zerock.domain.MemberVO;
import org.zerock.mapper.MemberMapper;

public class MemberMapperTest extends SpringBootExApplicationTests{

	@Autowired
	private MemberMapper mapper;
	
	/*@Test
	public void testInsert() throws Exception{
		MemberVO vo = new MemberVO();
		
		vo.setUserid("user543");
		vo.setUserpw("user543");
		
		vo.setUsername("Billy kang");
		vo.setEmail("zerockcode@gmail.com");
		
		mapper.create(vo);
	};*/
	
	@Test
	public void testLogin() throws Exception{
		MemberVO vo = mapper.login("user543", "user543");
		
		System.out.println(vo);
	}
	
}
