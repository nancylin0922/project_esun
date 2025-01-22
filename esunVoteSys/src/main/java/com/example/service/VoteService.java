package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.VoteDao;
import com.example.modal.VoteItems;

@Service
public class VoteService {

	@Autowired
	private VoteDao voteDao;

	public List<VoteItems> getAllVoteItems() {
		return voteDao.findAll();
	}

	public int createVoteItem(String item) {
		return voteDao.createVoteItem(item);
	}

	public int updateVoteItem(int id, String item) {
		return voteDao.updateVoteItem(id, item);
	}
	
}
