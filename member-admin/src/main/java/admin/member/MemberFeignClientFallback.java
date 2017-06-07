package admin.member;

import org.springframework.stereotype.Component;

@Component
public class MemberFeignClientFallback implements MemberFeignClient {

	@Override
	public Member baseinfo(int id) {
		Member member = new Member();
		member.setId(-1);
		return member;
	}

}
