package com.lonsec.core.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.lonsec.core.model.BenchReturnSeries;
import com.lonsec.core.model.FundReturnReport;
import com.lonsec.core.model.FundReturnSeries;

@Component
public class ServerInitializer implements ApplicationRunner {

	@Autowired
	private BenchMarkService benchMarkService;

	@Autowired
	private FundService fundService;

	@Autowired
	private BenchReturnSeriesService benchReturnSeriesService;

	@Autowired
	private FundReturnSeriesService fundReturnSeriesService;

	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		List<FundReturnSeries> fundReturnList = fundReturnSeriesService.findAllCustom();
		if (fundReturnList != null) {
			List<FundReturnReport> reportData= new ArrayList<FundReturnReport>();
			for (FundReturnSeries fundReturn : fundReturnList) {
				FundReturnReport fundreturnreport= new FundReturnReport();
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