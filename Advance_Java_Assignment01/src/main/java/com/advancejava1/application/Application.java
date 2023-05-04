package com.advancejava1.application;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import com.advancejava1.SearchIp.TshirtSearchIp;
import com.advancejava1.SearchOp.TshirtSearchOp;
import com.advancejava1.data.Tshirt;
import com.advancejava1.view.Input;
import com.advancejava1.view.Output;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
        Input input = new Input();
        TshirtSearchIp tshirtSearchIp = input.getInput();
        
        TshirtSearchOp tshirtSearchOp = new TshirtSearchOp();
        ArrayList<Tshirt>matchedTShirts = tshirtSearchOp.getMatchingTshirts(tshirtSearchIp);
        
        Output output = new Output();
        output.displayOutput(matchedTShirts);
	}

}
