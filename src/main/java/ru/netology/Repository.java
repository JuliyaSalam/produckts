package ru.netology;

public class Repository {
    private Product[] products = new Product[0];

    public void save(Product product) {
        if (findById(product.getId()) != null) {
            throw new AlreadyExistsException("Элеммента с id = " + product.getId() + " уже есть");
        } else {

            int length = products.length + 1;
            Product[] tmp = new Product[length];
            System.arraycopy(products, 0, tmp, 0, products.length);
            tmp[tmp.length - 1] = product;
            this.products = tmp;
        }
    }

    public Product[] findAll() {
        return products;
    }

    public void dalitId(int id) {
        if (findById(id) == null) {
            throw new NotFoundException("Элеммента с id = " + id + " нет");
        } else {
            int length = products.length - 1;
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

    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

}
