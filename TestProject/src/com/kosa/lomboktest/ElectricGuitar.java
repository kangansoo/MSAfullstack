package com.kosa.lomboktest;

import lombok.Data;

@Data
public class ElectricGuitar {
	private int numOfPickups;
	private boolean rockStartUses;
	private String brand = "야마하";
}
