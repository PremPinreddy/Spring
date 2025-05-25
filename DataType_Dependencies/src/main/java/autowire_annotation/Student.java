package autowire_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Autowired
	@Qualifier("address1")
    private Address address;
    @Autowired
    private FullAddress fullAddress;
	public Address getAddress() {
		return address;
	}
	
//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public FullAddress getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(FullAddress fullAddress) {
		this.fullAddress = fullAddress;
	}

	@Override
	public String toString() {
		return "Student [Address ="+address+"    FullAddress=" + fullAddress + "]";
	}
	
//	@Autowired
	public Student(FullAddress fullAddress) {
		super();
		this.fullAddress = fullAddress;
	}

	public Student() {
		super();
	}
    
    
}
