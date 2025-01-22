package com.example.modal;

import java.util.List;

public class GetItemsResDetail {

	private int count; // 筆數
	private List<VoteItems> items; // 投票項目資料

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<VoteItems> getItems() {
		return items;
	}

	public void setItems(List<VoteItems> items) {
		this.items = items;
	}

}
