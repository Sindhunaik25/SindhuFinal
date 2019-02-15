package com.group4.project.DataService.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group4.project.DataService.Model.BabyCareProduct;
import com.group4.project.DataService.Repository.BabyCareRepository;

@Service
public class BabyCareDAO {

	@Autowired
	BabyCareRepository babyCareRepository;

	public void create(BabyCareProduct babyCareProduct) {
		babyCareRepository.save(babyCareProduct);
	}

	public void remove(BabyCareProduct babyCareProduct) {
		babyCareRepository.delete(babyCareProduct);
	}

	public void removebyId(String id) {
		babyCareRepository.deleteById(id);
	}

	public boolean isPresent(String id) {
		return babyCareRepository.existsById(id);
	}

	public long total() {
		return babyCareRepository.count();
	}

	public Optional<BabyCareProduct> searchById(String id) {
		return babyCareRepository.findById(id);

	}

	public Iterable<BabyCareProduct> searchAllbyId(ArrayList<String> ids) {
		return babyCareRepository.findAllById(ids);
	}

	public List<BabyCareProduct> searchAll() {
		List<BabyCareProduct> babyCareProducts = babyCareRepository.findAll();
		return babyCareProducts;

	}

	public void removeAll() {
		babyCareRepository.deleteAll();
	}

	public void creatAll(ArrayList<BabyCareProduct> babyCareProducts) {
		babyCareRepository.saveAll(babyCareProducts);
	}

	public BabyCareProduct getByName(String productName) {
		List<BabyCareProduct> list = babyCareRepository.findAll();
		for (BabyCareProduct babyCareProduct : list) {
			if (productName.equals(babyCareProduct.getProductName())) {
				System.out.println("hello");
				return babyCareProduct;
			}
		}

		return null;

	}

	public BabyCareProduct getByPrice(Double price) {
		List<BabyCareProduct> babyCareprice = babyCareRepository.findAll();
		for (BabyCareProduct product : babyCareprice) {
			if (price.equals(product.getPrice())) {
				return product;
			}
		}

		return null;
	}
}
