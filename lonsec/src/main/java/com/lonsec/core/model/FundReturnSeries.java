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
@Table(name = "FundReturnSeries")
public class FundReturnSeries implements Serializable {
	private static final long serialVersionUID = -7161358302759847978L;
	
	@Id 
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "fundcode")
	private Fund fund;
	@Column(name = "returndate")
	private Date returnDate;
	@Column(name = "returnper")
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
	

	public Fund getFund() {
		return fund;
	}

	public void setFund(Fund fund) {
		this.fund = fund;
	}

	@Override
	public String toString() {
		return "FundReturnSeries [fundCode=" + fund.getFundCode() + ", Date=" + returnDate.toString() + ",Return per=" + returnper
				+ "]";
	}

}
