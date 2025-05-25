package stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Prem Chandra Reddy")
	private String name;
	@Value("Information Technology")
	private String study;
	@Value("CBIT")
	private String college;
	
	@Value("#{subjects}")
	private List<String> subjects;
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudy() {
		return study;
	}
	public void setStudy(String study) {
		this.study = study;
	}
	public String getcollege() {
		return college;
	}
	public void setcollege(String college) {
		this.college = college;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", study=" + study + ", college=" + college + "]";
	}
}
