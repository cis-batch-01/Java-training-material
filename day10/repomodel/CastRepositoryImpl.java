package corejavasamples.music.repomodel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CastRepositoryImpl implements CastRepository {

	public static List<Cast> castList = new ArrayList<Cast>();
	static {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			castList.add(new Cast(1, "RobertDJr", "Usa", "male", sdf.parse("09-08-1978")));
			castList.add(new Cast(2, "criss hemsworth", "Usa", "male", sdf.parse("09-6-1985")));
			castList.add(new Cast(3, "Rajinikanth", "India", "male", sdf.parse("12-12-1968")));
			castList.add(new Cast(4, "vijay", "India", "male", sdf.parse("12-08-1978")));
			castList.add(new Cast(5, "Ajith", "India", "male", sdf.parse("01-05-1976")));
		} catch (ParseException e) {
			
			System.out.println(" Date Format is worng");
		}

	}
	//add new data to the list
	public boolean add(Cast cast) {

		return castList.add(cast);
	}
	//get all the datas in the list
	public List<Cast> getAllCasts() {

		return castList;
	}
	//get/find one data from the list
	public Cast get(int id) {
		Cast resCast = null;

		for (Cast cast : castList) {
			if (cast.getId().equals(id)) {
				resCast = cast;
			}
		}

		return resCast;
	}
	//remove a element from the list
	public boolean remove(int id) {
		Cast cast = get(id);
		return castList.remove(cast);
	}
	//update element in the list
	public boolean update(int id, Cast cast) {
		castList.remove(id - 1);
		return castList.add(cast);
	}

}
