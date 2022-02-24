package corejavasamples.datesample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Scanner scan=new Scanner(System.in);
//		Date userDate=new Date();
//		System.out.println(sdf.format(userDate));
		System.out.println("Enter the date:");
		Date data=sdf.parse(scan.nextLine());
		Date userDate1=sdf.parse("12-12-2020");
		System.out.println(data.after(userDate1));
		
	}

}
//System.out.println("Enter the date:");
//Date data=sdf.parse(scan.nextLine());
//Date userDate=sdf.parse("12-12-2020");
//int res=data.compareTo(userDate);
////System.out.println(res);