package java8features;

import java.util.Arrays;



public class Address {
	//Your code here
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private Integer pincode;
   
   
    
    public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public Address(){
        
    }
    
    public Address(String addressLine1, String addressLine2, String city,String state, int pincode){
        this.addressLine1=addressLine1;
        this.addressLine2=addressLine2;
        this.city=city;
        this.state=state;
        this.pincode=pincode;
    }
   
    public static void main(String[] args){
    	int[] arr=new int[3];
    	Arrays.fill(arr,30);
    	for(int var1=0;var1<arr.length;var1++)
    		System.out.println(arr[var1]);
    }
    
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(addressLine1);
		sb.append('\n');
		sb.append(addressLine2);
		sb.append('\n');
		sb.append(city);
		sb.append(state);
		sb.append('\n');
		sb.append(pincode);
		sb.append('\n');
        return sb.toString();
        
	}
}
