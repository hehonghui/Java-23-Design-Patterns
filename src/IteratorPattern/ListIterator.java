package IteratorPattern;

public class ListIterator<T> implements Iterator<T> {

	// 集合
	private ICollection<T> m_Collection ;
	// 下标位置
	private int position = -1;
	
	/**
	 * 迭代器的构造函数
	 * @param con
	 */
	public ListIterator(ICollection<T> con){
		m_Collection = con ;
	}
	
	/**
	 * 前一个数据
	 */
	@Override
	public T previous() {
		if ( position > 0 ){
			position-- ;
		}else{
			throw new IndexOutOfBoundsException();
		}
		
		return (T)m_Collection.get( position );
	}

	@Override
	public T next() {
		if ( position < m_Collection.size()-1 ){
			position++ ;
		}else{
			throw new IndexOutOfBoundsException();
		}
		
		return (T)m_Collection.get( position );

	}

	/**
	 * 是否还有下一个元素
	 */
	@Override
	public boolean hasNext() {
		if( position < m_Collection.size() -1 ){
			return true ;
		}
		
		return false;
		
	}

	@Override
	public T first() {
		return (T)m_Collection.get( 0 );	
		}

	@Override
	public T last() {
		return (T)m_Collection.get( position );
	}

}
