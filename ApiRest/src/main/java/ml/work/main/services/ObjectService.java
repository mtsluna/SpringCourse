package ml.work.main.services;

import java.util.List;

public interface ObjectService <T> {

	public List<T> getAll();
	public T getOne(int id);
	public T save(T t);
	public T update(T t, int id);
	public boolean delete(int id);
	
}
