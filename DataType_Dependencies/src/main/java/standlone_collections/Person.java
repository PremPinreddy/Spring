package standlone_collections;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	private ArrayList<String> friends;

	public ArrayList<String> getFriends() {
		return friends;
	}

	public void setFriends(ArrayList<String> friends) {
		this.friends = friends;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + "]";
	}
	
	
	

}
