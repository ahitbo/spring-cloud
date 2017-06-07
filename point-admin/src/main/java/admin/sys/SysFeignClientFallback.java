package admin.sys;

import org.springframework.stereotype.Component;

@Component
public class SysFeignClientFallback implements SysFeignClient{

	public String serviceInfo(String serviceName) {
		return "XxXxX";
	}

}
