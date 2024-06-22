package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Owner;

@Service
public class OwnerService {

    // 全件を検索して返す
    public List<Owner> getOwnerList() {
    	// TODO:仮実装
		return null;
    }

    // ID指定で検索して返す
    public Optional<Owner> findOwner(Integer ownerId) {
    	// TODO:仮実装
    	return Optional.empty();
    }

    // オーナー情報登録
	public Owner saveOwner(Owner owner) {
    	// TODO:仮実装
		return null;
	}
}