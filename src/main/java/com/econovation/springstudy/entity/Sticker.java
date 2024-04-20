package com.econovation.springstudy.entity;

import com.econovation.springstudy.config.enums.StickerLevel;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("sticker")
public class Sticker extends Goods{
    @Column(nullable = false)
    private StickerLevel stickerLevel;

    public Sticker(String name, int remaining, int sellingPrice, StickerLevel stickerLevel) {
        super(name, remaining, sellingPrice);
        this.stickerLevel = stickerLevel;
    }

    public static StickerBuilder builder(){
        return new StickerBuilder();
    }

    public static class StickerBuilder extends GoodsBuilder<StickerBuilder>{

        private StickerLevel stickerLevel;

        public StickerBuilder stickerLevel(StickerLevel stickerLevel){
            this.stickerLevel = stickerLevel;
            return self();
        }
        @Override
        public StickerBuilder self() {
            return this;
        }

        @Override
        public Sticker build() {
            return new Sticker(this.name, this.remaining, this.sellingPrice, this.stickerLevel);
        }
    }

    protected Sticker(){}
}