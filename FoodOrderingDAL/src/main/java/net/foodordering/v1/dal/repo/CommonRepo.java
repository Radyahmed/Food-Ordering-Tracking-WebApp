package net.foodordering.v1.dal.repo;

import java.util.List;

public interface CommonRepo<E> {

	public E add(E entity);

	public E update(E entity);

	public void remove(Integer id);

	public E findById(Integer id);

	public List<E> findList();
}
