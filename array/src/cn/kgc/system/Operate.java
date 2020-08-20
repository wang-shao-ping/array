package cn.kgc.system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Operate {
	List<Stu> list=new ArrayList<Stu>();
	 
	Scanner cin=new Scanner(System.in);
	//输入部分可以先将类型定义为String,再通过list.父类型.parse数据类型()转换为指定类型	
	public void input() throws Exception//添加员工信息
	{
		int student_number=1;
		System.out.println("--------- 添加员工信息，停止添加输入0 ----------");
	 
		while(true)
		{
		Stu stu=new Stu(); //这条语句一定要放在循环结构里，否则list中的值不会更新
		System.out.println("正在录入第 "+student_number+" 个员工的信息....\n");
		System.out.println("------请输入员工的编号------");
		stu.setId(Integer.parseInt(cin.next()));	//这里不能用的输入不能用 cin.nextLine() 原因应该与C语言的gets()后+scanf()差不多
		if(stu.getId()==0) {System.out.println("------成功退出输入------\n");break;}
		System.out.println("------请输入员工的名字------");
		stu.setName(cin.next());
		System.out.println("------请输入员工的性别------");
		stu.setSex(Boolean.parseBoolean(cin.next()));
		System.out.println("------请输入员工的出生日期------");
		stu.setBornDate(Integer.parseInt(cin.next()));
		System.out.println("------请输入员工的学历（1高中，2专科，3本科，4硕士，5博士）------");
		stu.setEdu(Integer.parseInt(cin.next()));
		System.out.println("------请输入员工的联系电话------");
		stu.setPhone(Long.parseLong(cin.next()));
		System.out.println("------请输入员工的工资------");
		stu.setSalary(Float.parseFloat(cin.next()));
		list.add(stu);
//		stu.id=cin.nextInt();
//		stu.name=cin.nextLine();
//		stu.sex=cin.nextBoolean();
//		stu.bornDate=cin.nextInt();
//		stu.edu=cin.nextInt();
//		stu.phone=cin.nextInt();
//		stu.salary=cin.nextFloat();
		System.out.println("第"+student_number+"个员工的信息录入成功!\n");
		student_number++;
	}
		
	}
	 
	public void select()	//查找并打印出指定员工信息
	{
		System.out.println("------------请输入要查询的员工编号------");
		int num=cin.nextInt();
		int number=0;
		for(int i=0;i<list.size();i++)
		{
			if(num==list.get(i).getId())
			{
	            System.out.println("--------------------------------------------------------------------------------------");
	            System.out.println(" 编号	姓名		性别		出生日期		学历		电话		工资");
	            System.out.println(list.get(i).getId()+"\t"+list.get(i).getName()+"\t"+list.get(i).isSex()+"\t"+list.get(i).getBornDate()+"\t"+list.get(i).getEdu()+"\t"+list.get(i).getPhone()+"\t"+list.get(i).getSalary());
	            System.out.println("--------------------------------------------------------------------------------------");
	            number++;
			}
		}
		if(number==0)
			System.out.println("------------你要查找的员工编号不存在------------");
	}
	 
	public void  delete()	//删除指定员工信息
	{
		System.out.println("------请输入要删除的员工编号------");
		int num=cin.nextInt();
		for(int i=0;i<list.size();i++)
		{
		if(num==list.get(i).getId())
		{
			System.out.println("成功删除编号为"+list.get(i).getId()+"的员工");
			list.remove(i);//删除下标为i的信息
		}
		}
	}
	 
	public void update()	//修改指定员工信息
	{
		int rm=0;
		int id1;
		String name1;
		boolean sex1;
		int borndate1;
		int edu1;
		long phone1;
		float salary1;
		System.out.println("------请输入要修改的员工编号------");
		int num=cin.nextInt();
		for(int i=0;i<list.size();i++)
		{
		if(num==list.get(i).getId())
		{
				rm=1;
				System.out.println("请输入修改后的编号");
				id1=Integer.parseInt(cin.next());
				list.get(i).setId(id1);//通过访问函数接口来完成修改功能
				System.out.println("请输入修改后的名字");
				name1=cin.next();
				list.get(i).setName(name1);
				System.out.println("请输入修改后的性别");
				sex1=Boolean.parseBoolean(cin.next());
				list.get(i).setSex(sex1);
				System.out.println("请输入修改后的出生日期");
				borndate1=Integer.parseInt(cin.next());
				list.get(i).setBornDate(borndate1);
				System.out.println("请输入修改后的学历");
				edu1=Integer.parseInt(cin.next());
				list.get(i).setEdu(edu1);
				System.out.println("请输入修改后的电话");
				phone1=Long.parseLong(cin.next());
				list.get(i).setPhone(phone1);
				System.out.println("请输入修改后的工资");
				salary1=Float.parseFloat(cin.next());
				list.get(i).setSalary(salary1);
				System.out.println("--------信息修改完成--------------");
				break;
		}
		}
		if(rm==0)
			System.out.println("无此编号员工!");
	}
	 
	public static class idComparator implements Comparator //自定义比较器类
	{
		public int compare(Object o1,Object o2)
		{
		Stu s1,s2;
		s1=(Stu)o1;
		s2=(Stu)o2;
		return new Integer(s1.getId()).compareTo(new Integer(s2.getId()));//将s.getid()包装为Integer对象后进行比较
		}
	}
	 
	 
	public void sort()  //排序员工信息
	{
		Comparator cmp=new idComparator();//创建比较器对象
		Collections.sort(list,cmp);//集合排序函数Collections.sort(集合列表,比较器)
		System.out.println("-------编号排序成功----------");
	}
	 
	public void output()	//输出所有员工信息
	{
		System.out.println("============打印员工信息===========");
	    System.out.println("--------------------------------------------------------------------------------------");
	    System.out.println(" 编号\t姓名\t性别\t出生日期\t\t学历\t电话\t\t工资(元)");
	    System.out.println("--------------------------------------------------------------------------------------");
		for( Stu u:list)
		{
			System.out.println(u.getId()+"\t"+u.getName()+"\t"+u.isSex()+"\t"+u.getBornDate()+"\t\t"+u.getEdu()+"\t"+u.getPhone()+"\t"+u.getSalary());
		}
	    System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("======================================================================================");
	}
	 
	public void clear() throws Exception	//清除所有员工信息
	{
		System.out.println("确认删除? true/false");
		boolean s=cin.nextBoolean();
		if(s)list.clear();
		if(!s) return ;
		System.out.println("------成功清除所有员工信息------");
	}

}
