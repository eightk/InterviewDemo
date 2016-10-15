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
public class Egg {

    public Egg() {
    }
        
    public Egg(Callable<IBird> createBird) {
        try {
            this.setType(createBird.call());
        } catch (Exception ex) {
            //do nothing if it failed.
        }
    }

    public IBird Hatch() throws Exception {
        if(this.isIsHatched()) {
            throw new IllegalStateException("Not a chicken");
        }
        this.setIsHatched(true);
        return this.getType();
    }

    public IBird getType() {
        return type;
    }

    public void setType(IBird type) {
        this.type = type;
    }

    public boolean isIsHatched() {
        return isHatched;
    }

    public void setIsHatched(boolean isHatched) {
        this.isHatched = isHatched;
    }
    
    
    private IBird type;
    private boolean isHatched = false;

}
