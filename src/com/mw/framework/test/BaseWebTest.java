package com.mw.framework.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
// defaultRollback 默认回滚事物(默认为false)
// @TransactionConfiguration(transactionManager = "transactionManager")
// @Transactional
@WebAppConfiguration
public class BaseWebTest {

}
