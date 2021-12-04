//provider para un producto
package edu.mx.cbtis051.sistema.slva.probiders;

import javax.ws.rs.ext.MessageBodyReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
  import javax.ws.rs.ext.Provider;
import org.apache.wink.common.utils.ProviderUtils;
import com.google.gson.Gson;
import edu.mx.cbtis051.sistema.slva.models.Producto;

@Provider
public class ProductoProvider implements MessageBodyReader<Producto> {

	@Override
	public boolean isReadable(Class<?> type, Type generictype, Annotation[] annotation, MediaType mediaType) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Producto readFrom(Class<Producto> type, Type genericType, Annotation[] annotation, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws IOException, WebApplicationException {
		// leer respuesta del servicion
		String response = ProviderUtils.readFromStreamAsString(entityStream, mediaType);
		return new Gson().fromJson(response, Producto.class);// convertir el gson a un array de productos

	}

}
