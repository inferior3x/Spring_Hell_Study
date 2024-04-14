package com.econovation.springstudy.entity;

import jakarta.persistence.*;

@Entity
public class Sticker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    private int remaining;


    public Sticker(String name, int remaining) {
        this.name = name;
        this.remaining = remaining;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    public Sticker() {
    }
}
