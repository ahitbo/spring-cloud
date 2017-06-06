package admin.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MemberAdmin {

	@Autowired
	private MemberFeignClient memberFeignClient;
	
	@GetMapping("/member/{id}")
	@ResponseBody
	public Member queryInfo(@PathVariable("id") int id){
		//return restTemplate.getForObject("http://MEMBER/member/baseinfo/"+id, Member.class);
		return memberFeignClient.baseinfo(id);
	}
}
