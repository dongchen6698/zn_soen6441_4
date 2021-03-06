package TD.view;

import java.awt.Graphics;
import java.io.Serializable;

import TD.controller.CellContainer_Controller;

/**
 * This is GUI class of Cell Container Module.
 * @author peilin
 */
public class CellContainer_View{
    private CellContainer_Controller ccCont;
    
    /**
     * This is constructor.
     */
    public CellContainer_View(){
    	
    }
    
    /**
     * This method will draw GUI Components.
     * @param g the Graphics
     */
    public void draw(Graphics g){
        for(int y=0;y<ccCont.getyC();y++){
            for(int x=0;x<ccCont.getxC();x++){
                ccCont.getgcCont().getDraw(ccCont.getgcModelObj(y, x),g);
            }
        }
        
        for(int y=0;y<ccCont.getyC();y++){
            for(int x=0;x<ccCont.getxC();x++){
                ccCont.getgcCont().getfireRangeOutline(ccCont.getgcModelObj(y, x), g);
            }
        }
    }

    /**This is a method for set Cccount.
     * @param ccCont the ccCont to set
     */
    public void setCcCont(CellContainer_Controller ccCont) {
        this.ccCont = ccCont;
    }
}
