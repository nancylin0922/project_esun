package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.modal.VoteItems;

@Repository
public interface VoteDao extends JpaRepository<VoteItems, Integer> {

	List<VoteItems> findByItem(String item);
	
	@Procedure(name = "createVoteItem")
    int createVoteItem(@Param("str") String str);
	
	@Procedure(name = "updateVoteItem")
    int updateVoteItem(@Param("id") int id, @Param("newItem") String newItem);
	
}