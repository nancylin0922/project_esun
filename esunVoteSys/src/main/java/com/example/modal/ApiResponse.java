package com.example.modal;

public class ApiResponse {

	private int no; // 錯誤代碼
	private String msg; // 錯誤訊息
	private Object data; // 回傳資料

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}
