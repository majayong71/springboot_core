package springtraining.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springtraining.core.discount.DiscountPolicy;
import springtraining.core.discount.FixDiscountPolicy;
import springtraining.core.discount.RateDiscountPolicy;
import springtraining.core.member.MemberRepository;
import springtraining.core.member.MemberService;
import springtraining.core.member.MemberServiceImpl;
import springtraining.core.member.MemoryMemberRepository;
import springtraining.core.order.OrderService;
import springtraining.core.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(),discountPolicy());
    }


    /**
     * 할인 정책을 바꾸고 싶을 땐 AppConfig 에 policy 를 바꿔주고,
     *
     * 할인율 , 값 을 변경 하고 싶을 땐 , 구현체 fix,rate 클래스에서 바꿔주면 된다.
     *
     * */
    @Bean
    public DiscountPolicy discountPolicy() {

        //return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
