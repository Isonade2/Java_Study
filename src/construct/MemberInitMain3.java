package construct;

import java.lang.reflect.Member;

public class MemberInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1",16,90);
        MemberInit member2 = new MemberInit();
        member2.initMember("user2",15,80);

        MemberInit[] members = {member1,member2};

        for(MemberInit s: members){
            System.out.printf("이름: %s 나이: %d 성적: %d\n",s.name,s.age,s.grade);
        }
    }
}
