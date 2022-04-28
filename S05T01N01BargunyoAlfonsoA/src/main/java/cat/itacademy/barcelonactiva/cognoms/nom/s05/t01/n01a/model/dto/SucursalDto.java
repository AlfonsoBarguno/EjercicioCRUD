package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01a.model.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SucursalDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long pk_SucursalId;
	private String nomSucursal;
	private String paisSucursal;
	private String tipusSucursal;

	public Long getId() {
		return pk_SucursalId;
	}

	public void setId(Long id) {
		this.pk_SucursalId = id;
	}

	public String getNomSucursal() {
		return nomSucursal;
	}

	public void setNomSucursal(String nomSucursal) {
		this.nomSucursal = nomSucursal;
	}

	public String getPaisSucursal() {
		return paisSucursal;
	}

	public void setPaisSucursal(String paisSucursal) {
		this.paisSucursal = paisSucursal;
	}

	public String getTipusSucursal() {
		return tipusSucursal;
	}

	public void setTipusSucursal(String paisSucursal) {

		List<String> lista = new ArrayList<String>(Arrays.asList("Alemania", "Bélgica", "Croacia", "Dinamarca",
				"España", "Francia", "Irlanda", "Letonia", "Luxemburgo", "Países Bajos", "Suecia", "Bulgaria",
				"Eslovaquia", "Estonia", "Grecia", "Malta", "Polonia", "República Checa", "Austria", "Chipre",
				"Eslovenia", "Finlandia", "Hungría", "Italia", "Lituania", "Portugal", "Rumanía"));

		boolean existe = lista.contains(paisSucursal);
		if (existe) {
			System.out.println("Es europeo.");
		} else {
			System.out.println("No es europeo.");
		}

	}
}
