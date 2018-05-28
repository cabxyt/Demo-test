package com.play.phemp.dao.entity;

import java.util.Date;

/**
 * 员工体检信息
 */
public class PhExam {

	/**
	 * 体检ID
	 */
	private Long examId; 
	
	/**
	 * 员工ID
	 */
	private Long empId; 
	
	/**
	 * 预约标识(来自HELO)
	 */
	private String appointId; 
	
	/**
	 * 体检机构ID
	 */
	private String exapOrgId; 
	
	/**
	 * 体检机构名称
	 */
	private String exapOrgName; 
	
	/**
	 * 预约状态：1、已预约  2、取消预约  3、体检报告已回传   4、体检报告已上传至KJD   5、体检分析数据已取回
	 */
	private Integer examStatus; 
	
	/**
	 * 所属公司
	 */
	private String companyName; 
	
	/**
	 * 
	 */
	private Integer examYear; 
	
	/**
	 * 所属公司
	 */
	private String examNo; 
	
	/**
	 * 授权标识:1、已授权  2、未授权
	 */
	private Integer authFlag; 
	
	/**
	 * 体检报告ID
	 */
	private String reportId; 
	
	/**
	 * 体检报告分析ID(从康健德获取)
	 */
	private String reportAnaId; 
	
	/**
	 * 体检套餐
	 */
	private String examCombo; 
	
	/**
	 * 体检时间
	 */
	private Date examTime; 
	
	/**
	 * 预约时间
	 */
	private Date appointmentTime; 
	
	/**
	 * 取消时间
	 */
	private Date cancelTime; 
	
	/**
	 * 报告回传时间
	 */
	private Date reportBackTime; 
	
	/**
	 * 上传员工标识:MD5(身份证号+姓名)
	 */
	private String uploadEmpId; 
	
	/**
	 * 
	 */
	private Date uploadReportTime; 
	
	/**
	 * 从体检机构取回分析结果的时间
	 */
	private Date getDataTime; 
	
	/**
	 * 创建时间
	 */
	private Date createTime; 
	
	/**
	 * 
	 */
	private String error; 
	
	/**
	 * 
	 */
	private String exapOrgParentName; 
	
	/**
	 * 
	 */
	private String exapOrgParentId; 
	
	
	/**
	 * 锟斤拷取体检ID
	 */
	public Long getExamId(){
		return examId;
	} 
	
	/**
	 * 锟斤拷锟斤拷 体检ID
	 */
	public void setExamId(Long examId){
		this.examId = examId;
	}
	
	/**
	 * 锟斤拷取员工ID
	 */
	public Long getEmpId(){
		return empId;
	} 
	
	/**
	 * 锟斤拷锟斤拷 员工ID
	 */
	public void setEmpId(Long empId){
		this.empId = empId;
	}
	
	/**
	 * 锟斤拷取预约标识(来自HELO)
	 */
	public String getAppointId(){
		return appointId;
	} 
	
	/**
	 * 锟斤拷锟斤拷 预约标识(来自HELO)
	 */
	public void setAppointId(String appointId){
		this.appointId = appointId;
	}
	
	/**
	 * 锟斤拷取体检机构ID
	 */
	public String getExapOrgId(){
		return exapOrgId;
	} 
	
	/**
	 * 锟斤拷锟斤拷 体检机构ID
	 */
	public void setExapOrgId(String exapOrgId){
		this.exapOrgId = exapOrgId;
	}
	
	/**
	 * 锟斤拷取体检机构名称
	 */
	public String getExapOrgName(){
		return exapOrgName;
	} 
	
	/**
	 * 锟斤拷锟斤拷 体检机构名称
	 */
	public void setExapOrgName(String exapOrgName){
		this.exapOrgName = exapOrgName;
	}
	
	/**
	 * 锟斤拷取预约状态：1、已预约  2、取消预约  3、体检报告已回传   4、体检报告已上传至KJD   5、体检分析数据已取回
	 */
	public Integer getExamStatus(){
		return examStatus;
	} 
	
	/**
	 * 锟斤拷锟斤拷 预约状态：1、已预约  2、取消预约  3、体检报告已回传   4、体检报告已上传至KJD   5、体检分析数据已取回
	 */
	public void setExamStatus(Integer examStatus){
		this.examStatus = examStatus;
	}
	
	/**
	 * 锟斤拷取所属公司
	 */
	public String getCompanyName(){
		return companyName;
	} 
	
	/**
	 * 锟斤拷锟斤拷 所属公司
	 */
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}
	
	/**
	 * 锟斤拷取
	 */
	public Integer getExamYear(){
		return examYear;
	} 
	
	/**
	 * 锟斤拷锟斤拷 
	 */
	public void setExamYear(Integer examYear){
		this.examYear = examYear;
	}
	
	/**
	 * 锟斤拷取所属公司
	 */
	public String getExamNo(){
		return examNo;
	} 
	
	/**
	 * 锟斤拷锟斤拷 所属公司
	 */
	public void setExamNo(String examNo){
		this.examNo = examNo;
	}
	
	/**
	 * 锟斤拷取授权标识:1、已授权  2、未授权
	 */
	public Integer getAuthFlag(){
		return authFlag;
	} 
	
	/**
	 * 锟斤拷锟斤拷 授权标识:1、已授权  2、未授权
	 */
	public void setAuthFlag(Integer authFlag){
		this.authFlag = authFlag;
	}
	
	/**
	 * 锟斤拷取体检报告ID
	 */
	public String getReportId(){
		return reportId;
	} 
	
	/**
	 * 锟斤拷锟斤拷 体检报告ID
	 */
	public void setReportId(String reportId){
		this.reportId = reportId;
	}
	
	/**
	 * 锟斤拷取体检报告分析ID(从康健德获取)
	 */
	public String getReportAnaId(){
		return reportAnaId;
	} 
	
	/**
	 * 锟斤拷锟斤拷 体检报告分析ID(从康健德获取)
	 */
	public void setReportAnaId(String reportAnaId){
		this.reportAnaId = reportAnaId;
	}
	
	/**
	 * 锟斤拷取体检套餐
	 */
	public String getExamCombo(){
		return examCombo;
	} 
	
	/**
	 * 锟斤拷锟斤拷 体检套餐
	 */
	public void setExamCombo(String examCombo){
		this.examCombo = examCombo;
	}
	
	/**
	 * 锟斤拷取体检时间
	 */
	public Date getExamTime(){
		return examTime;
	} 
	
	/**
	 * 锟斤拷锟斤拷 体检时间
	 */
	public void setExamTime(Date examTime){
		this.examTime = examTime;
	}
	
	/**
	 * 锟斤拷取预约时间
	 */
	public Date getAppointmentTime(){
		return appointmentTime;
	} 
	
	/**
	 * 锟斤拷锟斤拷 预约时间
	 */
	public void setAppointmentTime(Date appointmentTime){
		this.appointmentTime = appointmentTime;
	}
	
	/**
	 * 锟斤拷取取消时间
	 */
	public Date getCancelTime(){
		return cancelTime;
	} 
	
	/**
	 * 锟斤拷锟斤拷 取消时间
	 */
	public void setCancelTime(Date cancelTime){
		this.cancelTime = cancelTime;
	}
	
	/**
	 * 锟斤拷取报告回传时间
	 */
	public Date getReportBackTime(){
		return reportBackTime;
	} 
	
	/**
	 * 锟斤拷锟斤拷 报告回传时间
	 */
	public void setReportBackTime(Date reportBackTime){
		this.reportBackTime = reportBackTime;
	}
	
	/**
	 * 锟斤拷取上传员工标识:MD5(身份证号+姓名)
	 */
	public String getUploadEmpId(){
		return uploadEmpId;
	} 
	
	/**
	 * 锟斤拷锟斤拷 上传员工标识:MD5(身份证号+姓名)
	 */
	public void setUploadEmpId(String uploadEmpId){
		this.uploadEmpId = uploadEmpId;
	}
	
	/**
	 * 锟斤拷取
	 */
	public Date getUploadReportTime(){
		return uploadReportTime;
	} 
	
	/**
	 * 锟斤拷锟斤拷 
	 */
	public void setUploadReportTime(Date uploadReportTime){
		this.uploadReportTime = uploadReportTime;
	}
	
	/**
	 * 锟斤拷取从体检机构取回分析结果的时间
	 */
	public Date getGetDataTime(){
		return getDataTime;
	} 
	
	/**
	 * 锟斤拷锟斤拷 从体检机构取回分析结果的时间
	 */
	public void setGetDataTime(Date getDataTime){
		this.getDataTime = getDataTime;
	}
	
	/**
	 * 锟斤拷取创建时间
	 */
	public Date getCreateTime(){
		return createTime;
	} 
	
	/**
	 * 锟斤拷锟斤拷 创建时间
	 */
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	
	/**
	 * 锟斤拷取
	 */
	public String getError(){
		return error;
	} 
	
	/**
	 * 锟斤拷锟斤拷 
	 */
	public void setError(String error){
		this.error = error;
	}
	
	/**
	 * 锟斤拷取
	 */
	public String getExapOrgParentName(){
		return exapOrgParentName;
	} 
	
	/**
	 * 锟斤拷锟斤拷 
	 */
	public void setExapOrgParentName(String exapOrgParentName){
		this.exapOrgParentName = exapOrgParentName;
	}
	
	/**
	 * 锟斤拷取
	 */
	public String getExapOrgParentId(){
		return exapOrgParentId;
	} 
	
	/**
	 * 锟斤拷锟斤拷 
	 */
	public void setExapOrgParentId(String exapOrgParentId){
		this.exapOrgParentId = exapOrgParentId;
	}
	
	
}
