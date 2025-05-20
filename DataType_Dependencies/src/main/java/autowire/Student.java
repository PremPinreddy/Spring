package autowire;

public class Student {
    private Address address;
    private FullAddress fullAddress;
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [FullAddress=" + fullAddress + "]";
	}

	public Student(FullAddress fullAddress) {
		super();
		this.fullAddress = fullAddress;
	}

	public Student() {
		super();
	}
    
    
}
