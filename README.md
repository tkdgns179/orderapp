## 주문 어플리케이션 (WEB)

### 수정일 2022-10-09 12:00 ( <u>ERD</u> )

![ERD](./img/러프%20ERD.jpg)
> 1. 유저(고객)
- PK (식별키) char(20) - 핸드폰 번호 phone_number
- NOT NULL, char(10) - 이름 user_name
- NOT NULL, char(20) - 닉네임 user_nickname
- NOT NULL, char(20) - 패스워드 user_password
- FK (외래키) number - 주문 번호 order_id
- NOT NULL char(50) - 배달 주소 user_address
- NOT NULL char(10) - 유저 타입 user_type
- NOT NULL date - 계정 생성일 create_date

<hr>

### 2022-10-09 12:00 ( 설계 - 로그인 페이지 )
- 유저타입은 2종류가 존재한다. 주문하는 손님, 가게 주인
- 유저타입이 2개 존재함으로 메인페이지(index.html)는 아이디, 패스워드,  
  유저타입을 입력하고 로그인을 하는 인터페이스와 회원가입을 하는 새로운 페이지를 만든다.
- 회원가입은 아이디 중복체크 후, 패스워드를 2번 입력받아 일치하는 지  
  확인하고 스프링 시큐리티의 암호화 인스턴스로 암호화를 시킨후 저장한다.
- 로그인은 입력받은 아이디로 유저를 가져온후 레코드가 존재하는 경우  
  복호화된 값이 일치하는지 확인한 후 세션처리를 해준다.
