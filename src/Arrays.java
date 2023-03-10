import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
   //     String[] names = {"Dave","Rickie","Jordan"};
//        String[] names = new String[3];
//        names[0] = "Dave";
//        names[1] = "Rickie";
//        names[2] = "Jordan";
//
//
//        for (int i = 0;i < names.length;i++) {
//            System.out.println(names[i]);
//        }
//
//        double[] gpa = {4.0,3.2,2.1};
//
//        for (int i = 0;i < gpa.length;i++) {
//            System.out.println(gpa[i]);
//        }
//
//        ArrayList<Integer> grades = new ArrayList<Integer>();
//        grades.add(579);
//        System.out.println(grades);
//        int ultimateNumber = 42;
//        grades.add(ultimateNumber);
//
//        ArrayList<String> giantWords = new ArrayList<String>();
//        giantWords.add("fee");
//        giantWords.add("fie");
//        giantWords.add("foe");
//        System.out.println(giantWords);
//        System.out.println("my list has " + giantWords.size() + " elements");
//
//        giantWords.add("fum");
//        System.out.println(giantWords);
//        System.out.println("my list has " + giantWords.size() + " elements");
//
//
//
//        ArrayList<String> myOtherTools = new ArrayList<>();
//        myOtherTools.add("hammer");
//        myOtherTools.add("shovel");
//        myOtherTools.add("wrench");
//        myOtherTools.add(0,"Screw Driver");
//
//        String[] myTools = {"hammmer","shovel","wrench"};
//
//        ArrayList<String> animalNames = new ArrayList<>();
//        animalNames.add("Lion");
//        animalNames.add("Panda");
//        animalNames.add("Monkey");
//        animalNames.add("Zebra");
//        animalNames.add("Tiger");
//
//        for (String animalName:animalNames) {
//            System.out.println(animalName);
//        }
//
//        ArrayList<Boolean> isRaining = new ArrayList<>();
//        isRaining.add(true);
//        isRaining.add(false);
//        isRaining.add(false);
//        isRaining.add(true);
//        isRaining.add(false);
//
//        for (Boolean rain:isRaining) {
//            if (rain) {
//                System.out.println("Better bring an umbrella");
//            }
//            else {
//                System.out.println("No rain today, enjoy the sun!");
//            }
//        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(23);
        numbers.add(9);
        numbers.add(77);
        numbers.add(922);
        numbers.add(6);
        numbers.add(32);
        numbers.add(63);
        numbers.add(14);
        numbers.add(5);

        System.out.println(numbers);
        for (int numberCounter = numbers.size()-1;numberCounter>=0;numberCounter--) {
           if (numbers.get(numberCounter) == 23 || numbers.get(numberCounter) == 922 ||
                   numbers.get(numberCounter) == 32 || numbers.get(numberCounter) == 6) {
               numbers.remove(numberCounter);
           }
        }
        System.out.println(numbers);
    }
}
