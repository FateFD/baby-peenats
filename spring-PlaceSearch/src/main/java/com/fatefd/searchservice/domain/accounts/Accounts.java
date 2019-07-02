package com.fatefd.searchservice.domain.accounts;

import javax.persistence.*;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Accounts {

    @Id
    private String id;
    
    @Column(length = 50, nullable = false)
    private String password;
    
    @Builder
    public Accounts(String id, String password) {
        this.id = id;
        this.password = password;
    }
}