package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@SuppressWarnings("serial")
@Entity
@Table(name="devlopment")
public class Devlopment implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	private long id;
	private String title;
	private String des;
	private String imglink;
	@Column(nullable=false ,updatable=false)
	private String code;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getImglink() {
		return imglink;
	}
	public void setImglink(String imglink) {
		this.imglink = imglink;
	}
	public String getCode() {
		return code;
	}
	public Devlopment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Devlopment(long id, String title, String des, String imglink, String code) {
		super();
		this.id = id;
		this.title = title;
		this.des = des;
		this.imglink = imglink;
	}
	@Override
	public String toString() {
		return "Devlopment [id=" + id + ", title=" + title + ", des=" + des + ", imglink=" + imglink + ", code=" + code
				+ "]";
	}
	
}