package collections;

import java.util.List;
import java.util.Set;
import java.util.Map;


public class Emp {
	private String Name;
	private List<String> Phones;
	private Set<String> Address;
	private Map<String , String> Courses;
	
	public Emp() {
        System.out.println("Default constructor called");
    }
	
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public void setPhones(List<String> Phones)
	{
		this.Phones=Phones;
	}
	public void setAddress(Set<String> Address)
	{
		this.Address=Address;
	}
	public void setCourses(Map<String,String> Courses)
	{
		this.Courses=Courses;
	}
	
	public String getName()
	{ 
		return this.Name;
	}
	public List<String> getPhones()
	{
		return this.Phones;
	}
	public Set<String> getAddress()
	{
		return this.Address;
	}
	public Map<String,String> getCourses()
	{
		return this.Courses=Courses;
	}
	public Emp(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
		Name = name;
		Phones = phones;
		Address = address;
		Courses = courses;
	}
	@Override
	public String toString() {
		return "Emp [Name=" + Name + ", Phones=" + Phones + ", Address=" + Address + ", Courses=" + Courses + "]";
	}
	
	
	

}
