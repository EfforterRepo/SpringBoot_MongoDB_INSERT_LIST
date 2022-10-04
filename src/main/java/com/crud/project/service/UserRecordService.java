package com.crud.project.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.project.entity.TestCollections;
import com.crud.project.repo.TestCollectionsRepo;


@Service
public class UserRecordService {

	
	@Autowired
	TestCollectionsRepo testCollectionsRepo;

// findAll()	
	public List<TestCollections> doSelectAll(){
		return testCollectionsRepo.findAll();
	}
	
//	findById()
//	public TestCollections doSelectOne(int memberID){
//		return testCollectionsRepo.findById(memberID).get();
//	}
	
//	save()
	public void doInsert(TestCollections testCollections) {
		
		testCollectionsRepo.save(testCollections);
	}
	
//	save()
	public void doUpdate(TestCollections testCollections) {
		testCollectionsRepo.save(testCollections);
	}
	
//	delete()
//	public void doDelete(int key_id) {
//		testCollectionsRepo.deleteById(key_id);
//	}
//	
//// exsitsBy ~ ()
//	@Transactional
//	public boolean existsByMemberId(String loginID){
//	    return testCollectionsRepo.existsByloginID(loginID);
//	}
}
