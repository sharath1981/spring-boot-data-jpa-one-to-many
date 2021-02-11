package com.datajpa.onetomany.domain;

import lombok.Getter;

@Getter
public enum Rating {
	ONE(1),
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5);
	
	private final int star;
	private Rating(int star) {
		this.star = star;
	}

}
