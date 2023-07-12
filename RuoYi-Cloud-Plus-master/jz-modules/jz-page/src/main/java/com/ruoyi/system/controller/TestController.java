package com.ruoyi.system.controller;

import com.ruoyi.system.domain.OffiProduct;
import com.ruoyi.system.service.IOffiProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private IOffiProductService iOffiProductService;

    @RequestMapping("test")
    public String test(){
        List<OffiProduct> products = iOffiProductService.list();
        if (products != null) {
            for (OffiProduct product : products) {
                System.out.println(product);
            }
        }
        return "test";
    }
}
