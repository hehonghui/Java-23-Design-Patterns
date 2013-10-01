package IteratorPattern;

/**
 * 迭代器接口
 * @author Mr-Simple
 *
 */
public interface Iterator<T> {
	// 迭代器前移
	public T previous();
	// 迭代器后移
	public T next();
	// 后面是否还有元素
	public boolean hasNext();
	// 取第一个元素
	public T first();
	// 取最后一个元素
	public T last();
}
