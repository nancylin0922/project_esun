package com.example.modal;

import jakarta.persistence.*;

@Entity
@Table(name = "vote_items")
public class VoteItems {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; // 投票項目編號
	
	@Column(name = "item", nullable = false)
	private String item; // 投票項目名稱

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
}
