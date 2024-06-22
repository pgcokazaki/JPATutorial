package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Owner;
import com.example.demo.service.OwnerService;

@Controller
@RequestMapping("owner")
public class OwnerController {
    private final OwnerService service;

    public OwnerController(OwnerService service) {
        this.service = service;
    }

    // ----- 一覧画面 -----
    @GetMapping("/list")
    public String getList(@ModelAttribute Owner owner, Model model) {
        // 全件検索結果をModelに登録
        model.addAttribute("ownerList", service.getOwnerList());
        // list.htmlに画面遷移
        return "owner/list";
    }

    // ----- 登録処理 -----
    @PostMapping("/add")
    public String add(Owner owner) {
    	// オーナー登録
        service.saveOwner(owner);
        return "redirect:/owner/list";
    }

}