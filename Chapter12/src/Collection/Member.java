package Collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {
	private int memberId;
	private String memberName;
	
	public Member () {}
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;
			
			if(this.memberId == member.memberId) {
				return true;
			}else return false;
		}
		return false;
	}

	@Override
	public int compareTo(Member member) {
		
		//return (this.memberId - member.memberId); //오름차순
		return (this.memberId - member.memberId) * (-1);  //내림차순
	}

	@Override
	public int compare(Member member1, Member member2) {
		return (member1.memberId - member2.memberId);
	}
	
	

}
