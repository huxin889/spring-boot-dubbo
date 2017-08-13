package com.ai.huxin.study.controller;

import com.ai.huxin.test.service.interfaces.UserService;
import com.ai.huxin.test.vo.UserVo;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huxin on 2017/8/13.
 */
@RestController
public class UserVoController {
    @Reference
    private UserService userService;

    @RequestMapping("/queryUser")
    public UserVo queryUser (){
        UserVo userVo = userService.queryUserByPK(1);
        System.out.println(JSON.toJSONString(userVo));
        return userVo;
    }
}
