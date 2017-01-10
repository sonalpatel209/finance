package com.lonsec.core.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lonsec.core.model.BenchMark;

@Repository
public interface BenchMarkRepository extends CrudRepository<BenchMark, String> {
	List<BenchMark> findAll();
}
