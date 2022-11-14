package lesson06;

public class ForLoopTWII {

    public static void main(String[] args) {
        String[][] data = TWII.getData();
        System.out.println(data.length + "筆");
        // "證券代號","證券名稱","殖利率(%)","股利年度","本益比","股價淨值比","財報年/季"

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][1]);  //筆數,列
        }

    }

}
