package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.modal.ApiResponse;
import com.example.modal.EmptyResponseData;
import com.example.modal.GetItemsResDetail;
import com.example.modal.VoteItems;
import com.example.service.VoteService;

@RestController
@RequestMapping("/api/vote")
public class VoteController {

	@Autowired
	private VoteService voteService;

	// 顯示所有投票項目
	@PostMapping("/getItems")
	public ApiResponse getAllVoteItems() {
		List<VoteItems> itemList = voteService.getAllVoteItems();

		GetItemsResDetail detail = new GetItemsResDetail();
		detail.setCount(itemList.size());
		detail.setItems(itemList);

		ApiResponse res = new ApiResponse();
		res.setNo(0);
		res.setMsg("");
		res.setData(detail);

		return res;
	}

	// 新增投票項目
	@PostMapping("/createItem")
	public ApiResponse createVoteItem(@RequestBody VoteItems voteItems) {
		ApiResponse res = new ApiResponse();

		if (voteService.createVoteItem(voteItems.getItem()) == 0) {
			res.setNo(0);
			res.setMsg("");
		} else {
			res.setNo(999);
			res.setMsg("此項目已存在。");
		}
		res.setData(new EmptyResponseData());

		return res;
	}
	
	// 更新投票項目
	@PostMapping("/updateItem")
	public ApiResponse updateVoteItem(@RequestBody VoteItems voteItems) {
		int msgno = voteService.updateVoteItem(voteItems.getId(), voteItems.getItem());
		
		ApiResponse res = new ApiResponse();
		res.setNo(msgno);

		if (msgno == 0) {
			res.setMsg("");
		} else if (msgno == 999) {
			res.setMsg("此項目已存在。");
		} else if (msgno == 998) {
			res.setMsg("此項目不存在。");
		}
		res.setData(new EmptyResponseData());

		return res;
	}

}
