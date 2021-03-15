package com.company.March.Hw11March;

import java.util.Comparator;

public class CommodityWidthComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        if(o1.getProductWidth() > o2.getProductWidth()){
            return 1;
        }else if(o1.getProductWidth() < o2.getProductWidth()){
            return -1;
        }else {
            return 0;
        }
    }
}
