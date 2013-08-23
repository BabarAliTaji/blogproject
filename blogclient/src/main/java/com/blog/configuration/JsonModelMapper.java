package com.blog.configuration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.blog.inf.IJsonModelMapper;
import com.google.gson.Gson;

public class JsonModelMapper implements IJsonModelMapper {

	private Object json;

	private String path;

	public Object getJson() {
		return json;
	}

	public void setJson(Object json) {
		this.json = json;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	
	public Object getJsonFromFile(Class type) throws IOException {

		Gson gson = new Gson();

		Object jsonObject = null;

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream(getPath())));

		try {

			StringBuilder stringBuilder = new StringBuilder();

			String line = bufferedReader.readLine();

			while (line != null) {

				stringBuilder.append(line);

				stringBuilder.append('\n');

				line = bufferedReader.readLine();
			}

			jsonObject = gson.fromJson(stringBuilder.toString(), type);

		} finally {

			bufferedReader.close();

		}

		return jsonObject;
	}

}
