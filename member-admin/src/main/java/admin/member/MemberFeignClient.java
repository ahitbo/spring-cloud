package admin.member;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="member",/*fallback=MemberFeignClientFallback.class*/fallbackFactory=MemberFeignClientFallbackFactory.class)
public interface MemberFeignClient {
	@RequestMapping(value="/member/baseinfo/{id}",method=RequestMethod.GET)
	public Member baseinfo(@PathVariable("id") int id);
}
