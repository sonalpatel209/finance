package com.lonsec.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lonsec.core.model.FundReturnSeries;

@Repository
public interface FundReturnSeriesRepository extends CrudRepository<FundReturnSeries, Long>{
	List<FundReturnSeries> findAll();
	
	@Query(value = "SELECT * FROM FUNDRETURNSERIES WHERE FUNDCODE = ?1", nativeQuery = true)
	public List<FundReturnSeries> findAllReturnsByFundCode(String fundCode);

	@Query(value = "SELECT * FROM FUNDRETURNSERIES", nativeQuery = true)
	public List<FundReturnSeries> findAllCustom();
}
