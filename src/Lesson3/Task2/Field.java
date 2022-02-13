package Lesson3.Task2;

public class Field {
    int[][] field = {{0, 1, 1, 0, 0},
            {1, 0, 0, 1, 1},
            {0, 1, 0, 0, 0},
            {1, 0, 0, 1, 0},
            {0, 1, 1, 1, 0}};

    /**
     * Создание игрового поля размера NxN.
     */

    Field() {

    }

    public int[][] getField() {
        return field;
    }

    /**
     * @return длину массива поля
     */
    public int getFieldLength() {
        return (field.length);
    }

    /**
     * @return значение элемента под индексом
     */
    public int getFieldValue(int a, int b) {
        return field[a][b];
    }

    /**
     * Устанавливает значение поля по индексу
     */
    public void setFieldValue(int a, int b, int value) {
        this.field[a][b] = value;
    }
}

//    public void fillInField(int[][] field) {
//        for (int i = 0; i < field.length; i++) {
//            for (int j = 0; j < field.length; j++) {
//                if (Math.random() > 0.55) {
//                    field[i][j] = 1;
//                }
//            }
//        }
//    }
//}
