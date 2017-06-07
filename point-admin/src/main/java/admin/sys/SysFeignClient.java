package admin.sys;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import admin.config.FeignConfig;

@FeignClient(name="sys",url="http://localhost:8761/eureka",configuration=FeignConfig.class,fallback=SysFeignClientFallback.class)

public interface SysFeignClient {
	
	@RequestMapping(value = "/apps/{serviceName}")
	public String serviceInfo(@PathVariable("serviceName") String serviceName);
}
