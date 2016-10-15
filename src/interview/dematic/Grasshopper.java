/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.dematic;

import java.util.Vector;

/**
 *
 * @author huico
 */
public class Grasshopper {

    /**
     * Initialization of view field with n leaves and grasshopper on leaf
     * 'position'.
     *
     * @param n Number of leaves in row.
     * @param position
     */
    public Grasshopper(int n, int position) {
        initLeafStatus(n);
        this.currentPosition = position - 1;
    }

    /* Init leafStatus: true means eatable false means eaten*/
    private void initLeafStatus(int n) {
        for (int i = 0; i < n; i++) {
            leafStatus.add(i + 1);
        }
    }

    /**
     * Grasshopper has eaten the current leaf and hopped left.
     */
    public void eatAndHopLeft() {
        leafStatus.remove(currentPosition);
        if (currentPosition - 2 < 0) {
            currentPosition = leafStatus.size() - currentPosition + 2;
        } else {
            currentPosition = currentPosition - 2;
        }
    }

    /**
     * Grasshopper has eaten the current leaf and hopped right.
     */
    public void eatAndHopRight() {
        leafStatus.remove(currentPosition);

        currentPosition = (currentPosition + 1) % leafStatus.size();
    }

    /**
     * Return the leaf number that grasshopper is feeding on right now.
     *
     * @return Leaf number that grasshopper is feeding on right now.
     */
    public int whereAmI() {
        return leafStatus.get(currentPosition);
    }

    private Vector<Integer> leafStatus = new Vector();
    private int currentPosition;

    public static void main(String[] args) {
        Grasshopper g = new Grasshopper(5, 2);
        System.out.println(g.whereAmI());

        g.eatAndHopRight();
        System.out.println(g.whereAmI());

        g.eatAndHopLeft();
        System.out.println(g.whereAmI());
    }
}
