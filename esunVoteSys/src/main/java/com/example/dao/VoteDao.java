package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.modal.VoteItems;

@Repository
public interface VoteDao extends JpaRepository<VoteItems, Integer> {

}
