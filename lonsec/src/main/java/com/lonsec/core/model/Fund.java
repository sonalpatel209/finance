package com.lonsec.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="FUND")
public class Fund {
	@Id
	@Column(name="fundcode")
	private String fundCode;
	@Column(name="fundname")
	private String fundName;
	@OneToOne
	@JoinColumn(name="benchmarkcode")
	private BenchMark benchMark;
	public String getFundCode() {
		return fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}
	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
//	public BenchMark getBenchMark() {
//		return benchMark;
//	}
//	public void setBenchMark(BenchMark benchMark) {
//		this.benchMark = benchMark;
//	}
	@Override
	public String toString() {
		//return "Fund [fundCode=" + fundCode + ", fundName=" + fundName + ", benchMark=" + benchMark + "]";
		return "Fund [fundCode=" + fundCode + ", fundName=" + fundName + "]";
	}
	
}
