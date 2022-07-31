package com.supermm.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // toString, getter, setter 메서드를 자동 생성해줌 :> lombok
@NoArgsConstructor // 기본생성자 생성
@Builder // 모든 요소가 포함된 생성자 생성
@AllArgsConstructor // NoArgs...와 Builder같이 쓰면 인자생성자->기본생성자로 바뀌면서 에러
public class CategoryVO {

	private int cateNum;
	private String cateCode;
	private String cateName;

	
	// PAGE
	private int pageNum;
	private int amount; 


	//////// search ///////////
	private String searchType; 
	private String keyWord;
	public CategoryVO(int pageNum, int amount) {
		pageNum = 1;
		amount =5;
		
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	
}