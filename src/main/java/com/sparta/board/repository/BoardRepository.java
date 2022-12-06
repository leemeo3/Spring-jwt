package com.sparta.board.repository;

import com.sparta.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findAllByOrderByModifiedAtDesc(); // 내림차순

    Optional<Board> findByIdAndPassword(Long id, String password);
    Optional<Board> findById(Long id);
}
