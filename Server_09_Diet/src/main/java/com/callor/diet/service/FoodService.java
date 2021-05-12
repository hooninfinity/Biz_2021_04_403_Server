package com.callor.diet.service;

import java.util.List;

import com.callor.diet.model.FoodDTO;
import com.callor.diet.model.FoodVO;

public interface FoodService {
	
	// CRUD를 구현할 method 정의(설계)
	// 데이터 조회(read)
	public List<FoodDTO> selectAll();	// 전체 조회, 결과가 몇개던지 무조건 List 타입임
	// primary key를 기준으로 조회하는 method
	// 한개의 데이터만 조회하기 때문에
	public FoodDTO findById(String fd_code);		// 코드로 조회
	
	public List<FoodDTO> findByFName(String fd_name);	// 이름으로 조회
	
	// 데이터 변환(추가, 수정, 삭제)
	public Integer insert(FoodVO foodVO);
	public Integer update(FoodVO foodVO);
	public Integer delete(String fd_code);

}
