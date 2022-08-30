package com.kruger.inventario.dao;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.kruger.inventario.model.Vacunacion;

@Repository
public class VacunacionDaoImpl implements VacunacionDAO {

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<Vacunacion> consultarXstatVacuXTipVacuXdateVacu(Boolean estadoVacunacion, String tipoVacuna,
			Date fechaInicio, Date fechaFin) {

		String sql = "select v.id_vacunacion,v.cedula_empleado,v.fecha_vacunacion,v.nro_dosis_vacunacion,v.id_empleado,v.id_tipo_vacuna\r\n"
				+ "from vacunacion v\r\n";
		if (estadoVacunacion != null) {
			sql = sql + "inner join empleado e on e.cedula = v.cedula_empleado\r\n";
		}
		if (tipoVacuna != null) {
			sql = sql + "inner join tipo_vacuna tv on tv.id_tipo_vacuna = v.id_tipo_vacuna \r\n";
		}
		sql = sql + " where \r\n";

		
		if (estadoVacunacion != null) {
			sql = sql + "e.estado_vacunacion is :estado and \r\n";
			em.setProperty("estado", estadoVacunacion);
		}
		if (tipoVacuna != null) {
			sql = sql + "tv.nombre_tipo_vacuna = :tipo and \r\n";
			em.setProperty("tipo", tipoVacuna);
		}
		if (fechaInicio != null && fechaFin != null) {
			sql = sql + "v.fecha_vacunacion >= :fechaIni and v.fecha_vacunacion <= :fechaFin";
			em.setProperty("fechaIni", fechaInicio);
			em.setProperty("fechaFin", fechaFin);
		}
		
		return (List<Vacunacion>) em.createNativeQuery(sql, Vacunacion.class).getResultList();
	}

	@Override
	public List<Vacunacion> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vacunacion> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vacunacion> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Vacunacion> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Vacunacion> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Vacunacion> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Vacunacion> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vacunacion getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vacunacion getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vacunacion getReferenceById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Vacunacion> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Vacunacion> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Vacunacion> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Vacunacion> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Vacunacion> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Vacunacion entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Vacunacion> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Vacunacion> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Vacunacion> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Vacunacion> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Vacunacion> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Vacunacion, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
