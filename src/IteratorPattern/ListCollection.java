package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ListCollection<T> implements ICollection<T> {

	private List<T> m_List = new ArrayList<T>();
	
	/**
	 * 获得迭代器
	 */
	@Override
	public Iterator<T> iterator() {
		
		return new ListIterator( this );
	}

	/**
	 * 
	 */
	@Override
	public T get(int index) {
		return (T)m_List.get(index);
	}

	/**
	 * 返回集合的大小
	 */
	@Override
	public int size() {
		return m_List.size();
	}

	/**
	 * 添加元素
	 */
	@Override
	public void add(T obj) {
		m_List.add(obj) ;
	}

	/**
	 * 删除元素
	 */
	@Override
	public void remove(T obj) {
		if( m_List.contains( obj) ){
			m_List.remove( obj ) ;
		}
		
	}

}
