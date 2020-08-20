package cn.kgc.array_List;

public class TestEasyArrayList {
	
	public static void main(String[] args) {
		EasyArrayList<String> list = new EasyArrayList<String>();
		list.add("张三");
		list.add("小王");
		System.out.println("----分割线-----");
		for (int i = 0; i < list.getSize(); i++) {
			System.out.println(list.get(i));
		}
		list.update(1, "王麻子");
		System.out.println("----修改之后-----");
		for (int i = 0; i < list.getSize(); i++) {
			System.out.println(list.get(i));
		}
		list.add("赵六");
		list.add("何七");
		System.out.println("--------删除------------");
		System.out.println("删除前：");
		for(int i=0;i<list.getSize();i++){
			System.out.println(list.get(i));
		}
		System.out.println("list.remove(2)==>" + list.remove(2));
		System.out.println("删除后：");
		for(int i=0;i<list.getSize();i++){
			System.out.println(list.get(i));
		}
		System.out.println(10 >>1);
	}
}
