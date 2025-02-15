package com.backendStudy.cat.service;

import com.backendStudy.cat.domain.DTOBoard;

import java.util.List;

public interface BoardService {
    public Long registerBoard(DTOBoard board);
    public Long editBoard(DTOBoard board);
    public DTOBoard getBoardDetail(Long index);
    public boolean deleteBoard(long index);
    public List<DTOBoard> getBoardList();
    public Integer setBoardView(Long index);
}
