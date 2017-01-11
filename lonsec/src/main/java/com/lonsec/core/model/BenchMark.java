package com.lonsec.core.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BENCHMARK")
public class BenchMark {
	@Id
	@Column(name="benchmarkcode")
	private String benchMarkCode;
	@Column(name="benchmarkname")
	private String benchMarkName;
	
	public String getBenchMarkCode() {
		return benchMarkCode;
	}
	public void setBenchMarkCode(String benchMarkCode) {
		this.benchMarkCode = benchMarkCode;
	}
	public String getBenchMarkName() {
		return benchMarkName;
	}
	public void setBenchMarkName(String benchMarkName) {
		this.benchMarkName = benchMarkName;
	}
	@Override
	public String toString() {
		return "BenchMark [benchMarkCode=" + benchMarkCode + ", benchMarkName=" + benchMarkName + "]";
	}
	
	
}
