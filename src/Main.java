import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список продуктов
        List<Product> breakfastProducts = new ArrayList<>();
        breakfastProducts.add(new Pie("вишнёвый"));
        breakfastProducts.add(new Pie("вишнёвый"));
        breakfastProducts.add(new Pie("клубничный"));
        breakfastProducts.add(new Pie("яблочный"));
        breakfastProducts.add(new Product("Хлеб"));

        // Подсчет количества пирогов с заданной начинкой
        String fillingToCount = "вишнёвый"; // Например, вишнёвый
        int count = countProductsByType(breakfastProducts, new Pie(fillingToCount));

        System.out.println("Количество пирогов с начинкой '" + fillingToCount + "': " + count);
    }

    // Процедура подсчёта продуктов заданного типа
    public static int countProductsByType(List<Product> products, Product productToCount) {
        int count = 0;
        for (Product product : products) {
            if (product.equals(productToCount)) {
                count++;
            }
        }
        return count;
    }
}
