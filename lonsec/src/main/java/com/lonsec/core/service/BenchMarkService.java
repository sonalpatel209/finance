package com.lonsec.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lonsec.core.model.BenchMark;
import com.lonsec.core.repository.BenchMarkRepository;

@Service
public class BenchMarkService {
	@Autowired
	private BenchMarkRepository benchMarkRepository;

	public List<BenchMark> findAll() {
		return benchMarkRepository.findAll();
	}
}
