package bra1nh4ck;

import java.util.ArrayList;
import java.util.Iterator;
import java.awt.geom.Point2D.Double;
import robocode.*;

public class Territory{
    private ArrayList<Point2D.Double> points;
    private Iterator<Point2D.Double> it;
    private int NUM;

    public Territory(int n = 10){
        NUM = n;
        points = new ArrayList<Point2D.Double>();

        for(int i = 0; i < n; i++){
            // 点を打ってpointsにadd
        }
        it = points.iterator();
    }

    public int getNum(void){
        return NUM;
    }

    public Point2D.Double getNextPoint(void){
        if(it.hasNext){
            return it.next();
        }
        else{
            it = points.iterator();
            return it.next();
        }
    }
}