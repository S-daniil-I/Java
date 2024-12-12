// Класс Food, который будет являться родителем для других классов
public class Food {
    private String type;

    public Food(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Food food = (Food) obj;
        return type.equals(food.type);
    }
}
