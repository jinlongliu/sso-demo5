package org.playchain.demo5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Liu on 2017/8/22.
 */
@Controller
public class DataController {

    private static final Logger logger = LoggerFactory.getLogger(DataController.class);


    @RequestMapping("/data")
    public String data() {
        logger.info("Data controller");
        return "data";
    }

    @RequestMapping("/hello")
    public String index() {
        return "hello";
    }
}
