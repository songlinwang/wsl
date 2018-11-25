package com.netease.wsl.controller;

import com.netease.wsl.meta.User;
import com.netease.wsl.service.UserService;
import com.netease.wsl.vo.JsonResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private UserService userService;

    @RequestMapping("/hello")
    public String hello() {
        return "<html>\n" +
                "\n" +
                "<head>\n" +
                "<title>我的第一个 HTML 页面</title>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "<p>body 元素的内容会显示在浏览器中。</p>\n" +
                "<p>title 元素的内容会显示在浏览器的标题栏中。</p>\n" +
                "</body>\n" +
                "\n" +
                "</html>";
    }

    @GetMapping("/user/get/{id}")
    public ResponseEntity<JsonResult> getUserById(@PathVariable int id) {
        JsonResult result = new JsonResult();
        try {
            User user = userService.getUserById(id);
            result.setStatus("ok");
            result.setResult(user);
        } catch (Exception e) {
            result.setResult(e);
            result.setStatus("error");
        }
        return ResponseEntity.ok(result);
    }

    @PostMapping("/user/add")
    public ResponseEntity<JsonResult> addUser(@RequestParam User user){
        JsonResult result = new JsonResult();
        try{
            boolean addFlag = userService.add(user);
            result.setResult(addFlag);
            result.setStatus("ok");
        }catch (Exception e){
            result.setResult(e);
            result.setStatus("error");
        }
        return ResponseEntity.ok(result);
    }
}
