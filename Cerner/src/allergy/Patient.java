package allergy;
import java.util.*;
public class Patient {
private List<Allergy> allergies = new ArrayList<Allergy> ();
private String name;
private int age;
List<Patient> patients = new ArrayList<Patient>();
public Patient(List<Allergy> allergies, String name, int age) {
	super();
	this.allergies = allergies;
	this.name = name;
	this.age = age;
}
public Patient()
{
	
}
public List<Allergy> getAllergies() {
	return allergies;
}
public void setAllergies(List<Allergy> allergies) {
	this.allergies = allergies;
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
public void displayAllergies()
{
	for(Allergy allergy: allergies)
		System.out.println(allergy.getName()+" "+allergy.getSymptoms());
	
}
public List<Allergy> displayAllegrgybBySymptom(String symptom)
{
	List<Allergy>a = new ArrayList<Allergy>();
	for(Allergy allergy: allergies)
	{
		Set<String> symptoms = allergy.getSymptoms();
		for(String sym: symptoms)
			if(sym.equals(symptom))
				a.add(allergy);
	}
	return a;
}
public static void main(String[] args) {
	Set<String> symptoms1 = new HashSet<String>();
	symptoms1.add("symptom1");
	symptoms1.add("symptom2");
	symptoms1.add("symptom3");
	symptoms1.add("symptom3");
	symptoms1.add("symptom2");
	Set<String> symptoms2 = new HashSet<String>();
	symptoms2.add("symptom1");
	symptoms2.add("symptom2");
	symptoms2.add("symptom3");
	symptoms2.add("symptom5");
	symptoms2.add("symptom4");
	Set<String> symptoms3 = new HashSet<String>();
	symptoms3.add("symptom1");
	symptoms3.add("symptom2");
	symptoms3.add("symptom2");
	symptoms3.add("symptom5");
	symptoms3.add("symptom3");
	Set<String> symptoms4 = new HashSet<String>();
	symptoms4.add("symptom1");
	symptoms4.add("symptom6");
	symptoms4.add("symptom3");
	symptoms4.add("symptom5");
	symptoms4.add("symptom5");
	Allergy allergy1 = new Allergy("allergy1", symptoms1, Severity.LOW, Reporter.RELATIVE, new Date(1233));
	Allergy allergy2 = new Allergy("allergy2", symptoms2, Severity.MEDIUM, Reporter.DOCTOR, new Date(998653));
	Allergy allergy3 = new Allergy("allergy3", symptoms3, Severity.HIGH, Reporter.RELATIVE, new Date(84854));
	Allergy allergy4 = new Allergy("allergy4", symptoms4, Severity.LOW, Reporter.PATIENT, new Date(3877854));
	List<Allergy> allergies1 = new ArrayList<Allergy> ();
	allergies1.add(allergy1);
	allergies1.add(allergy2);
	Patient p1 = new Patient(allergies1, "mounika", 24);
	List<Allergy> allergies2 = new ArrayList<Allergy> ();
	allergies2.add(allergy3);
	allergies2.add(allergy4);
	Patient p2 = new Patient(allergies2, "sagar", 25);
	List<Patient> patients = new ArrayList<Patient>();
	patients.add(p1);
	patients.add(p2);
	//patients.add(p3);
	
	/*for(Patient p: patients)
	{
		System.out.println(p.name);
		for(Allergy a: p.allergies)
			System.out.println(a.getName()+" "+a.getSeverity());
			
	}
	*/
	
	Patient p = new Patient();
	p.setAllergies(allergies1);
	p.displayAllergies();
	List<Allergy> resultList = p.displayAllegrgybBySymptom("symptom5");
	for(Allergy a: resultList)
		System.out.println(a.getName()+" "+a.getSeverity());
}
}
