package Collection.hashmap;

import Collection.Member;
import Collection.treeset.MemberTreeSet;

public class MemberHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member lee = new Member(1001, "이지원");
		Member son = new Member(1002, "손민국");
		Member park = new Member(1003, "박서훤");
		Member hong = new Member(1004, "홍길동");
		
		memberHashMap.addMember(lee);
		memberHashMap.addMember(son);
		memberHashMap.addMember(park);
		memberHashMap.addMember(hong);
		
		memberHashMap.showAllMember();
		System.out.println();
		
		memberHashMap.removeMember(1002);
		
		memberHashMap.showAllMember();
	}

}
