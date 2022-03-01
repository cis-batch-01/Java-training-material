package corejavasamples.music.repomodel;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class CastMain {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		CastRepository castImpl = new CastRepositoryImpl();
		System.out.println("Cast Manipulation api");
		char choice = 'n';
		do {
			System.out.println("1.Get all casts\n2.get a cast\n3.Add a new Cast\n4.remove cast\n5.update cast");
			int option = Integer.parseInt(scan.nextLine());
			switch (option) {
			case 1:
				List<Cast> castList = castImpl.getAllCasts();
				System.out.println("Elemets from the Storage");
				if (!castList.isEmpty()) {
					for (Cast cast : castList) {
						System.out.println(cast);
					}
				}
				else
				{
					System.out.println("the storage list is empty");
				}
				break;
			case 2:
				System.out.println("Enter the Cast id:");
				int id = Integer.parseInt(scan.nextLine());
				Cast cast = castImpl.get(id);
				System.out.println(cast!=null?cast:"id not found");
				break;
			case 3:
				System.out.println("Enter the cast Details");
				String data = scan.nextLine();
				Cast castNew = Cast.createCast(data);
				boolean res=castImpl.add(castNew);
				System.out.println(res?"Cast Added successfully":"storage is full");
				break;
			case 4:
				System.out.println("Enter the id to be removed");
				int newId=Integer.parseInt(scan.nextLine());
				System.out.println(castImpl.remove(newId)?"Removed successfully":"not removed");
				break;
			case 5:
				System.out.println("Enter the id to be updated:");
				int updateId=Integer.parseInt(scan.nextLine());
				System.out.println("Enter the details");
				String updateData=scan.nextLine();
				Cast updatedCast=Cast.createCast(updateData);
				boolean result=castImpl.update(updateId, updatedCast);
				System.out.println(result?"updated":"not get updated");
				break;
			default:
				System.out.println("Invalid choice");
			}

			System.out.println("Do you want ot cntinue (y/n)");
			choice = scan.nextLine().charAt(0);
		} while (choice == 'y' || choice == 'Y');
	}

}
