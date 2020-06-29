package com.zx.ssh.result;

import java.util.List;

public class Page<T> {

	private int currentPage;

	private int totalPage;

	private List<T> list;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public Page(int currentPage, int totalPage, List<T> list) {
		super();
		this.currentPage = currentPage;
		this.totalPage = totalPage;
		this.list = list;
	}
}
