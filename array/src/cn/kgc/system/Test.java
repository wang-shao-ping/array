package cn.kgc.system;

import java.util.Scanner;

public class Test {
	public static void main(String[] args)throws Exception{
		Scanner sc=new Scanner(System.in);
		Operate pt=new Operate();
 
		System.out.println("==============员工信息管理系统===============\n");
		System.out.println("请选择:   1: 录入员工信息  2: 查询指定员工信息    3: 删除指定员工信息    4: 修改指定员工资料   5: 对员工资料排序   6: 输出所有员工资料   7: 清除所有员工资料  8: 退出");
		while(sc.hasNextInt())
		{
		int n=sc.nextInt();
		if(n==8)
			break;
		switch(n)
		{
		case 1: pt.input();break;
		case 2: pt.select();break;
		case 3: pt.delete();break;
		case 4: pt.update();break;
		case 5: pt.sort();break;
		case 6: pt.output();break;
		case 7: pt.clear();break;
		}
 
		System.out.println("请选择:   1: 录入员工信息  2: 查询指定员工信息    3: 删除指定员工信息    4: 修改指定员工资料   5: 对员工资料排序   6: 输出所有员工资料   7: 清除所有员工资料  8: 退出");
		}
		System.out.println("欢迎您下次继续使用本信息管理系统!");
		
	}
}
