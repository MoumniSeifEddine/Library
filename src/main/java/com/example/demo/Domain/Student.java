package com.example.demo.Domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String stname;
private Long course;
private int fee;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getStname() {
	return stname;
}
public void setStname(String stname) {
	this.stname = stname;
}
public Long getCourse() {
	return course;
}
public void setCourse(Long course) {
	this.course = course;
}
public int getFee() {
	return fee;
}
public void setFee(int fee) {
	this.fee = fee;
}

}
