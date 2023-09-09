package com.victorlevin.CurrencyCbrService.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@AllArgsConstructor
@Builder
public class CurrencyNominalRate {
    String numCode;
    String charCode;
    String nominal;
    String name;
    String value;
}
