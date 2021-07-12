package com.pattern.BasicConcept;

public class Contact {
 public String name;

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	String temp="";
	if(this instanceof FriendContact){
		temp =  "Contact [" + (name != null ? "name=" + name : "") +  (((FriendContact)this).phoneNumber != null ? "phoneNumber=" + ((FriendContact)this).phoneNumber : "") + "]";
	}else if(this instanceof WorkContact){
		temp =  "Contact [" + (name != null ? "name=" + name : "") +  (((WorkContact)this).email != null ? "email=" + ((WorkContact)this).email : "") + "]";
	}
	return temp;
}
}
