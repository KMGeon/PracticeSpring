package com.example.test.dao;

import com.example.test.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    public List<BoardDto>boardList();
    public int insertData(BoardDto boardDto);
}
