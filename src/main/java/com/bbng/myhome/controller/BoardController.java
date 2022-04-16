package com.bbng.myhome.controller;

import com.bbng.myhome.model.Board2;
import com.bbng.myhome.repository.Board2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board") // 경로 지정. (localhost:8080/board 로 맵핑된다)
public class BoardController {

    @Autowired // 이 어노테이션까지 붙여야 DI 하는 것임.
    private Board2Repository board2Repository;

    // Get 통신
    // 경로는 localhost:8080/board/list 로 맵핑된다.
    @GetMapping("/list")
    public String list(Model model) {
        List<Board2> boards = board2Repository.findAll();
        model.addAttribute("boards", boards);
        return "board/list";
    }
}
