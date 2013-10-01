package IteratorPattern;

/**
 * 集合接口
 * @author Mr-Simple
 *
 */
public interface ICollection<T> {
	// 获得迭代器
	public Iterator<T> iterator();
	public void add(T obj);
	public void remove(T obj);
	// 获得某个元素
	public T get(int index);
	// 获得集合大小
	public int size();
}
