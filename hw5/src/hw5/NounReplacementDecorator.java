package hw5;

public class NounReplacementDecorator implements MadLibsDecorator {
    private String[] nouns = {"time", "person", "year", "way", "day", "thing", "way", "man", "world", "life", "hand", "part", "child", "eye", "woman", "place"};
    private int index = 0;
    MadLibsDecorator mlDecorator;
    
    public NounReplacementDecorator(MadLibsDecorator d) {
        mlDecorator = d;
    }
    
    @Override
    public String decorateString() {
        String rv = mlDecorator.decorateString();
        String last = new String(rv);
        
        while (!rv.equals(last) ) {
            last = new String(rv);
            rv.replaceFirst("<noun>", nouns[index]);
            index = (index == nouns.length - 1) ? 0 : index + 1;
        }
        
        return rv;
    }
}
