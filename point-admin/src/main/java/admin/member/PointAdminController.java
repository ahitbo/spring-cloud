package admin.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PointAdminController {

	@Autowired
	private PointFeignClient pointFeignClient;
	
	@GetMapping("/point/{memberId}")
	@ResponseBody
	public int queryByMemberId(@PathVariable("memberId") int id){
		//return restTemplate.getForObject("http://MEMBER/member/baseinfo/"+id, Member.class);
		return pointFeignClient.queryByMemberId(id);
	}
	
}
