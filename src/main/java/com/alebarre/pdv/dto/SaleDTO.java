package com.alebarre.pdv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleDTO {

    private long userid;

    List<ProductSaleDTO> items;
}
