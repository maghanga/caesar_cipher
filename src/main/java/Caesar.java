class Caesar {
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

}
