package org.uasz.ec2_deploy_springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplicationController {

    @RequestMapping("/tablededeux")
    public String tablededeux(){

        return "Il faut faire 2 * 5 = 10";
    }
}
