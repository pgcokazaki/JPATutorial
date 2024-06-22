package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Owner;
import com.example.demo.entity.Pet;

@Service
public class PetService {

    // 全件を検索して返す
    public List<Pet> getPetList() {
    	// TODO:仮実装
		return null;
    }

    // ペット情報登録
	public Pet savePet(Pet pet, Owner owner) {
    	// TODO:仮実装
		return null;
	}
}