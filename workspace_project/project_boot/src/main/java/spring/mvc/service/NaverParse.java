package spring.mvc.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class NaverParse {

//	protected String parse(String url ) throws IOException {
//		String clientId= "HWE9yKKnGgl7f6NS1p0Q";
//		String clientSecret = "_TxS6gq9Tt";
//		String xml ="";
//		URL url1 = new URL(url);
//		HttpURLConnection con = (HttpURLConnection) url1.openConnection();
//		con.setRequestMethod("GET");
//		con.setRequestProperty("X-Naver-Client-Id", clientId);
//		con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
//		
//		int responseCode = con.getResponseCode();
//        BufferedReader br;
//        if (responseCode == 200) { 
//            br = new BufferedReader(new InputStreamReader(con.getInputStream()));
//        } else { 
//            br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
//        }
//        String line;
//
//        while ((line = br.readLine()) != null) {
//            xml += line + "\n";
//        }
//        br.close();
//        con.disconnect();
//
//		return xml2json(xml);
//		
//	}
//	
//	public static String xml2json(String xml) {
//		int PRETTY_PRINT = 4;
//		String json ="";
//		JSONObject xmlJSONObj = null;
//		
//		try {
//			xmlJSONObj = XML.toJSONObject(xml);
//			json = xmlJSONObj.toString(PRETTY_PRINT);
//		}catch (JSONException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(json);
//		return json;
//	}
	

}
