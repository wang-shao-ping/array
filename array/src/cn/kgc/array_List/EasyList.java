package cn.kgc.array_List;

public interface EasyList<E> {
	/**
	 * 添加对象
	 * @param object
	 */
	public void add(E object);
	/**
	 * 根据传入的索引添加对象
	 * @param index
	 * @param object
	 */
	public void add(int index,E object);
	/**
	 * 根据传入的对象删除元素
	 * @param object
	 * @return
	 */
	public boolean remove(E object);
	/**
	 * 根据索引删除元素
	 * @param index
	 * @return
	 */
	public Object remove(int index);
	/**
	 * 获取集合大小
	 * @return
	 */
	public int getSize();
	/**
	 * 根据id获取元素
	 * @param index
	 * @return
	 */
	public Object get(int index);
	/**
	 * 
	 * @param index
	 * @param obj
	 */
	public void update(int index,Object obj);
}
