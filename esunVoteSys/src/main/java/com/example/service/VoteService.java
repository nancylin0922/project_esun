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
	
	public VoteItems createVoteItem(VoteItems voteItems) {
        return voteDao.save(voteItems);
    }
}
