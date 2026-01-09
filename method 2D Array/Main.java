
public class Main {

    public static void main(String[] args) {

        //1.   ประกาศตัวแปร int[][] ที่มีขนาด 10× 10 เพื่อใช้เก็บข้อมูลตัวเลขจำนวนเต็ม
        int[][] array1 = new int[10][10];

        //2.   เขียน method สำหรับ สุ่มค่าตัวเลขจำนวนเต็มระหว่าง 50 – 59 แล้วนำไปเก็บลงในทุกตำแหน่งของ 2D Array
        randomArray(array1);

        //3.   เขียน method สำหรับแสดงค่าข้อมูลทั้งหมดใน 2DArray โดยแสดงผลเป็นลักษณะตาราง
        System.out.println("Array 1:");
        displayArray(array1);

        //4.   ให้ประกาศ 2D Array ขนาด 10 × 10 อีก 1 ตัว 
        // จากนั้นเขียน method เพื่อ บวกค่าของ array ทั้งสองตัวในตำแหน่งเดียวกัน และเก็บผลลัพธ์ลงใน array ใหม่
        int[][] array2 = new int[10][10];
        addArray(array1, array2);
        int[][] result = addArray(array1, array2);
        System.out.println("result :");
        displayArray(result);
    }

    // 1. method สุ่มค่า 50–59
    public static void randomArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10) + 50;
            }
        }
    }

    // 2. method แสดงผล 2D Array
    public static void displayArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
        System.out.println();
    }

    // 3. method บวกค่า 2D Array
    public static int[][] addArray(int[][] arr1, int[][] arr2) {
        int[][] result = new int[10][10];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return result;
    }
}
