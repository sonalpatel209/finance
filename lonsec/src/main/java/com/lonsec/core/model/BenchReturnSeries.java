package com.lonsec.core.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BenchReturnSeries")
public class BenchReturnSeries {
	@Id
	@Column(name = "bench_mark_code")
	private String benchMarkCode;
	@OneToOne
	@JoinColumn(name = "bench_mark_code")
	private BenchMark benchMark;
	@Column(name = "returnDate")
	private Date returnDate;
	@Column(name = "Returnper")
	private double returnper;

	public String getBenchMarkCode() {
		return benchMarkCode;
	}

	public void setBenchMarkCode(String benchMarkCode) {
		this.benchMarkCode = benchMarkCode;
	}

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

	@Override
	public String toString() {
		return "BenchReturnSeries [benchMarkCode=" + benchMarkCode + ", Date=" + returnDate.toString() + ",Return per="
				+ returnper + "]";
	}

}
