package com.example.daocloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DaocloudApplicationTests {

	@Autowired
	MySvc mySvc;  //对服务进行测试，只要测试mySvc

	@Test
	public void addTest() {
		int res = mySvc.add(772,119);
		assert  res == 891;
	}

	@Test
	public void addTest2() {
		int res = mySvc.add(556,119);
		assert  res == 675;
	}

}
