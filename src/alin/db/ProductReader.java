package alin.db;

import java.util.ArrayList;
import alin.business.*;

public interface ProductReader
{
    Product getProduct(String code);
    ArrayList<Product> getProducts();
}