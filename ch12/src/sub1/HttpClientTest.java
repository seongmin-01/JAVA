package sub1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/*
 * 날짜:2025/01/22
 * 이름:김성민
 * 내용:Java http 통신 실습하기
 */
public class HttpClientTest {
	public static void main(String[] args) {
		
		//HttpClinet 맴버 변수를 private으로 정의해놔서 외부에서 쓸수 있도록 newHttpClinet()메서드를 사용한 것임.
		HttpClient httpClient = HttpClient.newHttpClient();
		
		//함수형 프로그래밍 방식
		HttpRequest request = HttpRequest
				.newBuilder() //빌더 패턴 -> 복잡한 객체 생성시 객체 구성요소를 단계적으로 설정(디자인 패턴임)
				.uri(URI.create("https://google.com")) //uri주소를 설정
				.GET()     //get방식으로 설정
				.build();  //위의 설정한 정보를 저장한? request객체를 생성함
		
	 	try {
			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			//send -> http요청을 동기방식으로 전송하고 응답을 처리
			
			
			System.out.println("상태코드: " + response.statusCode());
			System.out.println("응답내용: " + response.body());
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	 	System.out.println("HTTP 통신 끝...");
	}
}
