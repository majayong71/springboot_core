package springtraining.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();

    /*HashMap 동시성 오류가 있을 수 있기 때문에
     ConcurrentHashMap 사용을 권장한다.
     실무에서는 동시성 오류가 있으니까
     여기선 간단한 예제 학습을 위해 간단하게 사용함.
    */

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
