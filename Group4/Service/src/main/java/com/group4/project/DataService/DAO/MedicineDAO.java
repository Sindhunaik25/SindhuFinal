package com.group4.project.DataService.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group4.project.DataService.Model.MedicineProduct;
import com.group4.project.DataService.Repository.MedicineRepository;

@Service
public class MedicineDAO {

	@Autowired
	MedicineRepository medicineRepository;

	public void create(MedicineProduct medicineProduct) {
		medicineRepository.save(medicineProduct);
	}

	public void remove(MedicineProduct medicineProduct) {
		medicineRepository.delete(medicineProduct);
	}

	public void removebyId(String id) {
		medicineRepository.deleteById(id);
	}

	public boolean isPresent(String id) {
		return medicineRepository.existsById(id);
	}

	public long total() {
		return medicineRepository.count();
	}

	public Optional<MedicineProduct> searchById(String id) {
		return medicineRepository.findById(id);

	}

	public Iterable<MedicineProduct> searchAllbyId(ArrayList<String> ids) {
		return medicineRepository.findAllById(ids);
	}

	public List<MedicineProduct> searchAll() {
		List<MedicineProduct> medicineProducts = medicineRepository.findAll();
		return medicineProducts;

	}

	public void removeAll() {
		medicineRepository.deleteAll();
	}

	public void creatAll(ArrayList<MedicineProduct> medicineProducts) {
		medicineRepository.saveAll(medicineProducts);
	}

	public MedicineProduct getByName(String productName) {
		List<MedicineProduct> medicines = medicineRepository.findAll();
		for (MedicineProduct med : medicines) {
			if (productName.equals(med.getProductName())) {
				System.out.println("hello");
				return med;
			}
		}

		return null;

	}

	public MedicineProduct getByPrice(Double price) {
		List<MedicineProduct> medicinesprice = medicineRepository.findAll();
		for (MedicineProduct med : medicinesprice) {
			if (price.equals(med.getPrice())) {
				return med;
			}
		}

		return null;
	}

}
