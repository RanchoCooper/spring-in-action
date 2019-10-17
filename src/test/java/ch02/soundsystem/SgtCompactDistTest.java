package ch02.soundsystem;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author rancho
 * @date 2019/10/15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PlayerConfig.class)
public class SgtCompactDistTest {

    @Autowired
    private SgtCompactDist sgtCompactDist;

    @Test
    public void setSgtCompactDistNotNull() {
        Assert.assertNotNull(sgtCompactDist);
        sgtCompactDist.play();
    }

}