package com.example.orderapp.sign;

import com.example.orderapp.domain.User;
import com.example.orderapp.domain.UserType;
import com.example.orderapp.dto.SignUpDto;
import com.example.orderapp.repository.UserRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@DataJpaTest
public class SignUpTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void 손님으로_회원가입() {
        System.out.println("# test1 시작");

        SignUpDto signUpDto = SignUpDto.builder()
            .username("김상훈")
            .password("1234")
            .phoneNumber("010-1111-2222")
            .userType("손님")
            .address("장승배기로 111")
            .build();

        if ( signUpDto.getUserType().equals( UserType.customer.getTypeName() )) {
            System.out.println("유저생성 IN");
            User userEntity = signUpDto.toUserEntity();
            userRepository.save(userEntity);
            System.out.println("유저생성 OUT");
        }


        User userEntityFound = userRepository.findById("010-1111-2222").orElse(new User());

        System.out.println(userEntityFound.getUserName());

    }

}
