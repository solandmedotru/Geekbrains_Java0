import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {
        char[] cells = new char[10];

        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }

        int posicion1 = 4;
        int posicion2 = 3;
        cells[posicion1] = 'X';
        cells[posicion2] = 'X';

        while (cells[posicion1] == 'X' || cells[posicion2] == 'X') {
            System.out.println(cells);
            Scanner scanner = new Scanner(System.in);
            String s;
            s = scanner.nextLine();
            System.out.printf("Вы ввели %s\n", s);
            if (cells[Integer.parseInt(s)] == '.'){
                System.out.println("Промах");
                cells[Integer.parseInt(s)] = 'v';
            } else if (cells[Integer.parseInt(s)] == 'X'){
                System.out.println("ПОПАЛ!!!");
                cells[Integer.parseInt(s)] = '*';
            } else {
                System.out.println("Уже стреляли туда");
            }
        }
        System.out.println(cells);
        System.out.println("Корабль потоплен.");
    }
}
