package com.etakhee.searchservice.web;

import org.springframework.web.bind.annotation.*;
import com.etakhee.searchservice.domain.accounts.*;

import lombok.*;

@RestController
@AllArgsConstructor
public class SearchRestController {
    private AccountsRepository accountRepository;
    
    @PostMapping("/accounts")
    public void createAccount(@RequestBody AccountsSaveRequestDto dto) {
        accountRepository.save(dto.toEntity());
    }
}
