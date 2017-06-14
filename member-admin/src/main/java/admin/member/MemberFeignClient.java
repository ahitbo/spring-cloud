package admin.member;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@FeignClient(name="member",fallbackFactory=MemberFeignClientFallbackFactory.class,configuration=admin.config.FeignConfig.class)
public interface MemberFeignClient {
	@RequestMapping(value="/member/baseinfo/{id}",method=RequestMethod.GET)
	@HystrixCommand(threadPoolKey="member",groupKey="member",commandKey="baseinfo"
	)
	public Member baseinfo(@PathVariable("id") int id);
}
