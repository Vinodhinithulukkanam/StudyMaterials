package com.pattern.BasicConcept;

public class DrivContact {

	public static void main(String[] args) {
		Contact frnd=new FriendContact();
		frnd.name="Vinitha";
		((FriendContact)frnd).phoneNumber="8056240024";
		Contact colleuge=new WorkContact();
		colleuge.name="punitha";
		((WorkContact)colleuge).email="punitha@fss.co.in";
		System.out.println(frnd.toString());
		System.out.println(colleuge.toString());
	}

}
