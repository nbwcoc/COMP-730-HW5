package hw5;

public class MadLibsString implements MadLibsDecorator {
    private String string;
    
    public MadLibsString(String string) {
        this.string = string;
    }
    
    public String getMadLibsString() {
        return string;
    }

    @Override
    public String decorateString() {
        // TODO Auto-generated method stub
        return string;
    }

}
