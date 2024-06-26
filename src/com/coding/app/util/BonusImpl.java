package com.coding.app.util;

import com.coding.app.model.Product;

import java.util.List;

public class BonusImpl implements Bonus {

    //------------------------Check Beverage - Snack to apply promotion FREE EXTRA
    public List<Product> checkExtra(List<Product> list) {

        boolean beverage = false;
        boolean snack = false;

        for (Product i : list){
            if(i.getType().contains("B")) {
                beverage = true;
                break;
            }
        }

        for (Product i : list){
            if(i.getType().contains("S")) {
                snack = true;
                break;
            }
        }

        if(beverage && snack) {
            for(Product i: list) {
                if(i.getType().equals("E")) {
                    i.setPrice(0.0);
                    i.setPromo("* PROMO *");
                    break;
                }
            }
        }
        return list;
    }

    //------------------------Check stamp card to apply promotion FREE BEVERAGE
    public List<Product> checkStamps(List<Product> list, int stamps) {

        int beverageFree = (int) (stamps / 5);
        int count = 0;

        for(Product i: list) {
            if(count >= beverageFree) {
                break;
            }
            if(i.getType().equals("B")) {
                i.setPrice(0.0);
                i.setPromo("* PROMO *");
                count++;
            }
        }
        return list;
    }

}
