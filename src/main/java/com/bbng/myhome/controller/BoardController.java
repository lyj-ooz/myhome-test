package com.bbng.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board") // 경로 지정. (localhost:8080/board 로 맵핑된다)
public class BoardController {

    // Get 통신
    // 경로는 localhost:8080/board/list 로 맵핑된다.
    @GetMapping("/list")
    public String list() {
        return "board/list";
    }
}
