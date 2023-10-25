package Test4;
class Utils {
    // Обобщённый метод.
    static <T> void setIfNull(Pairs<T> lair, T t) {
        if (lair.getInhabitant() == null) {
            lair.setInhabitant(t);
        }
    }
}