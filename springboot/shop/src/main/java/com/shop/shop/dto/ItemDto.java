package com.shop.shop.dto;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
public class ItemDto {

    private Long id;
    private String itemNm;
    private Integer price;
    private String itemDetail;
    private String sellStatCd;
    private LocalDateTime regTime;
    private LocalDateTime updateTime;
}
