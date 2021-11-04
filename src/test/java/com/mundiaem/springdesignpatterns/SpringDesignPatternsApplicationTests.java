package com.mundiaem.springdesignpatterns;

import com.mundiaem.springdesignpatterns.prototype.ProtoFalse;
import com.mundiaem.springdesignpatterns.prototype.ProtoTrue;
import com.mundiaem.springdesignpatterns.singleton.SingA;
import com.mundiaem.springdesignpatterns.singleton.SingB;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration()
@WebAppConfiguration
class SpringDesignPatternsApplicationTests {
    @Autowired
    SingB singB1;
    @Autowired
    SingB singB2;
    /*putting in behaviour that is thread safe*/
    @Autowired
    ProtoTrue true1;
    @Autowired
    ProtoTrue true2;

    @Autowired
    ProtoFalse false1;
    @Autowired
    ProtoFalse false2;

    @Test
    public void testPrototypes() {
        Assertions.assertSame(false1, false2);
        Assertions.assertNotSame(true1, true2);
    }

    @Test
    void contextLoads() {
    }

    @Test
    public void testSingletons() {
        SingA singA1 = SingA.getInstance();
        SingA singA2 = SingA.getInstance();
        Assert.assertNotNull(singA1);
        Assert.assertSame(singA1, singA2);
        Assert.assertNotNull(singB1);
        Assert.assertSame(singB1, singB2);
        System.out.println("********* Finished Running Tests **********");
    }


}
