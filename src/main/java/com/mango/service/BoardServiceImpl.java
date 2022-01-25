package com.mango.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mango.dao.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	@Override
	public List list() throws Exception{
		return dao.list();
	}
}
