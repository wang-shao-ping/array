package cn.kgc.link_list;

public class EasyLinkList {
	private LinkNode first;
    private LinkNode last;
    private int size;
    /**
     * 添加元素
     * @param o
     */
    public void add(Object o){
        if(first == null){
            LinkNode newnode = new LinkNode(null,o,null);
            first = newnode;
            last = (newnode);
        }else{
            LinkNode newnode = new LinkNode(last,o,null);
            last.setNext(newnode);
            last = newnode;
        }
        size++;
    }
    /**
     * 获取大小
     * @return
     */
    public int getSize(){
        return size;
    }
    /**
     * 根据索引查询元素
     * @param index
     * @return
     */
    public Object get(int index){                 //查询指定位置的值
        rangeCheck(index);
        if(first==null){
            return null;
        }else{
            LinkNode temp = getlocation(index);
            System.out.println(index+" => " + temp.getContent());
            return temp.getContent();
        }
    }
    /**
     * 删除元素
     * @param index
     */
    public void remove(int index){
        rangeCheck(index);
        if(first==null){
            throw new NullPointerException();
        }else{
            LinkNode temp = getlocation(index);
            temp.getPre().setNext(temp.getNext());      //先找到要删除节点的位置，它的上一个节点的next指向下一个结点
            temp = null;
            size--;
        }
    }
    /**
     * 指定位置添加元素
     * @param index
     * @param o
     */
    public void updateNode(int index,Object o){             //指定位置添加元素
        rangeCheck(index);
        LinkNode oldnode = getlocation(index);   //指定位置的原节点
        LinkNode newnode = new LinkNode();       //想要插入的节点
        if (oldnode != null) {
        	//新结点的前驱指向结点的前驱
			newnode.setPre(oldnode.getPre());
			//结点的前驱的后继指向新结点
			oldnode.getPre().setNext(newnode);
			//新结点的后继指向结点oldnode
			newnode.setNext(oldnode);
			//结点的前驱指向新结点
			oldnode.setPre(newnode);
			newnode.setContent(o);
		}
        size++;
    }

    private LinkNode getlocation(int index) {
        LinkNode temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }
    private void rangeCheck(int index) {        //越界检查
        if (index < 0 || index >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
