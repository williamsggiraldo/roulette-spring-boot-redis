package com.masivian.test.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Roulette implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private Long status;

}
