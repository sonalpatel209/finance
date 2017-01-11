package com.lonsec.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lonsec.core.model.BenchReturnSeries;

@Repository
public interface BenchReturnSeriesRepository extends CrudRepository<BenchReturnSeries, Long> {
	List<BenchReturnSeries> findAll();

	@Query(value = "SELECT * FROM BENCHRETURNSERIES WHERE BENCHMARKCODE = ?1", nativeQuery = true)
	public List<BenchReturnSeries> findAllReturnsByBenchCode(String benchCode);
	
	@Query(value = "SELECT * FROM BENCHRETURNSERIES", nativeQuery = true)
	public List<BenchReturnSeries> findAllCustom();

	@Query(value = "SELECT * FROM BENCHRETURNSERIES WHERE RETURNDATE = ?1", nativeQuery = true)
	public List<BenchReturnSeries> findAllReturnsByReturnDate(String returnDate);
	
	@Query(value = "SELECT sum(RETURNPER) FROM BENCHRETURNSERIES WHERE RETURNDATE = ?1", nativeQuery = true)
	public double findReturnsTotalPerByReturnDate(String returnDate);
	
}
