package cn.kgc.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operation {
	private static List<Object> list = new ArrayList<Object>();
	public static void main(String args[]) {
		do{
		System.out.println("++++++++++欢迎使用数据库增删改查功能++++++++++++");
		System.out.println("+++1.新增 2.删除 3.修改 4.查询+++");
		System.out.println("+++++++++++++请输入您选择的操作+++++++++++++++");
		Scanner input = new Scanner(System.in);
		int c = input.nextInt();
		switch(c){
		case 1: System.out.println("请输入学生名");
				Student student = new Student();
				Scanner sname = new Scanner(System.in);
		       	String name = sname.next("name");
		       	System.out.println(name);
		       	student.setName(name);
		        break; 
		case 2: System.out.println("Delete"); 
		       
		                    break; 
		case 3: System.out.println("Update");
		       
		                    break; 
		case 4: System.out.println("Query"); 
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
		                    break; 
		   default: 
		               System.out.println("consonant"); 
		     }   
		} while(true);
	}
}
