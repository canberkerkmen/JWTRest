package com.erkmen.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
@Api(tags = "base")
public class BaseController {

    @GetMapping(value = "/hello/{username}")
    @ApiOperation(value = "${BaseController.hello}")
    public String hello(@ApiParam("Username") @PathVariable String username) {
        return "Hello " + username;
    }

}
