package com.ty.car;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "typ_review")
public class CustomerReview {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Subject;
	private String content;
	@CreationTimestamp
	private LocalDateTime Createdatetime;
	@UpdateTimestamp
	private LocalDateTime updatedatetime;
	private String writername;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getCreatedatetime() {
		return Createdatetime;
	}

	public void setCreatedatetime(LocalDateTime createdatetime) {
		Createdatetime = createdatetime;
	}

	public LocalDateTime getUpdatedatetime() {
		return updatedatetime;
	}

	public void setUpdatedatetime(LocalDateTime updatedatetime) {
		this.updatedatetime = updatedatetime;
	}

	public String getWritername() {
		return writername;
	}

	public void setWritername(String writername) {
		this.writername = writername;
	}

}
