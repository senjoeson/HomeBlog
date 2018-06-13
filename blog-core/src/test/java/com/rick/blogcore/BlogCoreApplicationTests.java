package com.rick.blogcore;

import com.rick.blogcore.persistence.beans.BizArticleLook;
import com.rick.blogcore.persistence.mapper.BizArticleLookMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableTransactionManagement //如果mybatis中service实现类中加入事务注解，需要此处添加该注解
@MapperScan("com.rick.blogcore.persistence.mapper")  //扫描的是mapper.xml中namespace指向值的包位置
public class BlogCoreApplicationTests {

	@Autowired
	private BizArticleLookMapper mapper;
	@Test
	public void contextLoads() {
	List<BizArticleLook> BizArticleLooks=mapper.selectAll();
	System.out.println(BizArticleLooks);
	}

}
