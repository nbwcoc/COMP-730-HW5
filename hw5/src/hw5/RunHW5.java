package hw5;

public class RunHW5 {

    public static void main(String[] args) {
        MadLibsString[] strings = {
            new MadLibsString("Without precise <noun>s we could <verb> right through a <noun> or <verb> too close to a <noun>, and that’d end your <noun> real quick, wouldn’t it?"),
            new MadLibsString("Hokey <noun>s and ancient <noun>s are no <verb> for a good <noun> at your side, kid.")
        };
        
        for (var s : strings) {
            var verbs = new VerbReplacementDecorator(s);
            var nouns = new NounReplacementDecorator(verbs);
            System.out.println(nouns.decorateString());
        }
    }
}
