package admin.member;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="point",/*fallback=MemberFeignClientFallback.class*/fallbackFactory=MemberFeignClientFallbackFactory.class)
public interface PointFeignClient {
	@RequestMapping(value="/point/{memberId}",method=RequestMethod.GET)
	public int queryByMemberId(@PathVariable("memberId") int id);
}
