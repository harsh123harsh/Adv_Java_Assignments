package com.advancejava1.Csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.advancejava1.data.*;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class TshirtCsv {
	public static ArrayList<Tshirt> getAllTshirts() {

		ArrayList<Tshirt> getalldata = new ArrayList<Tshirt>();

		File CSV_FILE_LOCATION = new File("C:\\Users\\harshnamdeo\\Documents\\git\\harsh-namdeo\\Advance_Java_Assignment01\\src\\main\\java\\com\\advancejava1\\CSVFile\\");
		
//		String[] CSV_FILE_NAMES = { "Nike.csv", "Puma.csv", "Adidas.csv" };

		for (String file : CSV_FILE_LOCATION.list()) {
			CSVReaderMethod(CSV_FILE_LOCATION + "\\" + file , getalldata);
		}

	
		return getalldata;

	}

	private static void CSVReaderMethod(String filePath, ArrayList<Tshirt> getalldata) {
		try {
			CSVParser parser = new CSVParserBuilder().withSeparator('|').withIgnoreQuotations(true).build();
			CSVReader csvReader = new CSVReaderBuilder(new FileReader(filePath)).withCSVParser(parser).withSkipLines(1)
					.build();

			String[] S;
			try {
				while ((S = csvReader.readNext()) != null) {
					Tshirt tshirt = new Tshirt();

					tshirt.setId(S[0]);
					tshirt.setName(S[1]);
					tshirt.setColor(Color.valueOf(S[2].toUpperCase()));
					tshirt.setGender(Gender.valueOf(S[3].toUpperCase()));
					tshirt.setSize(Size.valueOf(S[4].toUpperCase()));
					tshirt.setPrice(Double.parseDouble(S[5]));
					tshirt.setRating(Double.parseDouble(S[6]));
					tshirt.setAvalibilty(S[7]);

					getalldata.add(tshirt);

				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
