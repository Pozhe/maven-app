package com.study.controller;

import com.study.pojo.User;
import com.study.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/study")
public class StudyController {
    private static Logger logger = Logger.getLogger(StudyController.class);


    @Autowired
    private UserService userService;
    /**
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/initUrl" , method = RequestMethod.GET)
    public String initUrl(Model model){
        logger.info("aadf");
        return "init";
    }

    @RequestMapping(value = "/initProject",method = RequestMethod.GET)
    public String initProject(){
        try {
            List<User> list = userService.getUsers();
            User use1r = userService.getUser(new User(1,null,null));
            use1r.getPassword();
            logger.debug("usdf");
        } catch (Exception e) {
            logger.debug(e);
        }
        return "init";
    }
}
