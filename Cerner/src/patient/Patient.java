package patient;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

public class Patient {
private String name;
private int age;
private Calendar lastSeen;

Patient(){}
Patient(String name, int age, Calendar lastSeen)
{
	this.name = name;
	this.age = age;
	this.lastSeen = lastSeen;
	//this.patients =patients;
}
public Calendar getLastSeen() {
	return lastSeen;
}
public int getAge() {
	return age;
}
public String getName() {
	return name;
}


}


