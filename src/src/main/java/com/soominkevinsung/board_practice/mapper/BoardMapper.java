package com.soominkevinsung.board_practice.mapper;

import com.soominkevinsung.board_practice.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {
    int boardCount();

    List<Board> getList();

    Board getBoard(Long boardId);
}
