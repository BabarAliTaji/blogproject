package com.blog.clientinterface;

import java.io.IOException;

public interface IJsonModelMapper {

	Object getJsonFromFile(Class<?> type) throws IOException ;
	
}
