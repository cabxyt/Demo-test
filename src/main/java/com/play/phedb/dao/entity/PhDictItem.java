package com.play.phedb.dao.entity;


import com.play.common.Page;

/**
 * 
 */
public class PhDictItem extends Page  {

	/**
	 * 字典项Id
	 */
	private Integer dictId; 
	
	/**
	 * 字典类型
	 */
	private String dictType; 
	
	/**
	 * 字典项编码
	 */
	private String dictItemCode; 
	
	/**
	 * 字典项名称
	 */
	private String dictItemName; 
	
	/**
	 * 字典项顺序
	 */
	private Integer showOrder; 
	
	/**
	 * 字典项状态：1、开启 2、关闭
	 */
	private Integer itemStatus; 
	
	/**
	 * 备注
	 */
	private String remark; 
	
	
	/**
	 * 璇诲彇字典项Id
	 */
	public Integer getDictId(){
		return dictId;
	} 
	
	/**
	 * 璁剧疆 字典项Id
	 */
	public void setDictId(Integer dictId){
		this.dictId = dictId;
	}
	
	/**
	 * 璇诲彇字典类型
	 */
	public String getDictType(){
		return dictType;
	} 
	
	/**
	 * 璁剧疆 字典类型
	 */
	public void setDictType(String dictType){
		this.dictType = dictType;
	}
	
	/**
	 * 璇诲彇字典项编码
	 */
	public String getDictItemCode(){
		return dictItemCode;
	} 
	
	/**
	 * 璁剧疆 字典项编码
	 */
	public void setDictItemCode(String dictItemCode){
		this.dictItemCode = dictItemCode;
	}
	
	/**
	 * 璇诲彇字典项名称
	 */
	public String getDictItemName(){
		return dictItemName;
	} 
	
	/**
	 * 璁剧疆 字典项名称
	 */
	public void setDictItemName(String dictItemName){
		this.dictItemName = dictItemName;
	}
	
	/**
	 * 璇诲彇字典项顺序
	 */
	public Integer getShowOrder(){
		return showOrder;
	} 
	
	/**
	 * 璁剧疆 字典项顺序
	 */
	public void setShowOrder(Integer showOrder){
		this.showOrder = showOrder;
	}
	
	/**
	 * 璇诲彇字典项状态：1、开启 2、关闭
	 */
	public Integer getItemStatus(){
		return itemStatus;
	} 
	
	/**
	 * 璁剧疆 字典项状态：1、开启 2、关闭
	 */
	public void setItemStatus(Integer itemStatus){
		this.itemStatus = itemStatus;
	}
	
	/**
	 * 璇诲彇备注
	 */
	public String getRemark(){
		return remark;
	} 
	
	/**
	 * 璁剧疆 备注
	 */
	public void setRemark(String remark){
		this.remark = remark;
	}
	
	
}
