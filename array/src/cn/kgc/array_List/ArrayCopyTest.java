package cn.kgc.array_List;

public class ArrayCopyTest {

	public static void main(String[] args) {
		Object[] obj = new Object[10];
		for (int i = 0; i < obj.length; i++) {
			obj[i] = "小王童鞋" + i;
		}
		System.arraycopy(obj, 3, obj, 2, 7);
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}
}
