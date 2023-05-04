package csv;

import data.Color;
import data.Gender;
import data.Size;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.harshnamdeo.assignment2AdvanceJava.Tshirt;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;


public class TshirtCsv {

	static String directoryPath = "src\\main\\resources\\";
	static File directory = new File(directoryPath);

	public static ArrayList<Tshirt> getAllTshirts() {
		ArrayList<Tshirt> UpdatedStore = null;
		while (true) {

			UpdatedStore = new ArrayList<Tshirt>();

			for (String path : directory.list()) {
				String filepath = directoryPath + path;
				
				try {
//					System.out.println("Scanning ... : " + filepath);
					CSVParser parser = new CSVParserBuilder().withSeparator('|').build();
					CSVReader reader = new CSVReaderBuilder(new FileReader(filepath)).withSkipLines(1)
							.withCSVParser(parser).build();
					String[] S;
					while ((S = reader.readNext()) != null) {
						Tshirt tshirt = new Tshirt();

						tshirt.setId(S[0]);
						tshirt.setName(S[1]);
						tshirt.setColor(Color.valueOf(S[2].toUpperCase()).toString());
						tshirt.setGender(Gender.valueOf(S[3].toUpperCase()).toString());
						tshirt.setSize(Size.valueOf(S[4].toUpperCase()).toString());
						tshirt.setPrice(Double.parseDouble(S[5]));
						tshirt.setRating(Double.parseDouble(S[6]));
						tshirt.setAvalibilty(S[7]);

						UpdatedStore.add(tshirt);

					}

				} catch (FileNotFoundException e) {
					System.out.println("Given File is not available");
				} catch (IOException e) {
					System.out.println("Inputs are wrong");
				}
			}

			break;			
		}
		return UpdatedStore;
	}


	public static ArrayList<Tshirt> getAllTshirtsforPrint(){
		Configuration conf = new Configuration();
    	conf.configure();
    	SessionFactory factory = conf.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
		
    	ArrayList<Tshirt> UpdatedStore = new ArrayList<Tshirt>();
    	
    	String hib = "FROM Tshirt";
		Query query = session.createQuery(hib);
    	List results = query.list();
//    	System.out.println(results);
    	for (Object obj : results) {
    		Tshirt t = (Tshirt)obj;
    		
    		Tshirt tshirt = new Tshirt();

			tshirt.setId(t.getId());
			tshirt.setName(t.getName());
			tshirt.setColor(Color.valueOf(t.getColor().toUpperCase()).toString());
			tshirt.setGender(Gender.valueOf(t.getGender().toUpperCase()).toString());
			tshirt.setSize(Size.valueOf(t.getSize().toUpperCase()).toString());
			tshirt.setPrice(t.getPrice());
			tshirt.setRating(t.getRating());
			tshirt.setAvalibilty(t.getAvalibilty());

			UpdatedStore.add(tshirt);
    	}
    	
    	tx.commit();
    	
    	session.close();
    	return UpdatedStore;
	}

}