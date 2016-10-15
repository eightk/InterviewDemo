/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.dematic;

import java.util.concurrent.Callable;

/**
 *
 * @author huico
 */
public class Chicken implements IBird {
    public Chicken() {
    }
    
    public static void main(String[] args) throws Exception {
        Chicken chicken = new Chicken();
        System.out.println(chicken instanceof IBird);
    }

    @Override
    public Egg Lay() {
        Egg egg = new Egg(new Callable<IBird>() {
            @Override
            public IBird call() throws Exception {
                return new Chicken();
            }
        });
        return egg;
    }
}
