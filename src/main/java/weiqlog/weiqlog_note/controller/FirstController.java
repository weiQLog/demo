package weiqlog.weiqlog_note.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String hello(){
        return "NOTE";
    }


}
