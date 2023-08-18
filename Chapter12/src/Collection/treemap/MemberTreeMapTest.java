package Collection.treemap;

import Collection.Member;
import Collection.treeset.MemberTreeSet;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeMap membertreeMap = new MemberTreeMap();
		
		Member lee = new Member(1001, "이지원");
		Member son = new Member(1002, "손민국");
		Member park = new Member(1003, "박서훤");
		Member hong = new Member(1004, "홍길동");
		
		membertreeMap.addMember(lee);
		membertreeMap.addMember(son);
		membertreeMap.addMember(park);
		membertreeMap.addMember(hong);
		
		membertreeMap.showAllMember();
		System.out.println();
		
		membertreeMap.removeMember(1002);
		
		membertreeMap.showAllMember();
	}

}
