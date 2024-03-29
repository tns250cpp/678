<!--헤더-->
<img src="https://capsule-render.vercel.app/api?type=waving&height=300&color=gradient&text=678%20Project&fontAlign=50&fontAlignY=50&descAlign=100&textBg=false&fontColor=black&animation=twinkling&fontSize=90" />

### 678 노션 => [notion_link]([https://www.notion.so/678-a00e001a30254db1b99d082ae94a67dc](https://thankful-cuticle-e53.notion.site/0bb888c3879c4de59805eeb36072527a))

# 678 산책 메이트

## 목차
- [프로젝트소개](#프로젝트소개)
- [서비스소개](#서비스소개)
- [팀원(역할분담)](#팀원(역할분담))
- [개발환경](#개발환경)
- [기술스택](#기술스택)
- [기능(이미지)](#기능)
<br>

## 프로젝트소개

- **678 산책 메이트** 는 실시간 미세먼지 정보를 활용한 산책 메이트를 구하는 커뮤니티 입니다.

  사용자들에게 주변의 공원들을 추천하고, 해당 지역의 미세먼지 수준을 실시간으로 제공하여

  건강하고 쾌적한 산책을 즐길 수 있도록 지원합니다. 함께 산책을 나가고 싶은 사람들을 구하여

  새로운 친구를 만들고, 건강한 라이프스타일을 즐길 수 있는 서비스입니다.
  
---

## 서비스소개
- 로그인 / 회원가입 기능 (회원가입시 이메일 인증)
- 소셜 로그인 기능 (소셜 로그인[카카오톡, 네이버, 구글] -> 자동 회원가입)
- 게시판 CRUD (계층형 댓글 및 대댓글 기능 포함)
- 카테고리별 검색 기능
- 웹 소켓 채팅을 통한 산책 메이트 구하기(개별 채팅방)
- 마이페이지
- 카카오 지도 API를 통한 공원 데이터
- 실시간 미세먼지 현황 데이터
  
---

## 팀원(역할분담)

|[박태현](https://github.com/ming9ne)|[조상준](https://github.com/tns250cpp)|[이승철](https://github.com/Seungchuulee)|
|---|---|---|
|![PTH_](https://github.com/ming9ne/678/assets/31677719/9d80bf72-2536-4f60-98f4-59bc90a94436)|![CSJ_](https://github.com/ming9ne/678/assets/31677719/186cf805-8526-44d2-bf56-fd983325503b)|![LSC_](https://github.com/ming9ne/678/assets/31677719/3cef4d90-f021-499d-8717-db4da8c7e2e4)|
|∙ Spring Cloud Gateway 설정            |∙ Spring Security 설정                      |∙ 로그인 및 회원가입 기능 구현
|∙ Microservices Architecture 구조 설계 |∙ 소셜 로그인 및 일반 로그인 메일인증 구현   |∙ 게시판 CRUD 기능 구현
|∙ CORS 설정                            |∙ 공공 데이터 DTO화 및 DB 백업(스케줄러 사용)|∙ 로그인,회원가입 및 게시판 페이지 제작
|∙ Front 화면 구성                      |∙ 예외 처리 Handler 구현                     |∙ 채팅방 프로토타입 제작
|∙ 카카오 지도를 통한 공공데이터 표시    |∙ 게시판 대댓글 기능 구현(JSON 계층형 트리)  |∙ 검색 기능 구현
|∙ GitHub, Notion 관리                  |∙ 웹 소켓 멀티 채팅방 기능 구현              | ∙ 회원, 게시판 DB 설계
                       


---

## 아키텍처
![678 아키텍처](https://github.com/tns250cpp/678/assets/31677719/fe1d6b7d-7fe0-43b7-bac0-74b46c3f6fcd)

---

<!--기술 스택 뱃지 처리-->
## 기술스택

[✨ Tech Stack ✨]
<div align="center">
  <h4>Front</h4>
  <img src="https://img.shields.io/badge/react-20232a.svg?style=for-the-badge&logo=react&logoColor=61DAFB" />&nbsp
  <img src="https://img.shields.io/badge/html5-E34F26.svg?style=for-the-badge&logo=html5&logoColor=white" />&nbsp
  <img src="https://img.shields.io/badge/CSS3-1572B6.svg?&style=for-the-badge&logo=CSS3&logoColor=white"/>&nbsp
  <img src="https://img.shields.io/badge/javascript-F7DF1E.svg?style=for-the-badge&logo=javascript&logoColor=20232a" />&nbsp
  <img src="https://img.shields.io/badge/jquery-0769AD?style=for-the-badge&logo=jquery&logoColor=white">&nbsp
  <img src="https://img.shields.io/badge/bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white">&nbsp
</div>
<div align="center">
  <h4>Back</h4>
  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white">&nbsp
  <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white">&nbsp
  <img src="https://img.shields.io/badge/spring boot-6DB33F?style=for-the-badge&logo=spring boot&logoColor=white">&nbsp
  <img src="https://img.shields.io/badge/spring security-6DB33F?style=for-the-badge&logo=spring security&logoColor=white">&nbsp
</div>
<div align="center">
  <h4>DB</h4>
  <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">&nbsp
  <img src="https://img.shields.io/badge/Spring JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white">&nbsp
</div>
<div align="center">
  <h4>Server</h4>
  <img src="https://img.shields.io/badge/Apache tomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white">&nbsp
  <img src="https://img.shields.io/badge/Spring Cloud Gateway-6DB33F?&style=for-the-badge&logo=spring cloud gateway&logoColor=white"/>&nbsp
</div>
<div align="center">
  <h4>Collaboration Tools</h4>
  <img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white">&nbsp
  <img src="https://img.shields.io/badge/github-181717?&style=for-the-badge&logo=github&logoColor=white"/>&nbsp
</div>

---
---

## 기능

### 회원가입
![회원가입](https://ifh.cc/g/koNwAH.png)
- 새로운 사용자를 위한 회원가입 기능입니다. 이메일 인증을 통해 회원가입을 완료할 수 있습니다.

---

### 로그인
![로그인](https://ifh.cc/g/X2Wp94.png)
- 기존 사용자들이 서비스에 로그인하는 기능입니다. 안전한 인증을 위해 사용됩니다.

---

### 소셜 로그인
![소셜 로그인](https://ifh.cc/g/9YGlpl.png)
- 카카오톡, 네이버, 구글 등의 소셜 플랫폼 계정을 사용하여 간편하게 로그인할 수 있는 기능입니다.

---

### 게시판
![게시판](https://ifh.cc/g/kl6s9W.png)
- 사용자들이 글을 작성하고 읽을 수 있는 게시판 기능입니다. 다양한 커뮤니케이션을 위한 공간으로 활용됩니다.

---

### 댓글
![댓글](https://ifh.cc/g/X2Wp94.png)
- 게시글에 대한 댓글을 작성하고 읽을 수 있는 기능입니다. 사용자들 간의 소통을 촉진합니다.

---

### 채팅
![채팅](https://ifh.cc/g/fvW6ga.png)
- 사용자들 간에 산책 메이트를 구하기 위한 실시간 채팅 기능입니다. 산책을 함께 나갈 파트너를 찾을 수 있습니다.
- map으로 게시글 번호 기준 멀티 채팅방을 구현하여 다양한 멀티채팅방을 제공합니다.

---

### 지도
![지도](https://ifh.cc/g/yZh68d.jpg)
- 카카오 지도 API를 통해 공원 데이터를 제공하는 기능입니다. 사용자들에게 주변 공원 정보 및 실시간 미세먼지 정보를 제공합니다.
- 미세먼지 등급에 따른 색감을 가진 원을 표시하고 공원 위치 정보를 마크표시로 넣어 시각적 효과를 추가하였습니다.
<!--푸터
## 기능
- 서비스 진행되는 간단한 이미지?(이 문구는 나중에 지우기)
-->
<!--푸터-->
<!--
<img src="https://capsule-render.vercel.app/api?type=waving&height=200&color=gradient&text=&fontAlign=50&fontAlignY=50&descAlign=100&textBg=false&fontColor=black&animation=twinkling&fontSize=90" />
-->
