package com.victorlevin.CurrencyCbrService.domain;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.List;

@Value
@AllArgsConstructor
public class CurrencyNamesAndCharCodesDto {
    List<CurrencyNameAndCharCode> nameAndCharCodeDtoList;
}
