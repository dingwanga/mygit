package cn.bdqn.entity;

public class Greeting {

	private String person = "Nobody";
	private String words = "nothing";
	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public void sayGreeting() {
		System.out.println(person + "说：“" + words + "”正在学习"+book.getName());
	}

	public Greeting() {
		super();
	}

	public Greeting(String person, String words) {
		super();
		this.person = person;
		this.words = words;
	}

}
