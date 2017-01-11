package com.lonsec.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FUNDRETURNREPORT")
public class FundReturnReport {
	@Id
	private long id;
	@Column
	private String fundCode;
	@Column
	private String fundName;
	@Column
	private String returnDate;
	@Column
	private double excess;
	@Column
	private String outperform;
	@Column
	private double fundreturn;

	public String getFundCode() {
		return fundCode;
	}

	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public double getExcess() {
		return excess;
	}

	public void setExcess(double excess) {
		this.excess = excess;
	}

	public String getOutperform() {
		return outperform;
	}

	public void setOutperform(String outperform) {
		this.outperform = outperform;
	}

	public double getFundreturn() {
		return fundreturn;
	}

	public void setFundreturn(double fundreturn) {
		this.fundreturn = fundreturn;
	}

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "FundReturnReport [fundName=" + fundName + ", fundCode=" + fundCode + ", returnDate=" + returnDate
				+ ", excess=" + excess + ", outperform=" + outperform + " fundreturn=" + fundreturn + "]";
	}

}
