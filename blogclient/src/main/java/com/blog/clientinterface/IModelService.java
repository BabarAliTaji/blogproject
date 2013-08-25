package com.blog.clientinterface;

import java.io.IOException;

public interface IModelService {

	<T> void startModel(Class<T> param) throws IOException;

	IModels getModels();
	
	IModel getModel();
}
