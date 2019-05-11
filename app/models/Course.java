package models;

import play.*;
import play.data.validation.Required;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;


@Entity
public class Course extends Model {

	
	public String Cname;
	public String classroom;
	@Required
	@ManyToOne
	public Teacher couresTeacher;
	
	//@OneToMany(mappedBy = "myCourse", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	public List<Student> students;
//	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String name, String room, Teacher te){
		Cname = name;
		classroom = room;
		couresTeacher = te;
		
	} 
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Cname;
	}
}
