package com.wk;

import com.wk.rbac.MainStarter;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: wk
 * @Date: 2021/2/2 17:35
 * @Description
 */
@SpringBootTest(classes = {MainStarter.class})
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class BaseTest {
}
