public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.println("Уволен айтишник с id: " + i);
        }

        System.out.println("и ещё раз только через While: ");
        int id = 1;
        while (id <= 100) {
            if (id % 2 == 0) {
                System.out.println("Уволен айтишник с id: " + id);
            }
            id += 1;
        }

    }
}
