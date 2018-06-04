package com.play.phedb.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.play.common.Page;

/**
 * 员工基本信息表
 */
public class PhEmpIdentity extends Page  {

	/**
	 * 描述
	 */
	private Long empId; 
	
	/**
	 * 唯一号
	 */
	private Long uniquNo; 
	
	/**
	 * 姓名
	 */
	private String empName; 
	
	/**
	 * 证件类型
	 */
	private BigDecimal idType; 
	
	/**
	 * 性别
	 */
	private BigDecimal gender; 
	
	/**
	 * 证件号码
	 */
	private String idCode; 
	
	/**
	 * 手机号
	 */
	private String mobile; 
	
	/**
	 * 邮箱
	 */
	private String email; 
	
	/**
	 * 出生日期
	 */
	private Date birthDate; 
	
	/**
	 * 民族
	 */
	private Integer nation; 
	
	/**
	 * 国籍
	 */
	private String country; 
	
	/**
	 * 授权标识:1、已授权  2、未授权
	 */
	private Integer authFlag; 
	
	/**
	 * 访问TOKEN
	 */
	private String accessToken; 
	
	/**
	 * TOKEN获取时间
	 */
	private Date tokenTime; 
	
	/**
	 * 操作人Id
	 */
	private String creator; 
	
	/**
	 * 操作人名称
	 */
	private String creatorName; 
	
	/**
	 * 操作时间
	 */
	private Date createTime; 
	
	/**
	 * 
	 */
	private String userid; 
	
	
	/**
	 * 璇诲彇描述
	 */
	public Long getEmpId(){
		return empId;
	} 
	
	/**
	 * 璁剧疆 描述
	 */
	public void setEmpId(Long empId){
		this.empId = empId;
	}
	
	/**
	 * 璇诲彇唯一号
	 */
	public Long getUniquNo(){
		return uniquNo;
	} 
	
	/**
	 * 璁剧疆 唯一号
	 */
	public void setUniquNo(Long uniquNo){
		this.uniquNo = uniquNo;
	}
	
	/**
	 * 璇诲彇姓名
	 */
	public String getEmpName(){
		return empName;
	} 
	
	/**
	 * 璁剧疆 姓名
	 */
	public void setEmpName(String empName){
		this.empName = empName;
	}
	
	/**
	 * 璇诲彇证件类型
	 */
	public BigDecimal getIdType(){
		return idType;
	} 
	
	/**
	 * 璁剧疆 证件类型
	 */
	public void setIdType(BigDecimal idType){
		this.idType = idType;
	}
	
	/**
	 * 璇诲彇性别
	 */
	public BigDecimal getGender(){
		return gender;
	} 
	
	/**
	 * 璁剧疆 性别
	 */
	public void setGender(BigDecimal gender){
		this.gender = gender;
	}
	
	/**
	 * 璇诲彇证件号码
	 */
	public String getIdCode(){
		return idCode;
	} 
	
	/**
	 * 璁剧疆 证件号码
	 */
	public void setIdCode(String idCode){
		this.idCode = idCode;
	}
	
	/**
	 * 璇诲彇手机号
	 */
	public String getMobile(){
		return mobile;
	} 
	
	/**
	 * 璁剧疆 手机号
	 */
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	
	/**
	 * 璇诲彇邮箱
	 */
	public String getEmail(){
		return email;
	} 
	
	/**
	 * 璁剧疆 邮箱
	 */
	public void setEmail(String email){
		this.email = email;
	}
	
	/**
	 * 璇诲彇出生日期
	 */
	public Date getBirthDate(){
		return birthDate;
	} 
	
	/**
	 * 璁剧疆 出生日期
	 */
	public void setBirthDate(Date birthDate){
		this.birthDate = birthDate;
	}
	
	/**
	 * 璇诲彇民族
	 */
	public Integer getNation(){
		return nation;
	} 
	
	/**
	 * 璁剧疆 民族
	 */
	public void setNation(Integer nation){
		this.nation = nation;
	}
	
	/**
	 * 璇诲彇国籍
	 */
	public String getCountry(){
		return country;
	} 
	
	/**
	 * 璁剧疆 国籍
	 */
	public void setCountry(String country){
		this.country = country;
	}
	
	/**
	 * 璇诲彇授权标识:1、已授权  2、未授权
	 */
	public Integer getAuthFlag(){
		return authFlag;
	} 
	
	/**
	 * 璁剧疆 授权标识:1、已授权  2、未授权
	 */
	public void setAuthFlag(Integer authFlag){
		this.authFlag = authFlag;
	}
	
	/**
	 * 璇诲彇访问TOKEN
	 */
	public String getAccessToken(){
		return accessToken;
	} 
	
	/**
	 * 璁剧疆 访问TOKEN
	 */
	public void setAccessToken(String accessToken){
		this.accessToken = accessToken;
	}
	
	/**
	 * 璇诲彇TOKEN获取时间
	 */
	public Date getTokenTime(){
		return tokenTime;
	} 
	
	/**
	 * 璁剧疆 TOKEN获取时间
	 */
	public void setTokenTime(Date tokenTime){
		this.tokenTime = tokenTime;
	}
	
	/**
	 * 璇诲彇操作人Id
	 */
	public String getCreator(){
		return creator;
	} 
	
	/**
	 * 璁剧疆 操作人Id
	 */
	public void setCreator(String creator){
		this.creator = creator;
	}
	
	/**
	 * 璇诲彇操作人名称
	 */
	public String getCreatorName(){
		return creatorName;
	} 
	
	/**
	 * 璁剧疆 操作人名称
	 */
	public void setCreatorName(String creatorName){
		this.creatorName = creatorName;
	}
	
	/**
	 * 璇诲彇操作时间
	 */
	public Date getCreateTime(){
		return createTime;
	} 
	
	/**
	 * 璁剧疆 操作时间
	 */
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	
	/**
	 * 璇诲彇
	 */
	public String getUserid(){
		return userid;
	} 
	
	/**
	 * 璁剧疆 
	 */
	public void setUserid(String userid){
		this.userid = userid;
	}
	
	
}
