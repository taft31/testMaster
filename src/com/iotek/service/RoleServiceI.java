package com.iotek.service;

import java.util.List;

import com.iotek.model.vo.DataGrid;
import com.iotek.model.vo.Role;

public interface RoleServiceI {

	public void add(Role role);

	public void edit(Role role);

	public void delete(String ids);
	
	public DataGrid datagrid(Role role);
	
	public List<Role> combobox();

}
