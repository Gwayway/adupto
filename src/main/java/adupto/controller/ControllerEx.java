package adupto.controller;

import adupto.bean.PostData;
import adupto.service.ExAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adex")
public class ControllerEx {
    @Autowired
    ExAdService exAdService;
    @RequestMapping(value = "/getad")
    public PostData post(Integer dv_num){
    }
}
