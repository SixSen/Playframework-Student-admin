package models;

import play.*;
import play.data.validation.Required;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;


@Entity
public class Student extends Model {

	
	public String nameString;
	public String email;
	public String address;
	public double fees;
	public double credits;
	@Required
	@ManyToOne
	public Teacher myTeacher;
//	@Required
//	@ManyToMany
//	public Course myCourse;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String em, String add, double fe){
		nameString = name;
		email = em;
		address = add;
		fees =fe;
		
	} 
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nameString;
	}
}
