package com.haihang.zuul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by life on 2017/10/19.
 */
@RestController
public class ConsumerController {
    @Autowired
    ComputeClient computeClient;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        Integer add = computeClient.add(10, 20);
        System.out.println(add);
        return add;
        }
}
