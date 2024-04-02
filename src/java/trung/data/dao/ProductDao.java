/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package trung.data.dao;

import java.util.List;
import trung.data.model.Product;

public interface ProductDao {

    public List<Product> findAll();

    public Product findProduct(int id_product);
}
