
public interface Repository {
	
	void save(Object obj);
	void update(Object obj);
	Object findById(int id);
	void delete(int id);

}
