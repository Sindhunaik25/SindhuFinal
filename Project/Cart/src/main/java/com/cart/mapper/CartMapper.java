package com.cart.mapper;


import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.cart.Cart;

public class CartMapper implements RowMapper<Cart> {
	
		public Cart mapRow(ResultSet rs1, int rowNum) throws SQLException {
			  
			Cart cart = new Cart();
			   
			   cart.setProductId(rs1.getInt("productId"));
			   cart.setProductName(rs1.getString("productName"));
			   cart.setQuantity(rs1.getInt("quantity"));
			   cart.setPrice(rs1.getInt("price"));
			   
		      return cart;
		   }

}

	
