public class Main {


    public static void main(String[] args) {
        int range = 'Z' - 'A' + 1;
        String lconsonants = "";
        String uvowel = "";
        String uconsonants = "";
        String outcome = "";
        String lvowels = "";

        for (int i = 0; i < 50; i++) {
            boolean way = (int) ((Math.random() * 100)) % 2 == 0;
            char c = (char) (Math.random() * range + 'A');
            if (way) {
                c = Character.toLowerCase(c);
            }
            outcome = outcome + c;


        }
        for (int i = 0; i< outcome.length();i++){
            char ch = (char) outcome.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){

                lvowels = lvowels + ch;
            }
            else if ((ch >= 'a'&& ch <= 'z')){
                lconsonants = lconsonants + ch;
            }
        }
        for (int i= 0; i< outcome.length(); i++){
            char ch =(char) outcome.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){

                uvowel = uvowel + ch;
            }
            else if ((ch >= 'A'&& ch <= 'Z')){
                uconsonants = uconsonants + ch;
            }
        }
        System.out.println(outcome);
        System.out.println(uvowel);
        System.out.println(uconsonants);
        System.out.println(lconsonants);
        System.out.println(lvowels);

    }


}

