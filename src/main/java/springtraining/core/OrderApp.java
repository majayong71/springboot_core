package springtraining.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springtraining.core.member.Grade;
import springtraining.core.member.Member;
import springtraining.core.member.MemberService;
import springtraining.core.member.MemberServiceImpl;
import springtraining.core.order.Order;
import springtraining.core.order.OrderService;
import springtraining.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {

//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);



        Long memberId = 1L;
        Member member = new Member(memberId ,"memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId,"itemA",2664815);
        System.out.println("order = " + order);
        System.out.println("order.calculatePrice = " + order.calculatePrice());


    }
}
