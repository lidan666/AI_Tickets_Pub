package AIETickets.dao;

import java.util.List;

public interface GenericDAO<ID,E> {

	List<E> list(); 
	
	List<E> list1(E e);
	
	List<E> list2(E e);
	
	List<E> list3(E e);
	
	//E get(ID id);
	
	E get(E e);
	
	E get2(E e);
	
	void insert(E e);
	
	void update(E e);
	
	int delete(E e);
	
	int getTotalSize();

}
