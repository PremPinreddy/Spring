package autowire_annotation;

public class FullAddress {
   String address;
	 
	 public void setAddress(String address)
	 {
		 this.address=address;
	 }
	 public String getAddress()
	 {
		 return this.address;
	 }
	 
	 FullAddress()
	 {
		 
	 }
	 public String toString()
	 {
		 return "FullAddress :"+address;
	 }
}
