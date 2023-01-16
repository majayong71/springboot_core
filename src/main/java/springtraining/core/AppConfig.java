package springtraining.core;

import springtraining.core.member.MemberService;
import springtraining.core.member.MemberServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl();


    }
}
