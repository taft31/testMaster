package com.iotek.service;

import com.iotek.model.vo.DataGrid;
import com.iotek.model.vo.Equip;

public interface EquipServiceI {

	public void save(Equip equip);

	public void update(Equip equip);

	public void delete(String ids);

	public DataGrid datagrid(Equip equip);
	
	public void exportToExcelFile();

}
