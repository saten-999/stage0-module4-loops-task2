package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String sent="";

        for (char nu: chars) {
            sent += nu;
        }
        System.out.print(sent);
    }

    public static void main(String[] args){
        WordsBuilder m = new WordsBuilder();

        m.buildPhrase('l', 'o', 'o', 'p', 's', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'o', 'l');
    }
}
