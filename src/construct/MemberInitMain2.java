package construct;

import java.lang.reflect.Member;

public class MemberInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        MemberInit member2 = new MemberInit();
        initMember(member1, "user1",15,90);
        initMember(member2, "user2",16,80);

        MemberInit[] members = {member1,member2};

        for(MemberInit s : members){
            System.out.printf("이름: %s 나이: %d 성적: %d\n",s.name,s.age,s.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
