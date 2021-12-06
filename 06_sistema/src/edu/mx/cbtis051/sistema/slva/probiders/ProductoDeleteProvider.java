//provider para eliminar un producto
package edu.mx.cbtis051.sistema.slva.probiders;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import org.apache.wink.common.utils.ProviderUtils;
@Provider

public class ProductoDeleteProvider implements MessageBodyReader<Integer> {

	@Override
	public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotation, MediaType mediaType) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Integer readFrom(Class<Integer> type, Type genericType, Annotation[] annotation, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream) throws IOException, WebApplicationException {
		// leer respuesta del servicio
		String response = ProviderUtils.readFromStreamAsString(entityStream, mediaType);
		//convertimo el gson de la respuesta a un integer 
		
		
		return Integer.decode(response);
		
	}

}
