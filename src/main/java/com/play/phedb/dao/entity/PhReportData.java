package com.play.phedb.dao.entity;

import java.util.Date;

import com.play.common.Page;

/**
 * 体检报告数据
 */
public class PhReportData extends Page  {

	/**
	 * 体检ID
	 */
	private Long examId; 
	
	/**
	 * 员工ID
	 */
	private String examData; 
	
	/**
	 * 创建时间
	 */
	private Date createTime; 
	
	
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
	public String getExamData(){
		return examData;
	} 
	
	/**
	 * 璁剧疆 员工ID
	 */
	public void setExamData(String examData){
		this.examData = examData;
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
	
	
}
