package Collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import Collection.Member;

public class MemberTreeSet {
private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member()); 
		//comparator를 사용하려면 TreeSet의 생성자에 기본생성자를 넣어줘야함
		//오류나고 -> Member class가서 default Constructor 선언해주면 끝
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
		
	public boolean removeMember2(int memberId) {
		Iterator<Member> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			int tempId = member.getMemberId();
			if( memberId == tempId) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void ShowAllmember() {
		for (Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
