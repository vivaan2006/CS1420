package Experiments;

public class Experiments {
    public static void main(String[] args) {
        String[] copyFrom = {"hello", "bye", "bonjour", "ciao", "hola", "adios"};
        String[] copyTo = new String[6];
        System.arraycopy(copyFrom, 0,copyTo, 0, 6);
        for(String var : copyTo){
            System.out.println(var);
        }

        }
}