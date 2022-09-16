package modelo;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private List<Producto> gondola = new ArrayList<Producto>();

	public Supermercado() {
		super();
	}

	public List<Producto> getGondola() {
		return gondola;
	}

	public void setGondola(List<Producto> gondola) {
		this.gondola = gondola;
	}

	@Override
	public String toString() {
		return "Supermercado [gondola=" + gondola + "]";
	}

	public boolean equals(Supermercado supermercado) {
		return this.gondola.equals(supermercado);
	}

	public Producto traerProducto(int idProducto) {
		Producto objeto = null;
		int i = 0;
		while (i < this.gondola.size() && objeto == null) {
			if (this.gondola.get(i).getIdProducto() == idProducto) {
				objeto = gondola.get(i);
			}
			i++;
		}
		return objeto;
	}

	public Producto traerProducto(String producto) {
		Producto objeto = null;
		int i = 0;
		while (i < gondola.size() && objeto == null) {
			if (this.gondola.get(i).getProducto().equalsIgnoreCase(producto)) {
				objeto = gondola.get(i);
			}
			i++;
		}
		return objeto;
	}
	
	//1) + agregarProducto(String producto, float precio) : boolean
	//Si el producto existe en la lista lanzar la excepción
	public boolean agregarProducto(String producto,float precio)throws Exception{
		Producto objeto=this.traerProducto(producto);
		if(objeto!=null){
			throw new Exception("El producto "+producto+" ya existe");
		}
		objeto=new Producto(traerUltimoIdProducto()+1, producto, precio);
		return this.gondola.add(objeto);
	}
	//+ modificarProducto(int idProducto, String producto, double precio) : boolean
	//Modificar el producto: traer producto por id, si no existe el objeto levantar la excepción, de lo contrario volver setear producto y precio.
	
	public boolean modificarProducto(int idProducto,String producto, double precio)throws Exception{
		Producto objeto=this.traerProducto(idProducto);
		if(objeto==null){
			throw new Exception("El producto con Id: "+idProducto+" no exite");
		}
		objeto.setProducto(producto);
		
		objeto.setPrecio((float)precio);
		return true;
	}
	//eliminarProducto(int idProducto) : boolean
	//Eliminar producto: traer producto por id, si no existe el objeto o existe en algún carrito levantar la
	//excepción, de lo contrario eliminar el objeto (remove).
	public boolean eliminarProducto(int idProducto)throws Exception{
		Producto objeto=this.traerProducto(idProducto);
		if(objeto==null){
			throw new Exception("El producto con id : "+idProducto+" no existe");
		}
		return this.gondola.remove(objeto);
	}
	public int traerUltimoIdProducto(){
		int ultimo=0;
		if(!this.gondola.isEmpty()){
			ultimo=this.gondola.get(this.gondola.size()-1).getIdProducto();
		}
		return ultimo;
	}
}
