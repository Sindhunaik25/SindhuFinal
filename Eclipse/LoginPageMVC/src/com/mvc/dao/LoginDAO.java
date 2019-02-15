package com.mvc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mvc.login.Login;

public class LoginDAO {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void createTable() {
		jdbcTemplate
				.execute("create table student(username varchar2(20),password varchar2(20)");
	}
	
	public void insertTable(Login login) {
		String sql;

				
	}

	/*public int save(Emp p){    
	    String sql="insert into Emp99(name,salary,designation) values('"+p.getName()+"',"+p.getSalary()+",'"+p.getDesignation()+"')";    
	    return template.update(sql);    
	}  */
	
	public boolean loginUser(String username, String password) {
		return true;

	}
}
