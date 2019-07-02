package com.fatefd.searchservice.domain.accounts;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountsRepositoryTests {

    @Autowired
    AccountsRepository accountsRepository;

    @After
    public void cleanup() {
        /** 
        이후 테스트 코드에 영향을 끼치지 않기 위해 
        테스트 메소드가 끝날때 마다 respository 전체 비우는 코드
        **/
        accountsRepository.deleteAll();
    }

    @Test
    public void Create_Account() {
        //given
        accountsRepository.save(Accounts.builder()
                .id("fatefd")
                .password("1111")
                .build());

        //when
        List<Accounts> accountList = accountsRepository.findAll();

        //then
        Accounts account = accountList.get(0);
        assertThat(account.getId(), is("fatefd"));
        assertThat(account.getPassword(), is("1111"));
    }
}