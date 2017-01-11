package com.lonsec.core.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Transactional;

@Transactional
@Entity
@Table(name = "BenchReturnSeries")
public class BenchReturnSeries implements Serializable {
	private static final long serialVersionUID = -5233313126467011413L;

	
	@ManyToOne(fetch=FetchType.EAGER)	
	@JoinColumn(name = "benchmarkcode")
	private BenchMark benchMark;
	
	@Id 
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "returndate")
	private Date returnDate;
	@Column(name = "Returnper")
	private double returnper;

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public double getReturnper() {
		return returnper;
	}

	public void setReturnper(double returnper) {
		this.returnper = returnper;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "BenchReturnSeries [benchMarkCode=" + benchMark.getBenchMarkCode() + ", Date=" + returnDate.toString() + ",Return per="
				+ returnper + "]";
	}

}
