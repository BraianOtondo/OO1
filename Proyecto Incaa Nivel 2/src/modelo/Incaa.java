package modelo;

import java.util.ArrayList;
import java.util.List;

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
		Pelicula pelicula = null;
		int i = 0;
		while (i < catalogo.size() && pelicula == null) {
			if (catalogo.get(i).getIdPelicula() == idPelicula) {
				pelicula = catalogo.get(i);
			}
			i++;
		}
		return pelicula;
	}

	public Pelicula traerPelicula(String partePelicula) {
		Pelicula pelicula = null;
		int i = 0;
		while (i < this.catalogo.size() && pelicula == null) {
			if (catalogo.get(i).getPelicula().equals(partePelicula)) {
				pelicula = catalogo.get(i);
			}
			i++;
		}
		return pelicula;
	}

	public Pelicula traerPelicula(Genero genero) {
		Pelicula pelicula = null;
		int i = 0;
		while (i < this.catalogo.size() && pelicula == null) {
			if (this.catalogo.get(i).getGenero().equals(genero.getGenero())) {
				pelicula = catalogo.get(i);
			}
			i++;
		}
		return pelicula;
	}
	//agregarPelicula (String pelicula) : boolean
	//Si la película existe en la lista lanzar la excepción
	
	public boolean agregarPelicula(String pelicula,Genero genero)throws Exception{
		if(this.traerPelicula(pelicula)!=null){
			throw new Exception("La pelicula "+pelicula+" ya existe");
		}
		Pelicula objeto=new Pelicula(UltimoId()+1, pelicula, genero);
		return this.catalogo.add(objeto);
	}
	
	public int UltimoId(){
		int ultimo=0;
		if(!this.catalogo.isEmpty()){
			ultimo=catalogo.get(catalogo.size()-1).getIdPelicula();
		}
	return ultimo;
	}
	public boolean modificarPelicula (int idPelicula, String pelicula)throws Exception{
		Pelicula objeto=this.traerPelicula(idPelicula);
		if(objeto==null){
			throw new Exception("La pelicula con id: "+idPelicula+" no existe");
		}
		objeto.setPelicula(pelicula);
		return true;
	}

	public boolean eliminarPelicula(int idPelicula)throws Exception{
		Pelicula objeto=this.traerPelicula(idPelicula);
		if(objeto==null){
			throw new Exception("La pelicula no existe");
		}
		return catalogo.remove(objeto);
	}
	public void imprimirPeliculaPorGenero(Genero genero){
		int i=0;
		while(i<this.catalogo.size()){
			if(this.getCatalogo().get(i).getGenero().equals(genero)){
				System.out.println(this.catalogo.get(i).toString());
			}
			i++;
		}
	}
}