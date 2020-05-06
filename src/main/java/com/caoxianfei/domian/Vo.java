/**
 * 
 */
package com.caoxianfei.domian;

/**
 * @author (caoxianfei) email:(948315767@qq.com)
 * @version v1.0
 * @date 
 *	  创建于:2020年5月6日上午11:07:32
 */
public class Vo {

	private String hname;
	
	private String phone;
	
	private String name;
	
	private String f1;
	
	private String f2;
	
	private String t1;
	
	private String t2;

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getF1() {
		return f1;
	}

	public void setF1(String f1) {
		this.f1 = f1;
	}

	public String getF2() {
		return f2;
	}

	public void setF2(String f2) {
		this.f2 = f2;
	}

	public String getT1() {
		return t1;
	}

	public void setT1(String t1) {
		this.t1 = t1;
	}

	public String getT2() {
		return t2;
	}

	public void setT2(String t2) {
		this.t2 = t2;
	}

	@Override
	public String toString() {
		return "Vo [hname=" + hname + ", phone=" + phone + ", name=" + name + ", f1=" + f1 + ", f2=" + f2 + ", t1=" + t1
				+ ", t2=" + t2 + "]";
	}

	public Vo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vo(String hname, String phone, String name, String f1, String f2, String t1, String t2) {
		super();
		this.hname = hname;
		this.phone = phone;
		this.name = name;
		this.f1 = f1;
		this.f2 = f2;
		this.t1 = t1;
		this.t2 = t2;
	}

	
	
}
