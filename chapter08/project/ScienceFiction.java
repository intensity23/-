package chapter8.project;

public class ScienceFiction extends Book {
	
	public ScienceFiction(String title, String author) {
		super(title, author);
	}
	public int getLateFee(int lateDays) {
		return lateDays*600;
	}

}
