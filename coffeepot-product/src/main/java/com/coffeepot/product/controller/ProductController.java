package com.coffeepot.product.controller;

import com.coffeepot.common.core.controller.BaseController;
import com.coffeepot.common.core.domain.AjaxResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 产品信息操作处理
 *
 * @author michael
 */
@RestController
@RequestMapping("/product")
public class ProductController extends BaseController {
    /**
     * 测试方法
     */
    @GetMapping("/test")
    public AjaxResult test() {
        AjaxResult result = AjaxResult.success();
        result.put("msg", "产品模块初始化测试");
        return result;
    }
}
