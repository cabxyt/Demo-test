package com.play.common;

public class Page {
	// TODO Auto-generated method stub
	// 当前页
	Integer page;
	// 一页几条
	Integer limit;
	// 总记录数
	Integer total;
	// 排序列名
	String sidx;
	// 排序方式
	String order;
	// 分页起始位置
	Integer startRow;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Integer getStartRow() {
		if (page != null && limit != null) {
			return (page - 1) * limit;
		}
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

}
