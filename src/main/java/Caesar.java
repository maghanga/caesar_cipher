public class Caesar {
    private String plainText;
    private int shift;

    public Caesar(String plainText, int shift){
        this.plainText = plainText;
        this.shift = shift;
    }

    public String getPlainText(){
        return plainText;
    }

    public Integer getShift(){
        return shift;
    }

    public static String encrypt(String plainText, int shift){
        if(shift > 26){
            shift = shift % 26;
        } else if (shift < 0){
            shift = (shift % 26) + 26;
        }

        String cipherText = "";
        int length = plainText.length();
        for(int i = 0; i < length; i++){
            char character = plainText.charAt(i);
            if(Character.isLetter(character)){
                if(Character.isLowerCase(character)){
                    char ch = (char)(character + shift);
                    if(ch > 'z'){
                        cipherText
                    }
                }
            }
        }
    }

}
