package admin.member;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class MemberFeignClientFallbackFactory implements FallbackFactory<PointFeignClient> {


	@Override
	public PointFeignClient create(Throwable arg0) {
		System.out.println("MemberFeignClientFallbackFactory error :"+arg0);
		return new PointFeignClient() {
			@Override
			public int queryByMemberId(int id) {
				return -1;
			}
		};
	}

}
