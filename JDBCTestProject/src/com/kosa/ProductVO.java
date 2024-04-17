package com.kosa;

import lombok.Data;

@Data
public class ProductVO {
	private String code;
	private String name;
	private String color;
	private int qty;
	
	public ProductVO() {}
    
    public ProductVO(String code, String name, String color, int qty) {
        this.code = code;
        this.name = name;
        this.color = color;
        this.qty = qty;
    }
}
