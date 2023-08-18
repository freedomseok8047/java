package Collection.arraylist;

import Collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberArrayList memberArrayList = new MemberArrayList();
		Member lee = new Member(1001, "이지원");
		Member son = new Member(1002, "손민국");
		Member park = new Member(1003, "박서훤");
		Member hong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(lee);
		memberArrayList.addMember(son);
		memberArrayList.addMember(park);
		memberArrayList.addMember(hong);
		
		memberArrayList.ShowAllmember();
		memberArrayList.removeMember(hong.getMemberId());
		memberArrayList.ShowAllmember();
		
		memberArrayList.insertMember(hong, 2);
		memberArrayList.ShowAllmember();
		
	}

}
