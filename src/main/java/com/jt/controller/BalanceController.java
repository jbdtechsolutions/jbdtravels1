package com.jt.controller;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jt.bean.balance.Balance;
import com.jt.service.balance.BalanceService;

@RestController
public class BalanceController {
	private final static Logger logger = Logger.getLogger(BalanceController.class);

	BalanceService balanceService;

	public BalanceService getBalanceService() {
		return balanceService;
	}

	public void setBalanceService(BalanceService balanceService) {
		this.balanceService = balanceService;
	}

	@RequestMapping(value = { "/balance" }, method = RequestMethod.GET)
	public List<Balance> getBalanceController() {
		logger.info("Balance Controller's Get Balance Controller method Called... ");
		List<Balance> response = balanceService.getAllBalanceService();
		logger.info("Successfully Retrived TripBalances ...");
		return response;
	}

	public static void main(String args[]) {
		BalanceController ctrlr = new BalanceController();
	}
}
