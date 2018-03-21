package medication;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import medication.Frequency.PartoftheDay;

public class Patient {
	private String name;
	private int age;
	private Queue<Medication> medications;
	public Patient(String name, int age, Queue<Medication> medications) {
		this.name = name;
		this.age = age;
		this.medications = medications;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Queue<Medication> getMedications() {
		return medications;
	}
	public void setMedications(Queue<Medication> medications) {
		this.medications = medications;
	}
	public void removeAndADDMedication()
	{
		Medication m = medications.poll();
		medications.add(m);
		
	}
	public void removeMedication(Medication m)
	{
		medications.remove(m);
		//medications.add(m);
	}
	public void displayMedications()
	{
		for(Medication m: this.medications)
			System.out.println(m.getName());
	}
	}
