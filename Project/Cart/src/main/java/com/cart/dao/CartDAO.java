package com.cart.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class CartDAO {

	private JdbcTemplate jdbcTemplate;

	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int addProduct(int productId, String productName, int quantity, int price) {
		String sqlQuery = "insert into cartTable values(" + productId + ",'" + productName + "'," + quantity + "," +price +" )";
				return jdbcTemplate.update(sqlQuery);
	}

	public int remove(int productId) {
		String sqlRemove = null;
		sqlRemove = "delete from cartTable where productId=" + productId;
		return jdbcTemplate.update(sqlRemove);
		
	}
	
	public Object removeAll() {
		String sqlRemoveAll=null;
		sqlRemoveAll="delete from cartTable";
		return jdbcTemplate.update(sqlRemoveAll);
	}
	

	public int update(int productId, String productName) {
		
		String sqlUpdate = null;
		sqlUpdate = "update cartTable set productName='" +  productName + "' where productid=" + productId;
		return jdbcTemplate.update(sqlUpdate);
	}

	
	public int addQuantity(int productId,int quantity) {
		String sqladdQuantity=null;
		sqladdQuantity="update cartTable set quantity="+quantity+" where productid="+productId;
				return jdbcTemplate.update(sqladdQuantity);	
	}
	

	public int addPrice(int productId, int price) {
		String sqladdPrice=null;
		sqladdPrice="update cartTable set price="+ price +" where productid="+productId;;
				return jdbcTemplate.update(sqladdPrice);
	}
}















	/*
	 * public List<Product> getAllProducts() { // TODO Auto-generated method stub
	 * return null; }
	 */

/*public int getProduct(int productId) {
String sqlGetUser = null;
//select * from table where id=15
		sqlGetUser = "select * from cartTable where id='" + ProductId + " ' " ;
		
		List<Cart> user = jdbcTemplate.query(sqlGetUser, new CartMapper());

		return jdbcTemplate.update(sqlGetUser);
}
*/