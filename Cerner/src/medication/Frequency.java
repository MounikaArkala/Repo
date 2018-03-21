package medication;

public class Frequency {
	public PartoftheDay part;
	public enum PartoftheDay
	{
	    Morning,
	    Afternoon,
	    Evening,
	    Night
	}
	public Frequency(PartoftheDay part) {
		this.part = part;
	}
	public PartoftheDay getPart() {
		return part;
	}
	public void setPart(PartoftheDay part) {
		this.part = part;
	}
	
}
