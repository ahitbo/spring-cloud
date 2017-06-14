package member.info.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.pool.DruidDataSource;

import member.info.dao.NlbpPigStyDao;
import member.info.domain.Member;
import member.info.domain.NlbpPigStyModel;

@RestController
@RequestMapping("/member")
public class MemberInfoService {
	@Autowired
	DruidDataSource druidDataSource;
	@Autowired
	NlbpPigStyDao nlbpPigStyDao;
	
	@GetMapping("baseinfo/{id}")
	@ResponseBody
	public Member queryById(@PathVariable("id") int id){
		Member member = new Member();
		member.setId(id);
		member.setName("大BOSS");
		member.setAge(18);
		member.setLevel(9);
		return member;
	}
	
	@GetMapping("sty/{id}")
	@ResponseBody
	public NlbpPigStyModel selectStyById(@PathVariable("id") Long id){
		return nlbpPigStyDao.selectByPrimaryKey(id);
	}
}

