package edu.spring.domain;

import java.util.Date;

public class Project {
	
	private int pno;			  // 글번호
	private String title;		  // 제목
	private String content;		  // 내용
	private int recommendation;	  // 추천수
	private String category;	  // 카테고리
	private int currentAmount;    // 현재 금액
	private int targetAmount;  	  // 목표 금액
	private int userId;			  // 프로젝트 작성자 아이디
	private Date targetTime;	  // 프로젝트 목표 시간 
	private Date regTime;		  // 프로젝트 작동 시간
	private boolean finished;	  // 종료여부
	
	public Project() {}

	public Project(int pno, String title, String content, int recommendation, String category, int currentAmount,
			int targetAmount, int userId, Date targetTime, Date regTime, boolean finished) {
		super();
		this.pno = pno;
		this.title = title;
		this.content = content;
		this.recommendation = recommendation;
		this.category = category;
		this.currentAmount = currentAmount;
		this.targetAmount = targetAmount;
		this.userId = userId;
		this.targetTime = targetTime;
		this.regTime = regTime;
		this.finished = finished;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
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

	public int getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(int recommendation) {
		this.recommendation = recommendation;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(int currentAmount) {
		this.currentAmount = currentAmount;
	}

	public int getTargetAmount() {
		return targetAmount;
	}

	public void setTargetAmount(int targetAmount) {
		this.targetAmount = targetAmount;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getTargetTime() {
		return targetTime;
	}

	public void setTargetTime(Date targetTime) {
		this.targetTime = targetTime;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	@Override
	public String toString() {
		return "Project [pno=" + pno + ", title=" + title + ", content=" + content + ", recommendation="
				+ recommendation + ", category=" + category + ", currentAmount=" + currentAmount + ", targetAmount="
				+ targetAmount + ", userId=" + userId + ", targetTime=" + targetTime + ", regTime=" + regTime
				+ ", finished=" + finished + "]";
	}
	
	
}
