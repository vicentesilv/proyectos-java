//clase para interactuar con la api
package edu.mx.cbtis051.sistema.slva.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.apache.wink.client.ClientConfig;
import org.apache.wink.client.ClientResponse;
import org.apache.wink.client.Resource;
import org.apache.wink.client.RestClient;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import edu.mx.cbtis051.sistema.slva.models.Producto;
import edu.mx.cbtis051.sistema.slva.probiders.ProductoDeleteProvider;
import edu.mx.cbtis051.sistema.slva.probiders.ProductoListProvider;
import edu.mx.cbtis051.sistema.slva.probiders.ProductoProvider;

public class Api {
	// link del servicio base de datos
	private static final String Base_url = "http://test.cbtis051.edu.mx:3051/";
	private static final String PRODUCTOS = "productos";

	// octener el url completo de un endpoind
	private static String getEndpoindUrl(String resource) {
		return Base_url + resource;
	}

	private static Resource getResourse(Class<?> provider, String uri) {
		// creamos una aplicacion cliente del wink
		Application clientApp = new Application() {
			@Override
			public Set<Class<?>> getClasses() {
				Set<Class<?>> classes = new HashSet<>();
				classes.add(provider);// le indicamos a la app que soporte el provider recibido
				return classes;

			}
		};

		// configuramos la aplicacion cliente
		ClientConfig config = new ClientConfig();
		config.connectTimeout(3000);
		config.readTimeout(30000);
		config.applications(clientApp);
		// creamos un cliente rest
		RestClient restclient = new RestClient(config);
		// regresamos el recurse
		return restclient.resource(uri);
	}

	public static Producto[] getProductos() {
		// creamos un resource del servicio rest
		Resource resource = getResourse(ProductoListProvider.class, getEndpoindUrl(PRODUCTOS));

		// se hace el recuest para octener la respuesta
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get();
		// se extrae el contenido de la respuesta
		return response.getEntity(Producto[].class);
	}// fin getProductos

	// octiene la infomacion de un producto
	public static Producto getProducto(long id) {
		// creamos un resource del servicio rest
		Resource resource = getResourse(ProductoProvider.class, getEndpoindUrl(PRODUCTOS + "/" + id));
		// se hace el recuest para octener la respuesta
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get();
		// se extrae el contenido de la respuesta
		return response.getEntity(Producto.class);

	}

	// elimina un producto
	public static boolean deleteproducto(long id) {
		// creamos un resource del servicio rest
		Resource resource = getResourse(ProductoDeleteProvider.class, getEndpoindUrl(PRODUCTOS + "/" + id));

		// se hace el recuest para octener la respuesta
		ClientResponse response = resource.accept(MediaType.TEXT_HTML).delete();
		// se extrae el contenido de la respuesta
		Integer eliminado = response.getEntity(Integer.class);
		if (eliminado > 0) {
			return true;
		}
		return false;
	}

	// agregar un producto
	public static Producto addProducto(String nombre, String descripcion, String modelo, String marca, String imagen) {
		// creamos un resource del servicio rest
		Resource resource = getResourse(ProductoProvider.class, getEndpoindUrl(PRODUCTOS));
		// construimos el request para crear un producto
		JsonObject jsonProd = new JsonObject();
		jsonProd.addProperty("nombre", nombre);
		jsonProd.addProperty("modelo", modelo);
		jsonProd.addProperty("marca", marca);
		jsonProd.addProperty("imagen", imagen);

		ClientResponse response = (ClientResponse) resource.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON).post(jsonProd.toString());

		return response.getEntity(Producto.class);
	}

	// actualiza la informacion de un producto
	public static Producto updateproducto(Producto producto) {
		// objeto de respuesta del metodo
		Producto productoActualizado = null;

		// construimos el request para crear un producto
		JsonObject jsonProd = new Gson().toJsonTree(producto).getAsJsonObject();
		// eliminamos la propiedad id
		jsonProd.remove("id");
		// creamos un cliente para la peticion
		HttpClient client = HttpClient.newHttpClient();

		// creamos el objeto request
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(getEndpoindUrl(PRODUCTOS + "/" + producto.getId())))
				.method("PATCH", BodyPublishers.ofString(jsonProd.toString()))
				.header("Content-Type", "application/json").build();
		
		//objeto de respuesta
		HttpResponse<String> response;
		//request
		try {
			response = client.send(request, HttpResponse.BodyHandlers.ofString());
			productoActualizado = new Gson().fromJson(response.body(), Producto.class);
		} catch (IOException e) {
			System.out.println("Error de tipo IOExeption al actualizar el producto: ");
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("Error de tipo InterruptedException al actualizar el producto: ");
			e.printStackTrace();
		}

		return productoActualizado;

	}
}
