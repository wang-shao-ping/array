package cn.kgc.array_List;

import java.util.Arrays;

public class EasyArrayList<E> implements EasyList<E> {
	// 定义属性
	private Object[] elementData;
	// arrayList 实际数量
	private int size;

	// 提供无参构造方法
	public EasyArrayList() {
		// 默认创建的大小为10
		this(10);
	}

	/**
	 * 根据用户传入的数组大小进行创建
	 * 
	 * @param initialCapacity
	 */
	public EasyArrayList(int initialCapacity) {
		if (initialCapacity < 0) {// 如果初始大小小于0则直接抛出异常。
			throw new IllegalArgumentException("Illegal Capacity" + initialCapacity);
		}
		elementData = new Object[initialCapacity];
	}

	@Override
	public void add(E object) {
		ensureExplicitVapacity(size + 1);
		elementData[size++] = object;
	}

	@Override
	public void add(int index, E object) {
		// 因为索引是用户设置的，所以需要判断下标是否越界
		rangeCheck(index);
		// 进行扩容判断
		ensureExplicitVapacity(size + 1);
		System.arraycopy(elementData, index, elementData, index + 1, size);
		elementData[index] = object;
		size++;
	}

	@Override
	public boolean remove(E object) {
		for (int i = 0; i < elementData.length; i++) {
			Object element = elementData[i];
			if (element.equals(object)) {
				remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		Object object = get(index);
		int numMoved = elementData.length - index - 1;
		System.out.println("numMoved: -->" + numMoved);
		System.out.println("index: -->" + index);
		if (numMoved > 0) {
			System.arraycopy(elementData, index + 1, elementData, index, numMoved);
		}
		System.out.println("elementData[--size] ==>" + size);
		elementData[--size] = null;
		return object;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public Object get(int index) {
		rangeCheck(index);
		return elementData[index];
	}

	@Override
	public void update(int index, Object obj) {
		rangeCheck(index);
		remove(index);
		E e = (E) obj;
		add(e);
	}

	/**
	 * 扩容
	 * 
	 * @param minCapacity
	 */
	public void ensureExplicitVapacity(int minCapacity) {
		if (size == minCapacity) {
			int oldCapacity = elementData.length;
			int newCapacity = oldCapacity + (oldCapacity >> 1);
			if (newCapacity < minCapacity) {
				newCapacity = minCapacity;
			}
			elementData = Arrays.copyOf(elementData, newCapacity);
		}
	}

	/**
	 * 检测数组是否下标越界
	 * 
	 * @param index
	 */
	private void rangeCheck(int index) {
		if (index >= size) {
			throw new IndexOutOfBoundsException("length-->" + index);
		}
	}
}
