package springtraining.core.order;

import springtraining.core.discount.DiscountPolicy;
import springtraining.core.discount.FixDiscountPolicy;
import springtraining.core.discount.RateDiscountPolicy;
import springtraining.core.member.Member;
import springtraining.core.member.MemberRepository;
import springtraining.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member,itemPrice);

        return new Order(memberId,itemName,itemPrice,discountPrice);
    }
}
