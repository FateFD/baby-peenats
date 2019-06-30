package com.etakhee.searchservice.domain.accounts;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class AccountsSaveRequestDto {
    private String id;
    private String password;

    public Accounts toEntity(){
        return Accounts.builder()
                .id(id)
                .password(password)
                .build();
    }
}