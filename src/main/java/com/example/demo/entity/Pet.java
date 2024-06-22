package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="pets")
public class Pet {

    public static enum Types {
        猫, 犬, トカゲ, ヘビ, 鳥, ハムスター
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    private Types type;

    // TODO:仮実装
    @Column(length = 10, nullable = false)
    private String ownerId;

}
