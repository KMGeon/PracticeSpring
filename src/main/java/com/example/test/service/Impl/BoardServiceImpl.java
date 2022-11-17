package com.example.test.service.Impl;

import com.example.test.dao.BoardMapper;
import com.example.test.dto.BoardDto;
import com.example.test.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    BoardMapper boardMapper;
    @Override
    public List<BoardDto> boardList(){
        return  this.boardMapper.boardList();
    }

    @Override
    public int insertData(BoardDto boardDto){
        return this.boardMapper.insertData(boardDto);
    }
}