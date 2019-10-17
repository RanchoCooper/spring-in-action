package ch02.soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author rancho
 * @date 2019/10/15
 */
@Component("unique CD")
public class SgtCompactDist implements ICompactDisc {

    @Override
    public void play() {
        System.out.println(this.getClass().getName());
    }
}
