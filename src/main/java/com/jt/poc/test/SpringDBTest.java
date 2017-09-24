package com.jt.poc.test;

import javax.sql.DataSource;

public class SpringDBTest {

	DataSource datasource;

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
	
}
