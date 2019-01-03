package edu.spring.domain;

import java.util.Date;

public class Board {
	
	private int bno;			// 글번호
	private String userId;		// 글작성자
	private String category;	// 카테고리
	private String title;		// 글제목
	private String content;		// 글내용
	private Date regDate;		// 글 작성시간
	
	public Board() {}

	public Board(int bno, String userId, String category, String title, String content, Date regDate) {
		super();
		this.bno = bno;
		this.userId = userId;
		this.category = category;
		this.title = title;
		this.content = content;
		this.regDate = regDate;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Board [bno=" + bno + ", userId=" + userId + ", category=" + category + ", title=" + title + ", content="
				+ content + ", regDate=" + regDate + "]";
	}

}
