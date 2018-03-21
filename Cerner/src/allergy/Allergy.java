package allergy;

import java.util.Date;
import java.util.Set;

public class Allergy {
private String name;
private Set<String> symptoms;
private Severity severity;
private Reporter reporter;
private Date timeReported;
public Allergy(String name, Set<String> symptoms, Severity severity, Reporter reporter, Date timeReported) {
	super();
	this.name = name;
	this.symptoms = symptoms;
	this.severity = severity;
	this.reporter = reporter;
	this.timeReported = timeReported;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Set<String> getSymptoms() {
	return symptoms;
}
public void setSymptoms(Set<String> symptoms) {
	this.symptoms = symptoms;
}
public Severity getSeverity() {
	return severity;
}
public void setSeverity(Severity severity) {
	this.severity = severity;
}
public Reporter getReporter() {
	return reporter;
}
public void setReporter(Reporter reporter) {
	this.reporter = reporter;
}
public Date getTimeReported() {
	return timeReported;
}
public void setTimeReported(Date timeReported) {
	this.timeReported = timeReported;
}

}
