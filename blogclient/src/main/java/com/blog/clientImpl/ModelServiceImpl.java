package com.blog.clientImpl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.blog.clientinterface.IJsonModelMapper;
import com.blog.clientinterface.IModelService;
import com.blog.clientinterface.IModels;

public class ModelServiceImpl implements IModelService {

	
	private IJsonModelMapper jsonModelMapper;
	
	@Autowired
	public void setJsonModelMapper(IJsonModelMapper jsonModelMapper) {
		this.jsonModelMapper = jsonModelMapper;
	}

	private IModels models;

	
	public IModels getModels() {
		return models;
	}

	public void setModels(IModels models) {
		this.models = models;
	}
	
	@Override
	public <T> void startModel(Class<T> param) throws IOException {
	
		setModels((IModels)jsonModelMapper.getJsonFromFile((Class<?>)param));

	}

}
