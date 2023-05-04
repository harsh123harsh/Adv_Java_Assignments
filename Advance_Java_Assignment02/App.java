package com.harsh.assignment2AdvanceJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import csv.TshirtCsv;


public class App
{
    public static void main( String[] args ) throws FileNotFoundException
    {
        System.out.println( "Program Started ..." );
        
        Configuration conf = new Configuration();
    	conf.configure();
    	SessionFactory factory = conf.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	ArrayList<Tshirt> allTshirtData = TshirtCsv.getAllTshirts();
//    	System.out.println(allTshirtData);
    	for (Tshirt ts: allTshirtData) {
    		session.save(ts);
   		}
    	
    	tx.commit();
    	session.close();
    	
    	Input input = new Input();
		TshirtSearchIp tshirtSearchIp = input.getInput();

        TshirtSearchOp tshirtSearchOp = new TshirtSearchOp();
        ArrayList<Tshirt>matchedTShirts = tshirtSearchOp.getMatchingTshirts(tshirtSearchIp);
        
        Output output = new Output();
        output.displayOutput(matchedTShirts);
        
//		String hib = "FROM Tshirt";
//		Query query = session.createQuery(hib);
//    	List results = query.list();
//    	
//    	for (Object obj : results) {
//    		Tshirt t = (Tshirt)obj;
//    		System.out.println(t.getName());
//    	}
//    	
//    	tx.commit();
//    	session.close();
    }
    
//    public void run() {
//
//		Input input = new Input();
//		TshirtSearchIp tshirtSearchIp = input.getInput();
//		TshirtSearchOp tshirtSearchOp = new TshirtSearchOp();
//		
//		String directoryPath = "C:\\Users\\ghanshyamprajapati\\eclipse-workspace\\assignment2AdvanceJava\\src\\main\\resources\\";
//		File directory = null;
//		String[] files = null;
//		int inNoOfFiles = 0, newNoOfFiles = 0;
//		ArrayList<Tshirt> matchedTShirts = null;
//		
//		do {
//			directory = new File(directoryPath);
//			files = directory.list();
//			inNoOfFiles = newNoOfFiles;
//			newNoOfFiles = files.length;
//
//			try {
//				matchedTShirts = tshirtSearchOp.getMatchingTshirts(tshirtSearchIp);
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			}
//			
//			Output output = new Output();
//			output.displayOutput(matchedTShirts);
//			
//			try {
//				Thread.sleep(10000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//		}while (inNoOfFiles < newNoOfFiles);
//	
//	}
}
