class Program
  public static void main(String[] args) {
        // write a method would replace every vowel in the string
        //input TechnoStudy
        //output TXchXStXdX

            //alttaki kolay method sesli harfleri istedigin harfle degistir
            String string = "TechnoStudy";
            string = string.replaceAll("[AaEeIiOoUu]", "x");
            System.out.println(string);
