package chapter8.project;

public class Book {
//필드
	private int number;
	private String title;
	private String author;
	private static int countOfBooks = 0;

	// 생성자
	public Book(String title, String author) {

		this.title = title;
		this.author = author;
		this.number = this.countOfBooks++;
	}

	// 메서드
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;

	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getLateFee(int lateDays) {
		return lateDays;
	}

	public boolean equals(Object object) {
//		if(this.author.equals(object.author))
		
		if (object instanceof Book) {
			Book book = (Book) object;
			return title.equals(book.title) && author == book.author;
		}
		return true;
	}

	@Override
	public String toString() {
		return "관리번호 " + (number+ 1) + "번 " + "책의 제목: " + title + ", 저자: " + author+ " 일주일 연체료: "+getLateFee(countOfBooks) ;
	}

}
