package com.technocis.oops;

import java.util.Date;

public class TestMain {
	public static void main(String[] args) {
		
		
		Car teslaCar=new TeslaCar("", "Electric",new Date(), 215, "dhfhjdfjh");
		teslaCar.display();
		teslaCar.fillFuel();

		Car tataCar=new TataCar("", "petrol",new Date() );
		tataCar.display();
		tataCar.fillFuel();
	}

}
