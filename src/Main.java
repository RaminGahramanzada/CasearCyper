public class Main {
    public static void main(String[] args) {
        System.out.println(caesarCyperEncryptor("Teymur lab isi eliyir", ));
    }
    public static char makeFit(char ch,int key){
        int firstMove=(int)ch+key;
        if(firstMove>122){
            firstMove-=26;
        }
        return (char) firstMove;
    }

    public static  String caesarCyperEncryptor(String str,int key){
        String retStr="";
        for (int i = 0; i < str.length(); i++) {
            retStr+=makeFit(str.charAt(i),key%26);
        }
        return retStr;
    }
}