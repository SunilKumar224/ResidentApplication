package eswar.adhithya.SpringBootApp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


import eswar.adhithya.model.ResidentMaster;
import eswar.adhithya.repositery.ResidentMasterDao;
import eswar.adhithya.service.ResidentMasterService;
import eswar.adhithya.service.ResidentMasterServiceImpl;

@RunWith(MockitoJUnitRunner.class)
@DisplayName("test runner")
//@RunWith(SpringRunner.class)
public class TestingResidentMaster {
	
	@InjectMocks
	private ResidentMasterServiceImpl residentMasterService; /*= new ResidentMasterServiceImpl();*/
	
	@Mock
	ResidentMasterDao residentMasterDao;
	
	public List<ResidentMaster> residentMasterList;
	
	@Mock
	public ResidentMaster residentMaster;
	
	
	/*
	 * @Before public void init() { MockitoAnnotations.initMocks(this); //
	 *  }
	 */
	 
	
	@Before
	public void addingResidentList()
	{
		
		
	  List<ResidentMaster> l= new ArrayList<ResidentMaster>();
	  l.add(new ResidentMaster(101,"sunil", "Semail", "sPhone"));
	  l.add(new ResidentMaster(102,"srinu", "SRemail", "sRPhone"));
	  l.add(new ResidentMaster(103,"raju", "SRemail", "sRPhone"));
	  l.add(new ResidentMaster(104,"laxmi", "SRemail", "sRPhone"));
		System.out.println(l);
		residentMasterList=new ArrayList(l);
			 
	}
	
	@Test
	@DisplayName("data of resident List")
	public void checkAll()
	{	
		Mockito.when(residentMasterService.findAll()).thenReturn(residentMasterList);
		System.out.println("data "+residentMasterService.findAll());
		System.out.println("data size "+residentMasterService.findAll().size());
		assertEquals(4, residentMasterList.size() );
	}
	
	@Test
	@DisplayName("test sunil")
	public void tt()
	{
		assertEquals(4, 4);
	}

}
