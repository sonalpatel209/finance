package com.lonsec.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lonsec.core.model.Fund;
import com.lonsec.core.repository.FundRepository;

@Service
public class FundService {
	@Autowired
	private FundRepository fundRepository;

	public List<Fund> findFundByBenchMarkCode(String benchMarkCode) {
		return fundRepository.findAllFundsByBenchMark(benchMarkCode);
	}
}
