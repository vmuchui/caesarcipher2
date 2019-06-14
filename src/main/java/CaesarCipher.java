public class CaesarCipher {
    private String mName;
    private int mKey;

    public String getName() {
        return mName;
    }

    public int getKey() {
        return mKey;
    }

    public CaesarCipher(String name, int key) {
        mName = name;
        mKey = key;
    }

    public String encrypt() {
        String result = "";
        int length = this.mName.length();
        if (this.mKey>26){
            this.mKey = this.mKey%26;
        }
        if (this.mKey<0){
            this.mKey = 0;
        }
        for (int i = 0; i <=length-1; i++) {
            char character = this.mName.charAt(i);
            char ch = (char) (character + this.mKey);
            if (ch>'z' || ch<'A') {
                ch = (char) ('@' + this.mKey);

            }else if (ch>'Z' && ch<'a') {
                ch = (char) ('`' + this.mKey);
            }
            result += ch;
        }
        return result;
    }
    public String decrypt() {
        String result = "";
        int length = this.mName.length();
        if (this.mKey>26){
            this.mKey = this.mKey%26;
        }
        if (this.mKey<0){
            this.mKey = 0;
        }
        for (int i = 0; i <=length-1; i++) {
            char character = this.mName.charAt(i);
            char ch = (char) (character - this.mKey);
            if (ch<'a' && ch>'Z') {
                ch = (char) ('[' - this.mKey);
            }else if (ch<'A'|| ch>'z') {
                ch = (char) ('{' - this.mKey);
            }
            result += ch;
        }
        return result;
    }
}