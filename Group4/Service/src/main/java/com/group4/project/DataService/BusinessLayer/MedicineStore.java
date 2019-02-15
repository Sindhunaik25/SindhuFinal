package com.group4.project.DataService.BusinessLayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group4.project.DataService.DAO.MedicineDAO;
import com.group4.project.DataService.Model.MedicineProduct;

@RestController
@RequestMapping("medicinestore")
public class MedicineStore {

	@Autowired
	MedicineDAO medicinedao;

	@RequestMapping("viewallproducts")
	public List<MedicineProduct> viewAllMedicine() {

		return medicinedao.searchAll();

	}

	@RequestMapping("viewproductsbyid/{id}")
	public Optional<MedicineProduct> getProd(@PathVariable String id) {
		return medicinedao.searchById(id);
	}

	@RequestMapping("viewproduct/{productName}")
	public MedicineProduct viewProdByName(@PathVariable String productName) {
		return medicinedao.getByName(productName);
	}

	@RequestMapping("view/{price}")
	public MedicineProduct viewProdByPrice(@PathVariable Double price) {
		return medicinedao.getByPrice(price);
	}

}
