package modelo;

import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Carrito {
	private int idCarrito;
	private LocalDate fecha;
	private LocalTime hora;
	private List<ItemCarrito> lstItem = new ArrayList<ItemCarrito>();

	public Carrito() {
		super();
	}

	public int getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public List<ItemCarrito> getLstItem() {
		return lstItem;
	}

	public void setLstItem(List<ItemCarrito> lstItem) {
		this.lstItem = lstItem;
	}

	@Override
	public String toString() {
		return "Carrito [idCarrito=" + idCarrito + ", fecha=" + fecha + ", hora=" + hora + ", lstItem=" + lstItem + "]";
	}

	public boolean equals(Carrito carrito) {
		return this.idCarrito == carrito.getIdCarrito();
	}

	public ItemCarrito traerItemCarrito(Producto producto) {
		ItemCarrito objeto = null;
		int i = 0;
		while (i < this.lstItem.size() && objeto == null) {
			if (this.lstItem.get(i).getProducto().equals(producto)) {
				objeto = this.lstItem.get(i);
			}
			i++;
		}
		return objeto;
	}
	public boolean agregarItem(Producto producto, int cantidad)throws Exception{
		ItemCarrito objeto=this.traerItemCarrito(producto);
		if(objeto!=null){
			objeto.setCantidad(objeto.getCantidad()+cantidad);
		}
		objeto=new ItemCarrito(this.traerUltimoIdItemCarrito()+1, producto, cantidad);
		return this.lstItem.add(objeto);
	}
	
	public int traerUltimoIdItemCarrito(){
		int ultimo=0;
		if(!this.lstItem.isEmpty()){
			ultimo=this.lstItem.get(lstItem.size()-1).getIdItem();
		}
		return ultimo;
	}
	//+ eliminarItem (Producto producto, int cantidad) : boolean
	//En el caso de eliminar un producto del carrito si la cantidad es la misma se eliminará el item, si es
	//menor se decrecerá la cantidad y de lo contrario, si no existe el ítem que contenga el producto lanzará
	//una excepción.
	public boolean eliminarItem(Producto producto, int cantidad)throws Exception{
		ItemCarrito objeto=this.traerItemCarrito(producto);
		boolean eliminado=false;
		if(objeto==null){
			throw new Exception("El producto "+producto.getProducto()+" no existe");
		}
		if(objeto.getCantidad()==cantidad){
			this.lstItem.remove(objeto);
			eliminado=true;
		}else if(objeto.getCantidad()>cantidad){
			objeto.setCantidad(objeto.getCantidad()-cantidad);
		}
		return eliminado;//revisar si funciona
	}
}
