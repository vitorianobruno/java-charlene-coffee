package com.coding.app.util;

import com.coding.app.model.Product;

import java.util.List;

public interface Bonus {

    List<Product> checkExtra(List<Product> list);

    List<Product> checkStamps(List<Product> list, int stamps);

}
