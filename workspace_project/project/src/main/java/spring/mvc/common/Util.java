package spring.mvc.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;



/*공통으로 쓰는 클래스*/
public class Util {
	
	public static List getArray(String apiUrl) throws Exception {
		//xml api가져오기
		String result = Util.getApiData(apiUrl);
		//xml을 json으로 바꾸기
		JSONObject jsonObject = Util.xmlToJson(result);
		JSONObject responseJson = jsonObject.getJSONObject("response");
		JSONObject bodyJson =  responseJson.getJSONObject("body");
		JSONObject itemsJson =  bodyJson.getJSONObject("items");
		Object itemJson = itemsJson.get("item");
		JSONArray arr = new JSONArray();
		if(itemJson.getClass().getTypeName().contains("JSONArray")) {
			arr = (JSONArray) itemJson;
		} else {
			arr.put(itemJson);
		}
		
		return arr.toList();
	}
	
	// xml to json 형식으로 바꾸는 메서드
	public static JSONObject xmlToJson(String xmlStr) {
		JSONObject jsonObject = XML.toJSONObject(xmlStr);
		return jsonObject;
	}
	
	/*(xml)공공데이터 API 가져오는 메서드*/
	public static String getApiData(String urlStr) throws Exception {
		BufferedReader br = null;
		InputStreamReader isr = null;
		try {
	        URL url = new URL(urlStr);
	        HttpURLConnection urlconnection =  (HttpURLConnection) url.openConnection();
	        urlconnection.setRequestMethod("GET");
	        isr = new InputStreamReader(urlconnection.getInputStream());
	        br = new BufferedReader(isr);
	        String result = "";
	        String line;
        
			while((line = br.readLine()) != null) {
			    result = result + line;
			}

			return result;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			}
		}
	}
}
