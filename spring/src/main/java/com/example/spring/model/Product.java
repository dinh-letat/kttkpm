package com.example.spring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "maSP")
	private int maSP;
	
	@Column(name = "tenSP")
	private String tenSP;
	
	@Column(name = "soluongSP")
	private int soluongSP;
	
	@Column(name = "giaSP")
	private double giaSP;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMaSP() {
		return maSP;
	}
	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public int getSoLuongSP() {
		return soluongSP;
	}
	public void setSoLuongSP(int soluongSP) {
		this.soluongSP = soluongSP;
	}
	public double getGiaSP() {
		return giaSP;
	}
	public void setGiaSP(double giaSP) {
		this.giaSP = giaSP;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, int maSP, String tenSP, int soLuongSP, double giaSP) {
		super();
		this.id = id;
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.soluongSP = soluongSP;
		this.giaSP = giaSP;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", maSP=" + maSP + ", tenSP=" + tenSP + ", soLuongSP=" + soluongSP + ", giaSP="
				+ giaSP + "]";
	}
	
	
}
