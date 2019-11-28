package com.vtb.demobootvtb.dima;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Data
public class Elf {
    @InjectRandom(min=10,max=20)
    private int power;
    @InjectRandom(min=20,max=40)
    private int speed;

}
