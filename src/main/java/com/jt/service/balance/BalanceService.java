package com.jt.service.balance;

import java.util.List;

import com.jt.bean.balance.Balance;
import com.jt.dao.balance.BalanceDAOImpl;

public class BalanceService {

	BalanceDAOImpl balancedao;

	public void setBalancedao(BalanceDAOImpl balancedao) {
		this.balancedao = balancedao;
	}

	
	public List<Balance> getAllBalanceService(){
		List<Balance> balList=balancedao.getAllTripBalance();
		return balList;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
