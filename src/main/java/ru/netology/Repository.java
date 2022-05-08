package ru.netology;

public class Repository {
    private Product[] products = new Product[0];



    public void save(Product product) {

        int length = products.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(products, 0, tmp, 0, products.length);
        tmp[tmp.length - 1] = product;
        this.products = tmp;
    }

    public Product[] findAll() {
        return products;
    }

    public void dalitId(int id) {
        int length = products.length -1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product item : products) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        products = tmp;
    }

}
