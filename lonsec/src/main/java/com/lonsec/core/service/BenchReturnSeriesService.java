package com.lonsec.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lonsec.core.model.BenchReturnSeries;
import com.lonsec.core.repository.BenchReturnSeriesRepository;

@Service
public class BenchReturnSeriesService {

	@Autowired
	private BenchReturnSeriesRepository benchReturnSeriesRepository;

	public List<BenchReturnSeries> findAll() {
		return benchReturnSeriesRepository.findAll();
	}

	public List<BenchReturnSeries> findAllReturnsByBenchCode(String benchCode) {
		return benchReturnSeriesRepository.findAllReturnsByBenchCode(benchCode);
	}
	
	public List<BenchReturnSeries> findAllCustom() {
		return benchReturnSeriesRepository.findAllCustom();
	}

	public List<BenchReturnSeries> findAllReturnsByReturnDate(String returnDate) {
		return benchReturnSeriesRepository.findAllReturnsByReturnDate(returnDate);
	}
	
	public double findReturnsTotalPerByReturnDate(String returnDate){
		return benchReturnSeriesRepository.findReturnsTotalPerByReturnDate(returnDate);
	}
	
}
