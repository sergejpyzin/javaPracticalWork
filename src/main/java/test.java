import java.io.BufferedReader;
import java.io.FileReader;

public class test {

    public static String[] fileRead(String file) throws Exception {
        FileReader readerFile = new FileReader(file);
        BufferedReader readerBuffer = new BufferedReader(readerFile);
        int sizeArray = 0;
        while ((readerBuffer.readLine()) != null) sizeArray += 1;
        readerBuffer.close();

        String[] stringsArray = new String[sizeArray];

        int i = 0;
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string;
        while ((string = bufferedReader.readLine()) != null) {
            stringsArray[i] = string;
            i += 1;
        }
        bufferedReader.close();
        return stringsArray;
    }

    public static void main(String[] args) throws Exception {//
        String[] list = fileRead("E:\\GeekBranch\\JavaLessons\\PracticalWork\\src\\main\\java\\PracticalTaskLessonTwo\\String.txt");
        System.out.println(list[0]);
        StringBuilder resultSelect = builderString(list[0]);
        System.out.println(resultSelect);
    }

    public static StringBuilder builderString(String line) {
        String stringOne = line.replace("{", "").replace("}", "").
                replaceAll("\"", "");
        StringBuilder resultString = new StringBuilder("select * from students where ");
        String[] arrayData = stringOne.split(", ");
        for (int i = 0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            if (!arrData[1].equals("null")) {
                if (i != 0) resultString.append(", ").append(arrData[0]).append(" = ").append(arrData[1]);//
                else resultString.append(arrData[0]).append(" = ").append(arrData[1]);
            }
        }
        return resultString;
    }
}

