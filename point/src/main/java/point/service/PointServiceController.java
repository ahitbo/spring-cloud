package point.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PointServiceController {

	@GetMapping("/point/{memberId}")
	public int queryByMemberId(@PathVariable("memberId") int memberId){
		return memberId+1;
	}
}
