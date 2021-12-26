package com.laioffer.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class GameController {

    // xxxx/game?game_name=war%20of%20warcraft
    // xxxx/game ---- "required = false" to avoid 404 under this case.
    @RequestMapping(value = "/game", method = RequestMethod.GET)
    public void getGame(@RequestParam(value = "game_name", required = false) String gameName, HttpServletResponse response) throws IOException {
        System.out.println("Game name is " + gameName);
    }

}

