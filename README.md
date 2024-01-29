# 📘 프로젝트: [배재대학교 강의실 예약 앱](https://play.google.com/store/apps/details?id=com.pcu.paichaiuniversityclassroomreservationapplication)
<div align="center">
  <img src="2. project 문서/- 참고 자료/강의실 예약 사용 이미지/ic.jpg">
</div>
</br>
</br>

<!-- # 목차 # -->
# 📖 목차
<!-- 1. 프로젝트 소개 -->
[📑 프로젝트 소개](#-프로젝트-소개)
- [❔ 개발 배경](#-개발-배경)
- [❕ 개발 목적](#-개발-목적)
- [📈 개발 기간](#-개발-기간)

<!-- 2. 프로젝트 개발 팀 -->
[👨‍💻 프로젝트 개발 팀](#-프로젝트-개발-팀)

<!-- 3. 기술 스택(사용한 기술) -->
[🛠 기술 스택](#-기술-스택)

<!-- 4. 프로젝트 시작 방법 -->
[🏁 프로젝트 시작 방법](#-프로젝트-시작-방법)

<!-- 5. 화면 구성(화면 정의서) -->
[📲 화면 구성](#-화면-구성)

<!-- 6. 주요 기능 -->
[⚙ 주요 기능](#-주요-기능)
- [🔐 로그인/회원가입](#-로그인회원가입)
- [🏢 강의실 예약](#-강의실-예약)

<!-- 7. 배포 주소 -->
[🌠 배포 주소](#-배포-주소)

<!-- 8. 개선 사항 -->
[🔨개선 사항🔧](#-개선-사항-)

<!-- 1. 프로젝트 소개 -->
# 📑 프로젝트 소개

<h3 align="center">📱 캡스톤 디자인 1 팀 프로젝트: 배재대학교 강의실 예약 앱 제작 📱</h3>
<br>

> ### ❔ 개발 배경 
- 강의실을 빌리는 과정의 번거로움 해소
- 카페나 PC방을 회의 장소로 사용시 비용소비 및 회의 진행에 제한되는 상황 최소화
- 사용하지 않는 빈 강의실 및 PC가있는 빈 강의실에 대한 사용율 상승   
<br>

> ### ❕ 개발 목적
- 스마트폰을 통한 사용되지 않는 강의실 정보 제공
- 원하는 시간에 원하는 강의실을 편하게 예약 및 탐색
- 외부 시설이 아닌 학교내의 시설이용으로 인한 비용 소비 절감
<br>

> ### 📈 개발 기간
<div align="center">
<table style="text-align:center">
    <thead>
        <tr>
            <th colspan=2 style="text-align:center">2022년 09월 ~ 2022년 12월(총 4개월)</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <th>2022년 9월</th>
            <td>
                - 주제 선정 <br>
                - 자료 조사 <br>
                - 보고서 및 계획서 작성 
            </td>
        </tr>
        <tr>
            <th>2022년 10월</th>
            <td>
                - 코드 구현
            </td>
        </tr>
        <tr>
            <th>2022년 11월</th>
            <td>
                - 추가 기능 구현 <br>
                - 중간 테스트(오류 수정)
            </td>
        </tr>
        <tr>
            <th>2022년 12월</th>
            <td>
                - 미완성 기능 구현 및 테스트 <br>
                - 구글 플레이 스토어에 배포 <br>
                - 발표
            </td>
        </tr>
    </tbody>
</table>
</div>
<br>

<!-- 2. 프로젝트 개발 팀 -->
# 👨‍💻 프로젝트 개발 팀
<div align="center">
<table style="text-align : center;">
    <tbody>
        <tr>
            <th>이명우</th>
            <th>PM</th>
            <td> 
                - 각종 보고서작성
            </td>
        </tr>
        <tr>
            <th>이영웅</th>
            <th>PA</th>
            <td>
                - 전체 코드 작업과 오류 체크, 테스트 <br>
                - 파이어베이스를 이용한 데이터 베이스 연동 <br>
                - 구글 플레이 스토어 배포
            </td>
        </tr>
        <tr>
            <th>이경재</th>
            <th>PA</th>
            <td>
                - 강의실사용종료후 정보 자동수정
            </td>
        </tr>
        <tr>
            <th>김상식</th>
            <th>PA</th>
            <td>
                - 회원가입 및 로그인후 예약날짜창으로 이동
            </td>
        </tr>
        <tr>
            <th>김완섭</th>
            <th>PA</th>
            <td>     
                - 빈 강의실의 예약과 취소
            </td>
        </tr>
        <tr>
            <th>이충용</th>
            <th>PA</th>
            <td>     
                - 앱 전체 디자인
            </td>
        </tr>
    </tbody>
</table>
</div>
<br>

<!-- 3. 기술 스택(사용한 기술) -->
# 🛠 기술 스택
<!--
  - 기술스택 배지로 깃허브 프로필, README.md 예쁘게 꾸미기
  > 사용법
    - 기본 구조
      <img src="https://img.shields.io/badge/표시할이름-색상?style=for-the-badge&logo=기술스택아이콘&logoColor=white">

  참고: https://cocoon1787.tistory.com/689 
-->
<div align="center">
<table style="text-align : center;">
    <tbody>
        <tr>
            <th width="20%">코드 작업</th>
            <th>
            <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> 
            <img src="https://img.shields.io/badge/android studio-3DDC84?style=for-the-badge&logo=androidstudio&logoColor=white">
            <img src="https://img.shields.io/badge/android-34A853?style=for-the-badge&logo=android&logoColor=white">
            </th>
        </tr>
        <tr>
            <th>데이터 베이스</th>
            <th>
            <img src="https://img.shields.io/badge/firebase-FFCA28?style=for-the-badge&logo=firebase&logoColor=white"> 
            </th>
        </tr>
        <tr>
            <th>배포</th>
            <th>
            <img src="https://img.shields.io/badge/google play-414141?style=for-the-badge&logo=googleplay&logoColor=white">
            <img src="https://img.shields.io/badge/google play Console-1677FF?style=for-the-badge&logo=googleplayconsole&logoColor=white">
            </th>
        </tr>
        <tr>
            <th>깃허브</th>
            <th>
            <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white"> 
            <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"> 
            <img src="https://img.shields.io/badge/sourcetree-0052CC?style=for-the-badge&logo=sourcetree&logoColor=white">
            </th>
        </tr>
    </tbody>
</table>
</div>
<br>

<!-- 4. 프로젝트 시작 방법 -->
# 🏁 프로젝트 시작 방법
<div align="center">
<table style="text-align : center;">
    <tbody>
        <tr>
            <th>필요한 설치 파일</th>
            <td>
                코드 작업: Android 스튜디오(최신 버전)<br>
            </td>
        </tr>
        <tr>
            <th>데이터베이스</th>
            <td>
                Firebase: https://firebase.google.com/?hl=ko<br>
            </td>
        </tr>
        <tr>
            <th>구글 플레이 스토어 배포</th>
            <td>Google Play Console: https://play.google.com/intl/ko/console/about/</td>
        </tr>
        <tr>
            <th>코드 파일</th>
            <td>

안드로이드 스튜디오 코드 파일: [코드 파일](https://github.com/HERO19-71604814/Pai-Chai-University-Classroom-Reservation-Application/tree/58d1f71eaf202e65824d37025b24dd34d759c28c/1.%20project%20file)<br>
            </td>
        </tr>
    </tbody>
</table>
</div>
<br>

<!-- 5. 화면 구성(화면 정의서) -->
# 📲 화면 구성
<div align="center">
<table style="text-align:center">
    <thead>
        <tr>
            <th colspan=2 style="text-align:center">🔐 로그인/회원가입 페이지</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td width="25%">로그인 페이지</td>
            <td><img src="2. project 문서/- image/로그인.png"></td>
        </tr>
        <tr>
            <td>회원가입 페이지</td>
            <td><img src="2. project 문서/- image/회원가입.png"></td>
        </tr>
    </tbody>
</table>
<br>

<table style="text-align:center">
    <thead>
        <tr>
            <th colspan=2 style="text-align:center">🏢 강의실 예약 페이지</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td width="25%">1. 강의실 예약(날짜입력)</td>
            <td><img src="2. project 문서/- image/예약(날짜입력).png"></td>
        </tr>
        <tr>
            <td>2. 강의실 예약(시간입력)</td>
            <td><img src="2. project 문서/- image/예약(시간입력).png"></td>
        </tr>
        <tr>
            <td width="25%">3. 강의실 예약(자리선택)</td>
            <td><img src="2. project 문서/- image/예약(자리선택).png"></td>
        </tr>
        <tr>
            <td>4. 강의실 예약(정보확인 후 메인페이지로)</td>
            <td><img src="2. project 문서/- image/예약(정보확인 후 메인페이지로).png"></td>
        </tr>
    </tbody>
</table>
</div>
<br>

<!-- 6. 주요 기능 -->
# ⚙ 주요 기능
### 🔐 로그인/회원가입
- 파이어베이스에 회원정보와 ID와 PASSWORD저장하는 회원가입 기능
- 파이어베이스에 저장된 회원정보중 ID와 PASSWORD정보가 일치할 시 로그인되는 기능

### 🏢 강의실 예약
- 로그인시 회원에게 강의실 정보를 제공 후 예약을 받는 예약 기능 

<br>

<!-- 7. 배포 주소 -->
# 🌠 배포 주소 
<div align="center">

### 주소: https://play.google.com/store/apps/details?id=com.pcu.paichaiuniversityclassroomreservationapplication

</div>
<br>

<!-- 8. 개선 사항(필요 없을 시 주석처리) -->
# 🔨 개선 사항 🔧
- 디자인 개편
- 회원가입 통합(이메일, 아이디 등록 후 개인정보 등록하는 순서 개선)
- 강의실 예약정보를 파이어베이스에 등록된 계정에 연동시켜 저장하기
- 예약정보를 확실하고 편리하게 볼수있게 시각화 하기
- 게시판 기능 추가
- 업데이트 해보기(파일 수정 후에)  
