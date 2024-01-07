package construct;

public class MemberInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();

        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();

        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;

        MemberInit[] members = {member1,member2};

        for(MemberInit s : members){
            System.out.printf("이름: %s 나이: %d 성적: %d\n",s.name,s.age,s.grade);
        }

    }
}