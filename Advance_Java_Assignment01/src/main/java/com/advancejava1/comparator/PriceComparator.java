package com.advancejava1.comparator;

import java.util.Comparator;

import com.advancejava1.data.Tshirt;

public class PriceComparator  implements Comparator<Tshirt>{

	public int compare(Tshirt tshirt1,Tshirt tshirt2) {
		
		return (int)(tshirt1.getPrice()-tshirt2.getPrice());
	}
}
