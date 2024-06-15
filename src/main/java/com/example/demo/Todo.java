package com.example.demo;

import java.util.Date;
import java.util.Objects;

public class Todo {


	private long id;
	private String username;
	private String description;
	private boolean done;
	private Date targetDate;
	private Date completedDate;
	
	
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public Date getCompletedDate() {
		return completedDate;
	}
	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return id == other.id;
	}
	
	public Todo(long id, String username, String description, boolean completion_status, Date target_date,
			Date comletion_date) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.done = completion_status;
		targetDate = target_date;
		completedDate = comletion_date;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", description=" + description + ", completion_status=" + done
				+ ", Target_date=" + targetDate + ", Comletion_date=" + completedDate + "]";
	}
    public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

}
