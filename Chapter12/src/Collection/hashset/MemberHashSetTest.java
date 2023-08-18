package Collection.hashset;

import Collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member lee = new Member(1001, "이지원");
		Member son = new Member(1002, "손민국");
		Member park = new Member(1003, "박서훤");
		Member hong = new Member(1004, "홍길동");
		
		memberHashSet.addMember(lee);
		memberHashSet.addMember(son);
		memberHashSet.addMember(park);
		memberHashSet.addMember(hong);
		
		memberHashSet.ShowAllmember();
		
		Member jun = new Member(1001,"이준석");
		memberHashSet.addMember(jun);
		memberHashSet.ShowAllmember();
	}

}
