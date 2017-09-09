package com.crever.utils;

public class PageUtil {

	private int pageNum;
	private int startRow;
	private int endRow;
	private int startPage;
	private int endPage;
	private int totalPageCount;
	private int rowBlockCount;
	private int pageBlockCount;
	private int totalRowCount;

	public PageUtil(int pageNum, int totalRowCount) {
		this.pageNum = pageNum;
		this.totalRowCount = totalRowCount;
		this.totalPageCount = (int) Math.ceil((float) totalRowCount / 10);
		this.startPage = ((pageNum - 1) / 10 * 10 + 1);
		this.endPage = (startPage + 10 - 1);

		if (totalPageCount < endPage)
			endPage = totalPageCount;
	}

	public PageUtil() {
	}

	public int getPageNum() {
		return this.pageNum;
	}

	public int getStartRow() {
		return this.startRow;
	}

	public int getEndRow() {
		return this.endRow;
	}

	public int getStartPage() {
		return this.startPage;
	}

	public int getEndPage() {
		return this.endPage;
	}

	public int getTotalPageCount() {
		return this.totalPageCount;
	}

	public int getRowBlockCount() {
		return this.rowBlockCount;
	}

	public int getPageBlockCount() {
		return this.pageBlockCount;
	}

	public int getTotalRowCount() {
		return this.totalRowCount;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public void setRowBlockCount(int rowBlockCount) {
		this.rowBlockCount = rowBlockCount;
	}

	public void setPageBlockCount(int pageBlockCount) {
		this.pageBlockCount = pageBlockCount;
	}

	public void setTotalRowCount(int totalRowCount) {
		this.totalRowCount = totalRowCount;
	}

}