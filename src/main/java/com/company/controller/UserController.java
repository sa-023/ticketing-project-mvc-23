package com.company.controller;
import com.company.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 🖍️...
 * · Entity engages with DB and DTO engages with UI.
 * · Entity and DTO separation happens because sometimes in a database we might have extra fields (ex: user id, lastUpdateDateTime etc...)
 *   that we don't want to display on the UI.
 * · We will use the mapper structure to map the entity to dto.
 *
 * · If data is persistent, then it's sustained even if the process, cluster, node, or container is changed or removed.
 * · If data is non-persistent, this means that it can be altered, removed, or lost if the process, cluster, node, or container is changed or removed.
 *
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/create")
    public String createUser(Model model){

        model.addAttribute("user", new UserDTO());


        return "/user/create";

    }





}
