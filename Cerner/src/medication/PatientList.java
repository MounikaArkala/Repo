package medication;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import medication.Frequency.PartoftheDay;
//import patient.Patient;

public class PatientList {
	private Queue<Patient> patients = new ConcurrentLinkedQueue<Patient>();

	public PatientList(Queue<Patient> patients) {
		super();
		this.patients = patients;
	}

	public Queue<Patient> getPatients() {
		return patients;
	}

	public void setPatients(Queue<Patient> patients) {
		this.patients = patients;
	}
	public void updatePatientList()
	{
		Patient p = patients.poll();
		patients.add(p);
	}
	void displayPatientList()
	{
		for(Patient p: patients)
		{
			System.out.println(p.getName());
		}
	}
	public void notifyAlarm()
	{
		System.out.println("for the date 21/10/2018");
		 Calendar currentDate1 = new GregorianCalendar(2018, 10, 26);

		 int count =0;
		 for(Patient p: this.patients)
		 {
			 System.out.println("----"+p.getName());
			for(Medication m : p.getMedications()) 
			{
				if(currentDate1.compareTo(m.getStart())>=0 && currentDate1.compareTo(m.getEnd())<=0)
				{
					System.out.print("patient "+ p.getName()+" must be given medicine today for ");
				for(Frequency f: m.getFrequencyList())
					System.out.println(f.part);
				//p.removeAndADDMedication();
				//p.displayMedications();
				}
			System.out.println(currentDate1.compareTo(m.getEnd())>0);
				 if((currentDate1.compareTo(m.getEnd())>0))
			{
					System.out.println("hello");
					p.removeMedication(m);
					p.displayMedications();
			}
				 
			}
			this.updatePatientList();
			this.displayPatientList();
			count++;
			if(count==patients.size())
				return;
				
		 }
		 
		

	
	}
	public static void main(String[] args) {
		Calendar startDate1 = new GregorianCalendar(2018, 10, 21);
		Calendar endDate1 = new GregorianCalendar(2018, 10, 25);
		Frequency freq1 = new Frequency(PartoftheDay.Morning);
		Frequency freq2 = new Frequency(PartoftheDay.Night);
		List<Frequency> frequencyList1 = new ArrayList<Frequency>() ;
		frequencyList1.add(freq1);
		frequencyList1.add(freq2);
		Medication medication1 = new Medication("name1", "disease1", "composition1", "details1", frequencyList1,startDate1,endDate1 );
			
		Calendar startDate2 = new GregorianCalendar(2018, 10, 22);
		Calendar endDate2 = new GregorianCalendar(2018, 10, 26);
		Frequency freq3 = new Frequency(PartoftheDay.Afternoon);
		Frequency freq4 = new Frequency(PartoftheDay.Night);
		List<Frequency> frequencyList2 = new ArrayList<Frequency>() ;
		frequencyList2.add(freq3);
		frequencyList2.add(freq4);
		Medication medication2 = new Medication("name2", "disease2", "composition2", "details2", frequencyList2,startDate2,endDate2 );
		Queue<Medication> medicationsList1 = new LinkedList<Medication>() ;
		medicationsList1.add(medication1);
		medicationsList1.add(medication2);
		Patient p1 = new Patient("mounika", 24 ,medicationsList1);
		
		Calendar startDate3 = new GregorianCalendar(2018, 10, 21);
		Calendar endDate3 = new GregorianCalendar(2018, 10, 24);
		//System.out.println(endDate3.compareTo(startDate3));
		Frequency freq5 = new Frequency(PartoftheDay.Afternoon);
		Frequency freq6 = new Frequency(PartoftheDay.Evening);
		List<Frequency> frequencyList3 = new ArrayList<Frequency>() ;
		frequencyList3.add(freq5);
		frequencyList3.add(freq6);
		Medication medication3 = new Medication("name3", "disease3", "composition3", "details3", frequencyList3,startDate3,endDate3 );
		Queue<Medication> medicationsList2 = new LinkedList<Medication>() ;
		medicationsList2.add(medication3);
		Patient p2 = new Patient("sagar", 28 ,medicationsList2);
		Queue<Patient> q = new ConcurrentLinkedQueue<Patient>();
		 q.add(p1);
		 q.add(p2);
		 PatientList lis = new PatientList(q);
		 lis.notifyAlarm();
		 //lis.displayPatientList();
		
}
}
