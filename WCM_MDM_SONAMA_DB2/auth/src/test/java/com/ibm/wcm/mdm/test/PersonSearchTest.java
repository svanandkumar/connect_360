package com.ibm.wcm.mdm.test;

import java.util.List;

import org.junit.Test;
import org.springframework.http.ResponseEntity;

import com.ibm.gbs.consentmgmt.controller.PersonSearchMDM;
import com.ibm.gbs.wcm.vo.PersonSearchVo;
import com.ibm.mdm.esoa.client.IdEntity;
import com.ibm.mdm.esoa.client.IdEntitySearchResult;

public class PersonSearchTest {

	@Test
	public void test()
	{
		PersonSearchVo personSearchVo = new PersonSearchVo();
		PersonSearchMDM personSearch = new PersonSearchMDM();
		
		
		/*personSearchVo.setFirstName("jack");
		personSearchVo.setMiddleName("abc");
		personSearchVo.setLastName("mitc");
		personSearchVo.setGender("male");*/
		
		//ResponseEntity<List<IdEntitySearchResult>> response = personSearch.searchForIdList(personSearchVo);
		
		personSearchVo.setMemIdnum("136111");
		personSearchVo.setSrcCode("CALWIN");
		
		ResponseEntity<List<IdEntitySearchResult>> response = personSearch.getIdEntityList(personSearchVo);
		
		System.out.println(response.getBody().toString());
		
	}
}
