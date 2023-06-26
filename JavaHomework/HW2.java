import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HW2 {
    public static void main(String[] args) throws Exception {
        System.out.println(task1("\"{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}\""));
        int[] arr = {999999,100000,10000,2000,1000,20,19,18,17,16,15,14,13,12,11 ,10,9, 8, 7, 6, 5, 4, 3, 2, 1};
        task2(arr);
    }

    static StringBuilder task1(String str){
        StringBuilder stringBuilder = new StringBuilder("select * from students where ");
        String temp = str.replace("{", "");
        str = temp.replace("}", "");
        temp = str.replaceAll("\"", "" );
        String[] arr = temp.split(",");
        for (int i = 0; i < arr.length; i++){

            String[] arr1 = arr[i].split(":");

            if(arr1[1].equals("null") == false) {
                if (i != 0) {
                    stringBuilder.append(", ");
                    stringBuilder.append(arr1[0]);
                    stringBuilder.append(" = ");
                    stringBuilder.append("'" + arr1[1] + "'");
                } else {
                    stringBuilder.append(arr1[0]);
                    stringBuilder.append(" = ");
                    stringBuilder.append("'" + arr1[1] + "'");
                }
            }
        }
        return stringBuilder;
        }

    static void task2(int[] arr) {
        int count = 0;
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("log.txt"));

            for(int i = 0; i < arr.length-1; i++) {
                for(int j = 0; j < arr.length-i-1; j++) {

                    if(arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                        bufferedWriter.write("Iteration %d swap %d and %d: ".formatted(count++, arr[j], arr[j + 1]));

                        for(int k = 0; k < arr.length; k++) {
                            bufferedWriter.write(arr[k] + " ");
                        }
                        bufferedWriter.newLine();
                    }
                }
            }

            bufferedWriter.close();
        } catch(IOException exception) {
            exception.printStackTrace();
        }
    }
}



