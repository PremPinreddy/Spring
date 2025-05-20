package autowire;

public class Address {

	 String address;
	 
	 public void setAddress(String address)
	 {
		 this.address=address;
	 }
	 public String getAddress()
	 {
		 return this.address;
	 }
	 
	 Address()
	 {
		 
	 }
	 public String toString()
	 {
		 return "Address :"+address;
	 }
}
