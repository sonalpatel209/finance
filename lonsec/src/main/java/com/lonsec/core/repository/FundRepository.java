package com.lonsec.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lonsec.core.model.Fund;

@Repository
public interface FundRepository extends CrudRepository<Fund, String>{
	public List<Fund> findAll();
	
	@Query(value = "SELECT * FROM FUND WHERE benchmarkcode = ?1", nativeQuery = true)
	public List<Fund> findAllFundsByBenchMark(String benchaMarkCode);
	
}
