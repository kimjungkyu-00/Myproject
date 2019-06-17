package database;

import java.util.Date;

public class Border {
	String title ;
	String author;
	String content;
	Date   date;
	
	public Border() {}
	
	public Border(String title, String author, String content, Date date) {
		this.title = title;
		this.author = author;
		this.content = content;
		this.date = date;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
