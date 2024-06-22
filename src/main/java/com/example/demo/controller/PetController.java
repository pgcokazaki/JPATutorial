package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Pet;
import com.example.demo.service.OwnerService;
import com.example.demo.service.PetService;

@Controller
@RequestMapping("pet")
public class PetController {
    private final PetService petService;

    private final OwnerService ownerService;

    public PetController(PetService petService, OwnerService ownerService) {
        this.petService = petService;
        this.ownerService = ownerService;
    }

    // ----- 一覧画面 -----
    @GetMapping("/list")
    public String getList(Model model) {
        // 全件検索結果をModelに登録
        model.addAttribute("petList", petService.getPetList());
        // list.htmlに画面遷移
        return "pet/list";
    }

    // ----- 登録画面 -----
    @GetMapping("/add")
    public String create(@ModelAttribute Pet pet) {
        // TODO:仮実装
        return "pet/add";
    }

    // ----- 登録処理 -----
    @PostMapping("/add")
    public String add(Pet pet) {
        // TODO:仮実装
        return "redirect:/pet/list";
    }

}