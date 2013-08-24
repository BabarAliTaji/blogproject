package com.blog.clientImpl;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;

import org.springframework.beans.factory.annotation.Autowired;

import com.blog.clientinterface.IJsonModelMapper;
import com.blog.clientinterface.IModelService;
import com.blog.widgets.Widgets;

public class ModelServiceImpl<T> implements IModelService<T> {

	/**
	 * 
	 */

	private IJsonModelMapper jsonModelMapper;
	
	
	public IJsonModelMapper getJsonModelMapper() {
		return jsonModelMapper;
	}

	public void setJsonModelMapper(IJsonModelMapper jsonModelMapper) {
		this.jsonModelMapper = jsonModelMapper;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void startModel( ) throws IOException {
		
//		jsonModelMapper.getJsonFromFile((Class<T>)
//                ((ParameterizedType)getClass()
//                .getGenericSuperclass())
//                .getActualTypeArguments()[0]);
		System.out.println(jsonModelMapper);
  
	}

}
