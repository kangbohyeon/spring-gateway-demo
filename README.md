# 구조

1. demo1,demo1_second,demo2,demo3는  테스트용서비스로 생성, 간단한 ip찍는 컨트롤러 정도의 로직만 존재, 랜덤포트 사용<br>
2. demo1와 demo1_second는 로드밸런싱용 서비스로 똑같은 프로젝트를 2개 생성, api호출 시 demo1와 demo1_second가 번갈아 가면서 호출됨<br>
3. gateway는 spring-cloud-gateway를 구현한 프로젝트, 8080 포트 사용<br>
4. eureka는 서비스 발견을 구현한 프로젝트, 8761 포트 사용<br>


# 실행 방법
각 디렉토리별로 구동

# 테스트 방법
gateway port로 api를 호출하면 각각 서비스에서 응답

## example <br>
호출 : GET http://localhost:8080/demo1/temp<br>
응답 : demo1/temp : 55567

호출 : GET http://localhost:8080/demo1/temp<br>
응답 : demo1/temp : 50171

호출 : GET http://localhost:8080/demo1/temp2<br>
응답 : demo1/temp2 : 55567

호출 : GET http://localhost:8080/demo1/temp2<br>
응답 : demo1/temp2 : 50171

호출 : GET http://localhost:8080/demo2/temp<br>
응답 : demo2/temp : 55765

호출 : GET http://localhost:8080/demo3/temp<br>
응답 : demo3/temp : 55700

# 서비스 발견
1. localhost:8761로 접속하면 서비스 발견 페이지 존재<br>
2. 서비스 및 게이트웨이를 구동한 후 <br>localhost:8761에서 Instances currently registered with Eureka 탭에 <br>FIRST-SERVICE-SERVER,GATEWAY, SECOND-SERVICE-SERVER, THIRD-SERVICE-SERVER 가 있으면 정상<br>
3. 서비스 상태 확인은 30초 마다 확인 중 
