package admin.member;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class MemberFeignClientFallbackFactory implements FallbackFactory<MemberFeignClient> {


	@Override
	public MemberFeignClient create(Throwable arg0) {
		System.out.println(arg0);
		return new MemberFeignClient() {
			
			@Override
			public Member baseinfo(int id) {
				Member member = new Member();
				member.setId(-2);
				return member;
			}
		};
	}

}
