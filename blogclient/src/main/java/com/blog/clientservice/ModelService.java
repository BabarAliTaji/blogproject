package com.blog.clientservice;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blog.clientinterface.IJsonModelMapper;
import com.blog.clientinterface.IModel;
import com.blog.clientinterface.IModelService;
import com.blog.clientinterface.IModels;

@Service
public class ModelService implements IModelService {

	private IJsonModelMapper jsonModelMapper;

	@Autowired
	public void setJsonModelMapper(IJsonModelMapper jsonModelMapper) {
		this.jsonModelMapper = jsonModelMapper;
	}

	private IModels models;

	private IModel model;

	public IModels getModels() {
		return models;
	}

	private void setModels(IModels models) {
		this.models = models;
	}

	public IModel getModel() {
		return model;
	}

	public void setModel(IModel model) {
		this.model = model;
	}

	@Override
	public <T> void startModel(Class<T> param) throws IOException {

		setModels((IModels) jsonModelMapper.getJsonFromFile((Class<?>) param));

	}

}
