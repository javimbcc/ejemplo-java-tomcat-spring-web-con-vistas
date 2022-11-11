
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Controller
public class gestionAlmacen {
	@Autowired
	repoProducto1 repo1;
	@Autowired
	repoProducto2 repo2;

	public void insertarProducto1(producto1 producto1) {
		repo1.insertar(producto1);
	}

	public void insertarProducto2(producto2 producto2) {
		repo2.insertar(producto2);
	}
	
	@Autowired GestionAlmacen gestorTorre;

	@RequestMapping("/listaproductos1")
	public List<producto1> listarTodosProductos1() {
		return repo1.listarTodos();
	}modelo.addAttribute("listaproductos1",gestorTorre.listarTodosProductos1());return"listaproductos1";

	}

	public List<producto2> listarTodosProductos2() {
		return repo2.listarTodos();
	}

}
