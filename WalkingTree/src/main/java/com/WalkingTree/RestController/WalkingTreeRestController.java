package com.WalkingTree.RestController;

import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.WalkingTree.Entity.Employee;
import com.WalkingTree.Service.EmployeeFirebaseInitializer;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;

@RestController
public class WalkingTreeRestController {

	
	@Autowired
	EmployeeFirebaseInitializer db;
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() throws InterruptedException, ExecutionException {
		List<Employee> empList = new ArrayList<Employee>();
		CollectionReference employee= db.getFirebase().collection("Employee");
		ApiFuture<QuerySnapshot> querySnapshot= employee.get();
		for(DocumentSnapshot doc:querySnapshot.get().getDocuments()) {
			Employee emp = doc.toObject(Employee.class);
			empList.add(emp);
		}
		return empList;
	}
	
	@PostMapping("/saveEmployee")
	public int saveEmployee(@RequestBody Employee employee) {
		CollectionReference employeeCR= db.getFirebase().collection("Employee");
		employeeCR.document(String.valueOf(employee.getName())).set(employee);
		return employee.getId();
	}

}
