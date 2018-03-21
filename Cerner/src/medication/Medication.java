package medication;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Medication {
	private String name;
	private String disease;
	private String composition;
	private String details;
	private List<Frequency> frequencyList;
	private Calendar start;
	private Calendar end;
	public Calendar getStart() {
		return start;
	}
	public void setStart(Calendar start) {
		this.start = start;
	}
	public Calendar getEnd() {
		return end;
	}
	public Medication(String name, String disease, String composition, String details, List<Frequency> frequencyList,
			Calendar start, Calendar end) {
		super();
		this.name = name;
		this.disease = disease;
		this.composition = composition;
		this.details = details;
		this.frequencyList = frequencyList;
		this.start = start;
		this.end = end;
	}
	
	public Medication(String name, String disease, String composition, String details, List<Frequency> frequencyList,
			Calendar start) {
		super();
		this.name = name;
		this.disease = disease;
		this.composition = composition;
		this.details = details;
		this.frequencyList = frequencyList;
		this.start = start;
	}
	public void setEnd(Calendar end) {
		this.end = end;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getComposition() {
		return composition;
	}
	public void setComposition(String composition) {
		this.composition = composition;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public List<Frequency> getFrequencyList() {
		return frequencyList;
	}
	public void setFrequencyList(List<Frequency> frequencyList) {
		this.frequencyList = frequencyList;
	}
	
}
