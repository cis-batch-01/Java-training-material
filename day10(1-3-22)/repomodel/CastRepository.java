package corejavasamples.music.repomodel;

import java.util.List;

public interface CastRepository {
	
	public List<Cast> getAllCasts();
	public Cast get(int id);
	public boolean remove(int id);
	public boolean update(int id,Cast cast);
	public boolean add(Cast cast);

}
