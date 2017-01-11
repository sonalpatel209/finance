package com.lonsec.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lonsec.core.model.FundReturnSeries;
import com.lonsec.core.repository.FundReturnSeriesRepository;

@Service
public class FundReturnSeriesService {

	@Autowired
	private FundReturnSeriesRepository fundReturnSeriesRepository;

	public List<FundReturnSeries> findAll() {
		return fundReturnSeriesRepository.findAll();
	}

	public List<FundReturnSeries> findAllReturnsByFundCode(String fundCode) {
		return fundReturnSeriesRepository.findAllReturnsByFundCode(fundCode);
	}
	
	public List<FundReturnSeries> findAllCustom() {
		return fundReturnSeriesRepository.findAllCustom();
	}
	
}
