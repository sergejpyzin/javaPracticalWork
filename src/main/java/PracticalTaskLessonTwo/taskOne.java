package PracticalTaskLessonTwo;

public class taskOne {
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

    public static void main(String[] args) throws Exception {
        String[] someStringArray = library.readFile("E:\\GeekBranch\\JavaLessons\\PracticalWork\\src\\main\\java\\PracticalTaskLessonTwo\\String.txt");
        System.out.println(someStringArray[0]);
        StringBuilder resultSelect = builderString(someStringArray[0]);
        System.out.println(resultSelect);

    }
}
