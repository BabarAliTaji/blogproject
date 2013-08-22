package com.blog.inf;

import java.io.IOException;

public interface IJsonModelMapper {

	Object getJsonFromFile(Class type) throws IOException ;
	
}
