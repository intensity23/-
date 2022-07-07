package chapter13;

public class Board {
	private String subject;
	private String content;
	private String writer;
	
	
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}


	@Override
	public String toString() {
		return String.format("%s\t%s\t%s", subject,content,writer); 
	}

	

}
