package spring.mvc.common;

public interface Constant {
	//발급받은 서비스키
	String API_SERVICE_KEY = "4PhEuMFFaJJtwDIIdpqN4IlCT7bFRiHmPA%2BPnLly9aAXSYFk%2BM5rmeUeVgMmkGt2UPnti4TxtR6GVuGnU5wDjg%3D%3D";
	
	//API
	String API_SIDO_URL = "http://openapi.animal.go.kr/openapi/service/rest/abandonmentPublicSrvc/sido?numOfRows=20&ServiceKey=" + API_SERVICE_KEY;
	String API_SIGUNGU_URL = "http://openapi.animal.go.kr/openapi/service/rest/abandonmentPublicSrvc/sigungu?ServiceKey=" + API_SERVICE_KEY;
	String API_CENTER_URL = "http://openapi.animal.go.kr/openapi/service/rest/abandonmentPublicSrvc/shelter?ServiceKey=" + API_SERVICE_KEY;
	String API_ABANDONMENT_ANIMAL_URL = "http://openapi.animal.go.kr/openapi/service/rest/abandonmentPublicSrvc/abandonmentPublic?pageNo=1&numOfRows=30000&ServiceKey=" + API_SERVICE_KEY;
}
