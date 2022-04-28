package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01a.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01a.model.dto.SucursalDto;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01a.model.entity.Sucursal;


public interface ISucursalService {
	
    public List<SucursalDto> findAll();
	
	//public Page<SucursalDto> findAll(Pageable pageable);
	
	public SucursalDto findById (Long id);
	
	public Long save(SucursalDto sucursalDto);
	
	public void deleteById (Long id);
}
