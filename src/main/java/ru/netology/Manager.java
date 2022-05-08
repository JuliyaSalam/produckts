package ru.netology;

public class Manager {
    private Repository repository = new Repository();

    public Manager() {
    }


    public void add(Product product) {
        repository.save(product);
    }

    public Product[] findAll() {
        return repository.findAll();
    }

    public void dall(int id) {
        repository.dalitId(id);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product : repository.findAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }


    public boolean matches(Product product, String search) {
        if (product.getTitle().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}
