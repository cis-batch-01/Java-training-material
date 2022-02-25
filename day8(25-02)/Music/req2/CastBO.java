package corejavasamples.music.req2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CastBO {
	
	public List<Cast> findCast(List<Cast> castList,String nationality)
	{
		List<Cast> resList=new ArrayList<Cast>();
		for(int i=0;i<castList.size();i++)
		{
			if(nationality.equals(castList.get(i).getNationality()))
			{
				resList.add(castList.get(i));
			}
		}
		
		return resList;
	}
	public List<Cast> findCast(List<Cast> castList,Date dob)
	{
		List<Cast> resList=new ArrayList<Cast>();
		for(Cast cast:castList)
		{
			if(cast.getDob().equals(dob))
			{
				resList.add(cast);
			}
		}
		return resList;
	}
	

}
