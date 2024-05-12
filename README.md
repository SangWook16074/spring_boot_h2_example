# Spring Boot 백엔드 예제

Spring Boot & Kotlin으로 만든 간단한 H2 CRUD 예제입니다.

## CRUD

#### CREATE : 데이터 생성
#### READ : 데이터 조회
#### UPDATE : 데이터 갱신
#### DELETE : 데이터 삭제

## Api 명세

<table style="text-align:center;border=1">
    <tr>
        <th><h3>메소드</h3></th>
        <th><h3>Url</h3></th>
        <th><h3>Status Code</h3></th>
        <th><h3>입력데이터</h3></th>
        <th><h3>파라미터</h3></th>
        <th><h3>반환데이터</h3></th>
    </tr>
    <tr>
        <td><h4>Get</h4></td>
        <td><h4>/api/idols</h4></td>
        <td><h4>200</h4></td>
        <td><h4>null</h4></td>
        <td><h4>null</h4></td>
        <td><h4>아이돌 목록을 조회합니다.</h4></td>
    </tr>
    <tr>
        <td><h4>Get</h4></td>
        <td><h4>/api/idols/{id}</h4></td>
        <td><h4>200</h4></td>
        <td><h4>null</h4></td>
        <td><h4>id : Long</h4></td>
        <td><h4>id와 일치하는 아이돌을 조회합니다.</h4></td>
    </tr>
    <tr>
        <td><h4>Post</h4></td>
        <td><h4>/api/idols</h4></td>
        <td><h4>201</h4></td>
        <td><h4>idolRequestDto : IdolRequestDto</h4></td>
        <td><h4>idolResponseDto : IdolResponseDto</h4></td>
        <td><h4>아이돌을 생성합니다.</h4></td>
    </tr>
    <tr>
        <td><h4>Delete</h4></td>
        <td><h4>/api/idols/{id}</h4></td>
        <td><h4>200</h4></td>
        <td><h4>null</h4></td>
        <td><h4>id : Long</h4></td>
        <td><h4>사람 정보를 삭제합니다.</h4></td>
    </tr>
</table>