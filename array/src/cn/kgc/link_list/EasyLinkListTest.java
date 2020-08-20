package cn.kgc.link_list;

public class EasyLinkListTest {

	
	public static void main(String[] args) {
		EasyLinkList list = new EasyLinkList();
		list.add("小小");
		list.add("大熊");
		list.add("大大");
		for (int i = 0; i < list.getSize(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---指定位置添加元素---");
		list.updateNode(1, "陈大头");	
		for (int i = 0; i < list.getSize(); i++) {
			System.out.println(list.get(i));
		}
	}
}
