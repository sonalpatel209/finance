package com.lonsec;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.lonsec.core.model.FundReturnReport;
import com.lonsec.core.model.FundReturnSeries;
import com.lonsec.core.service.BenchMarkService;
import com.lonsec.core.service.BenchReturnSeriesService;
import com.lonsec.core.service.FundReturnSeriesService;
import com.lonsec.core.service.FundService;
import com.lonsec.core.service.ServerInitializer;

@RunWith(SpringRunner.class)
@ContextConfiguration
@SpringBootConfiguration
@SpringBootTest
public class LonsecApplicationTests {

	//@Autowired
	private BenchMarkService benchMarkService;

	//@Autowired
	private FundService fundService;

	//@Autowired
	private BenchReturnSeriesService benchReturnSeriesService;

	//@Autowired
	private FundReturnSeriesService fundReturnSeriesService;

	@Test
	public void contextLoads() {
		System.out.println("inside contextLoads");
		// fundReturnSeriesService.findAllReturnsByFundCode("MF-1-4220").stream().forEach(System.out::println);
		List<FundReturnSeries> fundReturnList = fundReturnSeriesService.findAllCustom();
		if (fundReturnList != null) {
			// fundReturnList.stream().forEach(System.out::println);
			List<FundReturnReport> reportData = new ArrayList<FundReturnReport>();
			for (FundReturnSeries fundReturn : fundReturnList) {
				FundReturnReport fundreturnreport = new FundReturnReport();
				System.out.println("FundID:" + fundReturn.getId() + " fund " + fundReturn.getFund().toString()
						+ " returndate:" + fundReturn.getReturnDate());
				String fundName = fundReturn.getFund().getFundName();
				String returnDate = fundReturn.getReturnDate().toString();
				double totalbenchreturn = benchReturnSeriesService
						.findReturnsTotalPerByReturnDate(fundReturn.getReturnDate().toString());
				double excess = totalbenchreturn - (fundReturn.getReturnper());
				String outperform = "";
				if (excess < -1) {
					outperform = "underPerformed";
				} else if (excess > 1) {
					outperform = "outPerformed";
				}
				fundreturnreport.setFundCode(fundReturn.getFund().getFundCode());
				fundreturnreport.setFundName(fundReturn.getFund().getFundName());
				fundreturnreport.setExcess(excess);
				fundreturnreport.setOutperform(outperform);
				fundreturnreport.setReturnDate(fundReturn.getReturnDate().toString());
				fundreturnreport.setFundreturn(fundReturn.getReturnper());
				reportData.add(fundreturnreport);
				System.out.println(fundreturnreport.toString());
			}
		}
	}

}
