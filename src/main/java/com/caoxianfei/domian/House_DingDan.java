/**
 * 
 */
package com.caoxianfei.domian;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author (caoxianfei) email:(948315767@qq.com)
 * @version v1.0
 * @date 
 *	  创建于:2020年5月6日上午9:04:31
 */
public class House_DingDan implements Serializable{

	private Integer hid;
	
	private Date htime;
	
	private String hname;
	
	private String phone;
	
	private Integer id;
	@JsonFormat
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String name;
	
	private Double price;
	
	private String scope;

	public Integer getHid() {
		return hid;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
	}

	public Date getHtime() {
		return htime;
	}

	public void setHtime(Date htime) {
		this.htime = htime;
	}

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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	@Override
	public String toString() {
		return "House_DingDan [hid=" + hid + ", htime=" + htime + ", hname=" + hname + ", phone=" + phone + ", id=" + id
				+ ", name=" + name + ", price=" + price + ", scope=" + scope + "]";
	}

	public House_DingDan(Integer hid, Date htime, String hname, String phone, Integer id, String name, Double price,
			String scope) {
		super();
		this.hid = hid;
		this.htime = htime;
		this.hname = hname;
		this.phone = phone;
		this.id = id;
		this.name = name;
		this.price = price;
		this.scope = scope;
	}

	public House_DingDan() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hid == null) ? 0 : hid.hashCode());
		result = prime * result + ((hname == null) ? 0 : hname.hashCode());
		result = prime * result + ((htime == null) ? 0 : htime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((scope == null) ? 0 : scope.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		House_DingDan other = (House_DingDan) obj;
		if (hid == null) {
			if (other.hid != null)
				return false;
		} else if (!hid.equals(other.hid))
			return false;
		if (hname == null) {
			if (other.hname != null)
				return false;
		} else if (!hname.equals(other.hname))
			return false;
		if (htime == null) {
			if (other.htime != null)
				return false;
		} else if (!htime.equals(other.htime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (scope == null) {
			if (other.scope != null)
				return false;
		} else if (!scope.equals(other.scope))
			return false;
		return true;
	}

	
	
	
	
}
