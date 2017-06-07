package admin.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysServiceController {
	@Autowired
	private SysFeignClient sysFeignClient;
	
	@GetMapping("/sys/{servicename}")
	public String serviceInfo(@PathVariable("servicename") String serviceName) {
		return sysFeignClient.serviceInfo(serviceName);
	}

}
