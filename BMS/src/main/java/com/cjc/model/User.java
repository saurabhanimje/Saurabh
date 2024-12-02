package com.cjc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	private int userId;
	private String userName;
	private String userPassword;
	private float userSalary;

}
