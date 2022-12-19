package springtraining.core.member;

public enum Grade {
    BASIC,
    VIP
}

/**  enum 은 클래스의 성격을 갖고있고 ,
 *  위 코드는
 *
 *  public static final Grade BASIC = new BASIC();
 *  public static final Grade VIP = new VIP();
 *
 *  의 의미와 같다.
 *
 *  enum 은 코드를 간략하게 해주고 문법적인 지원을 해준다.
 *  switch 에 사용하려면 데이터타입에 한계를 갖게되는데,
 *  enum 을 이용하게되면 switch 문에 조건 데이터로 대입할 수 있게 된다.
 *
 * 단순히 어떤 상수로서의 기능만 하는게 아니라 ,
 * 그 상수가 어떠한 값을 갖게 하는 등 , 더 많은 일을 할 수 있게 만드는 것.
 * 더 적은 코드로 더 많은것을 할 수 있게 한다.
 *
 *  참고 : https://www.youtube.com/watch?v=3Xwko1gOjZQ / 생활코딩
 */