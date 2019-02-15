package com.group4.project.DataService.admin;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group4.project.DataService.DAO.MedicineDAO;
import com.group4.project.DataService.Model.MedicineProduct;

@RestController
public class AdminMedicine {

	@Autowired
	MedicineDAO medicinedao;

	@RequestMapping(method = RequestMethod.DELETE, value="adminmedicine/delete/{id}")
	public void deleteProductsById(@PathVariable String id) {
		medicinedao.removebyId(id);
	}

	@RequestMapping(method = RequestMethod.POST,value="adminmedicine/add")
	public void addProducts(@RequestBody MedicineProduct medicineProduct) {
		medicinedao.create(medicineProduct);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="adminmedicine/addall")
	public void addAllProducts(@RequestBody ArrayList<MedicineProduct> medicineProducts) {
		medicinedao.creatAll(medicineProducts);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="adminmedicine/deleteall")
	public void deleteAllProducts() {
		medicinedao.removeAll();
	}

}
