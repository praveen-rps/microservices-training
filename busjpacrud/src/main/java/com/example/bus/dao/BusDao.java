package com.example.bus.dao;

import java.util.List;

import com.example.bus.entity.Bus;

public interface BusDao {
	public void save(Bus bus);
	public Bus find(Long id);
	public List<Bus> findAll();
	public void update(Long id, Bus newBus);
	public void delete(Long id);
}
