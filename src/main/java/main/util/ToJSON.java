package main.util;

import javax.enterprise.inject.Default;

import com.google.gson.Gson;

@Default
public class ToJSON {

	public ToJSON() {
		
	}
	
	private Gson gson = new Gson();
	
	public String convertToJSON(Object obj) {
		return this.gson.toJson(obj);
	}
	
	public <T> T convertFromJSON(String json, Class<T> clazz) {
		return this.gson.fromJson(json, clazz);
	}
}
