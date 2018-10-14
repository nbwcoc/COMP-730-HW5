package hw5;

public class VerbReplacementDecorator implements MadLibsDecorator {
    private String[] verbs = {"have", "get", "see", "look", "come", "come", "give", "work", "say", "use", "take", "know", "make", "go"};
    private int index = 0;
    MadLibsDecorator mlDecorator;
    
    public VerbReplacementDecorator(MadLibsDecorator d) {
        mlDecorator = d;
    }
    
    @Override
    public String decorateString() {
        String rv = mlDecorator.decorateString();
        String last = new String(rv);
        
        while (!rv.equals(last) ) {
            last = new String(rv);
            rv.replaceFirst("<verb>", verbs[index]);
            index = (index == verbs.length - 1) ? 0 : index + 1;
        }
        
        return rv;
    }
}
