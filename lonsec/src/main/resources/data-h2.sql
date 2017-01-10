--insert into BENCHMARK values('bm1','bench1');
--insert into BENCHMARK values('bm2','bench2');
--
--insert into FUND values('fund1','fund1','bm1');
--insert into FUND values('fund2','fund2','bm1');
--insert into FUND values('fund3','fund3','bm2');
drop table if exists FUND
drop table if exists BENCHMARK
drop table if exists benchreturnseries
drop table if exists fundreturnseries

CREATE TABLE BENCHMARK(BENCHMARKCODE VARCHAR(200), BENCHMARKNAME VARCHAR(200)) AS SELECT * FROM CSVREAD('E:\\workspace\\finance\\src\\main\\resources\\benchmark.csv')
CREATE TABLE FUND(FUNDCODE VARCHAR(200) PRIMARY KEY, FUNDNAME VARCHAR(200), BENCHMARKCODE VARCHAR(200) ) AS SELECT * FROM CSVREAD('E:\\workspace\\finance\\src\\main\\resources\\fund.csv')
CREATE TABLE benchreturnseries(code VARCHAR(200), returndate DATE, returnper DOUBLE) AS SELECT * FROM CSVREAD('E:\\workspace\\finance\\src\\main\\resources\\BenchReturnSeries.csv',null,'charset=UTF-8')