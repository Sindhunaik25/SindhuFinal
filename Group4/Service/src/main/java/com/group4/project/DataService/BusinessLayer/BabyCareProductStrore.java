package com.group4.project.DataService.BusinessLayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group4.project.DataService.DAO.BabyCareDAO;
import com.group4.project.DataService.Model.BabyCareProduct;
import com.group4.project.DataService.Model.MedicineProduct;

@RestController
@RequestMapping("babycareproductstore")
public class BabyCareProductStrore {

	@Autowired
	BabyCareDAO babyCareDAO;
	
	@RequestMapping("viewallproducts")
	public List<BabyCareProduct> viewAllMedicine() {

		return babyCareDAO.searchAll();

	}

	@RequestMapping("getproductsbyid/{id}")
	public Optional<BabyCareProduct> getProd(@PathVariable String id) {
		return babyCareDAO.searchById(id);
	}

	@RequestMapping("viewproductsbyname/{productName}")
	public BabyCareProduct viewProdByName(@PathVariable String productName) {
		return babyCareDAO.getByName(productName);
	}

	@RequestMapping("viewproducts/{price}")
	public BabyCareProduct viewProdByPrice(@PathVariable Double price) {
		return babyCareDAO.getByPrice(price);
	}
}
