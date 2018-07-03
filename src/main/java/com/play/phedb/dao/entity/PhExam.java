package com.play.phedb.dao.entity;

import java.util.Date;

import com.play.common.Page;

/**
 * 员工体检信息
 */
public class PhExam extends Page  {

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
	private String exapOrgParentName; 
	
	/**
	 * 
	 */
	private String exapOrgParentId; 
	
	/**
	 * 
	 */
	private String examError; 
	
	
	/**
	 * 璇诲彇体检ID
	 */
	public Long getExamId(){
		return examId;
	} 
	
	/**
	 * 璁剧疆 体检ID
	 */
	public void setExamId(Long examId){
		this.examId = examId;
	}
	
	/**
	 * 璇诲彇员工ID
	 */
	public Long getEmpId(){
		return empId;
	} 
	
	/**
	 * 璁剧疆 员工ID
	 */
	public void setEmpId(Long empId){
		this.empId = empId;
	}
	
	/**
	 * 璇诲彇预约标识(来自HELO)
	 */
	public String getAppointId(){
		return appointId;
	} 
	
	/**
	 * 璁剧疆 预约标识(来自HELO)
	 */
	public void setAppointId(String appointId){
		this.appointId = appointId;
	}
	
	/**
	 * 璇诲彇体检机构ID
	 */
	public String getExapOrgId(){
		return exapOrgId;
	} 
	
	/**
	 * 璁剧疆 体检机构ID
	 */
	public void setExapOrgId(String exapOrgId){
		this.exapOrgId = exapOrgId;
	}
	
	/**
	 * 璇诲彇体检机构名称
	 */
	public String getExapOrgName(){
		return exapOrgName;
	} 
	
	/**
	 * 璁剧疆 体检机构名称
	 */
	public void setExapOrgName(String exapOrgName){
		this.exapOrgName = exapOrgName;
	}
	
	/**
	 * 璇诲彇预约状态：1、已预约  2、取消预约  3、体检报告已回传   4、体检报告已上传至KJD   5、体检分析数据已取回
	 */
	public Integer getExamStatus(){
		return examStatus;
	} 
	
	/**
	 * 璁剧疆 预约状态：1、已预约  2、取消预约  3、体检报告已回传   4、体检报告已上传至KJD   5、体检分析数据已取回
	 */
	public void setExamStatus(Integer examStatus){
		this.examStatus = examStatus;
	}
	
	/**
	 * 璇诲彇所属公司
	 */
	public String getCompanyName(){
		return companyName;
	} 
	
	/**
	 * 璁剧疆 所属公司
	 */
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}
	
	/**
	 * 璇诲彇
	 */
	public Integer getExamYear(){
		return examYear;
	} 
	
	/**
	 * 璁剧疆 
	 */
	public void setExamYear(Integer examYear){
		this.examYear = examYear;
	}
	
	/**
	 * 璇诲彇所属公司
	 */
	public String getExamNo(){
		return examNo;
	} 
	
	/**
	 * 璁剧疆 所属公司
	 */
	public void setExamNo(String examNo){
		this.examNo = examNo;
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
	 * 璇诲彇体检报告ID
	 */
	public String getReportId(){
		return reportId;
	} 
	
	/**
	 * 璁剧疆 体检报告ID
	 */
	public void setReportId(String reportId){
		this.reportId = reportId;
	}
	
	/**
	 * 璇诲彇体检报告分析ID(从康健德获取)
	 */
	public String getReportAnaId(){
		return reportAnaId;
	} 
	
	/**
	 * 璁剧疆 体检报告分析ID(从康健德获取)
	 */
	public void setReportAnaId(String reportAnaId){
		this.reportAnaId = reportAnaId;
	}
	
	/**
	 * 璇诲彇体检套餐
	 */
	public String getExamCombo(){
		return examCombo;
	} 
	
	/**
	 * 璁剧疆 体检套餐
	 */
	public void setExamCombo(String examCombo){
		this.examCombo = examCombo;
	}
	
	/**
	 * 璇诲彇体检时间
	 */
	public Date getExamTime(){
		return examTime;
	} 
	
	/**
	 * 璁剧疆 体检时间
	 */
	public void setExamTime(Date examTime){
		this.examTime = examTime;
	}
	
	/**
	 * 璇诲彇预约时间
	 */
	public Date getAppointmentTime(){
		return appointmentTime;
	} 
	
	/**
	 * 璁剧疆 预约时间
	 */
	public void setAppointmentTime(Date appointmentTime){
		this.appointmentTime = appointmentTime;
	}
	
	/**
	 * 璇诲彇取消时间
	 */
	public Date getCancelTime(){
		return cancelTime;
	} 
	
	/**
	 * 璁剧疆 取消时间
	 */
	public void setCancelTime(Date cancelTime){
		this.cancelTime = cancelTime;
	}
	
	/**
	 * 璇诲彇报告回传时间
	 */
	public Date getReportBackTime(){
		return reportBackTime;
	} 
	
	/**
	 * 璁剧疆 报告回传时间
	 */
	public void setReportBackTime(Date reportBackTime){
		this.reportBackTime = reportBackTime;
	}
	
	/**
	 * 璇诲彇上传员工标识:MD5(身份证号+姓名)
	 */
	public String getUploadEmpId(){
		return uploadEmpId;
	} 
	
	/**
	 * 璁剧疆 上传员工标识:MD5(身份证号+姓名)
	 */
	public void setUploadEmpId(String uploadEmpId){
		this.uploadEmpId = uploadEmpId;
	}
	
	/**
	 * 璇诲彇
	 */
	public Date getUploadReportTime(){
		return uploadReportTime;
	} 
	
	/**
	 * 璁剧疆 
	 */
	public void setUploadReportTime(Date uploadReportTime){
		this.uploadReportTime = uploadReportTime;
	}
	
	/**
	 * 璇诲彇从体检机构取回分析结果的时间
	 */
	public Date getGetDataTime(){
		return getDataTime;
	} 
	
	/**
	 * 璁剧疆 从体检机构取回分析结果的时间
	 */
	public void setGetDataTime(Date getDataTime){
		this.getDataTime = getDataTime;
	}
	
	/**
	 * 璇诲彇创建时间
	 */
	public Date getCreateTime(){
		return createTime;
	} 
	
	/**
	 * 璁剧疆 创建时间
	 */
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	
	/**
	 * 璇诲彇
	 */
	public String getExapOrgParentName(){
		return exapOrgParentName;
	} 
	
	/**
	 * 璁剧疆 
	 */
	public void setExapOrgParentName(String exapOrgParentName){
		this.exapOrgParentName = exapOrgParentName;
	}
	
	/**
	 * 璇诲彇
	 */
	public String getExapOrgParentId(){
		return exapOrgParentId;
	} 
	
	/**
	 * 璁剧疆 
	 */
	public void setExapOrgParentId(String exapOrgParentId){
		this.exapOrgParentId = exapOrgParentId;
	}
	
	/**
	 * 璇诲彇
	 */
	public String getExamError(){
		return examError;
	} 
	
	/**
	 * 璁剧疆 
	 */
	public void setExamError(String examError){
		this.examError = examError;
	}
	
	
}
