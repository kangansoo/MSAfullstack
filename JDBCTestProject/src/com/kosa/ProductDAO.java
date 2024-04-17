package com.kosa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	private Connection conn = DBConnection.getConnection();
	private Statement stmt;
	private ResultSet rs;
	
	public void addProduct(ProductVO vo) {
		List<ProductVO> products = new ArrayList<>();
        products.add(new ProductVO("1001", "칫솔", "흰색", 10));
        products.add(new ProductVO("1002", "치약", "파란색", 50));
        products.add(new ProductVO("1003", "휴지", "검은색", 20));
        products.add(new ProductVO("1004", "세제", "초록색", 1));

        try {
            stmt = conn.createStatement();
            for (ProductVO product : products) {
                String query = "INSERT INTO product (prod_code, prod_name, prod_color, prod_qty) VALUES ";
                query += "('" + product.getCode() + "', '" + product.getName() + "', '" + product.getColor() + "', " + product.getQty() + ")";
                stmt.executeUpdate(query);
            }
			rs.close();
			stmt.close();
			conn.close();
            System.out.println("데이터 삽입 완료");

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
