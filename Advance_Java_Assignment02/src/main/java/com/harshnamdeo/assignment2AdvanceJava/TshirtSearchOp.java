package com.harshnamdeo.assignment2AdvanceJava;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import comparator.PriceComparator;
import comparator.RatingComparator;
import csv.TshirtCsv;

public class TshirtSearchOp {
	Scanner scn;

	public ArrayList<Tshirt> getMatchingTshirts(TshirtSearchIp tshirtsSearchIp) throws FileNotFoundException {

		ArrayList<Tshirt> tshirt = new ArrayList<Tshirt>();
		ArrayList<Tshirt> allTshirtData = TshirtCsv.getAllTshirtsforPrint();

		String inputFormat = String.format("%s,%s,%s", tshirtsSearchIp.getColor(), tshirtsSearchIp.getSize(),
				tshirtsSearchIp.getGender());

		String outputFormat;
		String output = tshirtsSearchIp.getOutputPreference().name();

//		For debugging
		for (Tshirt t: allTshirtData) {
			System.out.println(t.getName());
		}
		
		System.out.println("Your choice of Output Preference is : ");

		for (Tshirt allTshirtDataiterator : allTshirtData) {

			outputFormat = String.format("%s,%s,%s", allTshirtDataiterator.getColor(), allTshirtDataiterator.getSize(),
					allTshirtDataiterator.getGender());

			if (inputFormat.equalsIgnoreCase(outputFormat))
				tshirt.add(allTshirtDataiterator);

		}

		if (output.equalsIgnoreCase("Price")) {

			Collections.sort(tshirt, new PriceComparator());
			System.out.println(output);

		} else if (output.equalsIgnoreCase("Rating")) {

			Collections.sort(tshirt, new RatingComparator());
			System.out.println(output);

		} else {

			Collections.sort(tshirt, new PriceComparator());
			Collections.sort(tshirt, new RatingComparator());
			System.out.println(output);

		}

		System.out.println("\n\n");

		return tshirt;
	}

}