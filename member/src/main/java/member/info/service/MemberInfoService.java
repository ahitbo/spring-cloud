package member.info.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import member.info.domain.Member;

@RestController
@RequestMapping("/member")
public class MemberInfoService {

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
}
