package com.advancejava1.view;

import java.util.ArrayList;

import com.advancejava1.data.Tshirt;

public class Output {
	
	public void displayOutput(ArrayList<Tshirt>matchedTshirts) {
		System.out.println("Thanks for Confirmation!! Your Result is here:\n");
		
		if(matchedTshirts.isEmpty()) {
			System.out.println("!! So Sorry !! No tshirt is avaliable for your required choice, You can try another one");
			
		}else {
		
			for(Tshirt i :matchedTshirts) {
				
				System.out.println("ID:\t"+ i.getId());
				System.out.println("NAME:\t"+ i.getName());
				System.out.println("COLOR:\t"+ i.getColor());
				System.out.println("GENDER:\t"+ i.getGender());
				System.out.println("SIZE:\t"+ i.getSize());
				System.out.println("PRIZE:\t"+ i.getPrice());
				System.out.println("RATING:\t"+ i.getRating());
				System.out.println("AVALIABILITY:\t"+ i.getAvalibilty());
				System.out.println();
			}
			
		}
	}

}
