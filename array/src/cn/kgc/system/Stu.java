package cn.kgc.system;

public class Stu {
	private Integer id;	//编号
	private String name;	//姓名
	private boolean sex;	//性别
	private int bornDate;	//出生日期
	private int edu;     //学历
	private long phone;	//电话
	private float salary;		//工资
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public int getBornDate() {
		return bornDate;
	}
	public void setBornDate(int bornDate) {
		this.bornDate = bornDate;
	}
	public int getEdu() {
		return edu;
	}
	public void setEdu(int edu) {
		this.edu = edu;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

}
