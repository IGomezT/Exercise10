public class Exercise10 {
    public static void main(String[] args) {

        final char[] LETTERS ={'B','A','B','C','A','C','D','C','C','C','D'} ;

        char mode = LETTERS[0];
        int frequency = 0;
        int counter;

        for(int i =0; i<LETTERS.length; i++) {
            counter = 0;

            for (int j = 0; j < LETTERS.length; j++) {
                if (LETTERS[j] == LETTERS[i]) {
                    counter++;
                }
                if (counter > frequency) {
                    frequency = counter;
                    mode = LETTERS[i];
                }
            }
        }
        System.out.println("The mode is: " +mode);
        System.out.println("the frequency is :" +frequency);



    }
}
