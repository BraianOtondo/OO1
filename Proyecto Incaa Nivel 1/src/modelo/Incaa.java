package modelo;

import java.util.List;
import java.util.ArrayList;

public class Incaa {
	private List<Pelicula> catalogo = new ArrayList<Pelicula>();

	public Incaa() {
	}

	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}

	@Override
	public String toString() {
		return "Incaa [catalogo=" + catalogo + "]";
	}

	public Pelicula traerPelicula(int idPelicula) {
		int i = 0;
		Pelicula pelicula = null;
		while (i < this.catalogo.size() && pelicula == null) {
			if (this.catalogo.get(i).getIdPelicula() == idPelicula) {
				pelicula = this.catalogo.get(i);
			}
			i++;
		}
		return pelicula;
	}
	public Pelicula traerPelicula(String partePelicula){
		int i=0;
		Pelicula pelicula=null;
		while(i<this.catalogo.size() && pelicula==null){
			if(this.catalogo.get(i).getPelicula()==partePelicula){
				pelicula=this.catalogo.get(i);
			}
			i++;
		}
		return pelicula;
	}
	public boolean agregarPelicula(String pelicula)throws Exception{
		if(traerPelicula(pelicula)!=null){
			throw new Exception("La pelicula :"+pelicula+" ya existe");
		}
		Pelicula objeto=new Pelicula(traerUltimoId()+1,pelicula);
		return catalogo.add(objeto);
		
	}
	public boolean modificarPelicula (int idPelicula, String pelicula)throws Exception{
		Pelicula objeto=traerPelicula(idPelicula);
		if(objeto==null){
			throw new Exception("La pelicula no existe");
		}
		objeto.setPelicula(pelicula);
		return true;
	}
	public boolean eliminarPelicula (int idPelicula)throws Exception{
		Pelicula objeto=this.traerPelicula(idPelicula);
		if(objeto==null){
			throw new Exception("La pelicula no existe");
		}
		this.catalogo.remove(objeto);
		return true;
	}

	public int traerUltimoId(){
		int ultimo=0;
		if(!catalogo.isEmpty()){
			ultimo=catalogo.get(catalogo.size()-1).getIdPelicula();
		}
		return ultimo;
	}
}