package com.jt.dao.balance;

import java.util.List;
import javax.sql.DataSource;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.jt.bean.balance.Balance;
import com.jt.constants.BalanceConstants;


public class BalanceDAOImpl extends JdbcDaoSupport implements BalanceDAO {
	private final static Logger logger = Logger.getLogger(BalanceDAOImpl.class);
	
	public List<Balance> getAllTripBalance() {
		String SQL = BalanceConstants.SELECT_ALL_BALANCE_TRIP;
		List<Balance> balanceList= getJdbcTemplate().query(SQL, new BalanceMapper());
		return balanceList;
	}

}