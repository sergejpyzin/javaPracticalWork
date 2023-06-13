package PracticalTaskLessonTwo;

public class taskThird {
    public static StringBuilder builderString(String line) {
        String stringOne = line.replace("{", "").replace("}", "").replaceAll("\"", "");
        String lastString = stringOne.replace("[", "").replace("]", "");
        StringBuilder resultString = new StringBuilder(" ");
        String [] stringsArray = lastString.split(",");
        String [] mainString = {"Студент ", " получил ", " по предмету "};
        for (int i =0; i < stringsArray.length; i++) {
            String[] stringArray = stringsArray[i].split(":");
            resultString.append(mainString[i]);
            resultString.append(stringArray[1]);
        }
        return resultString;
    }

    public static void main(String[] args) throws Exception {
        String[] string = library.readFile("JSONTest.json");
        for (String s : string) System.out.println(builderString(s));
    }
}
