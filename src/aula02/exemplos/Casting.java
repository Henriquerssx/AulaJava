package aula02.exemplos;

public class Casting {
    public static void main(Exemplo08[] args) {
        byte varByte = 127;
        short varShort = varByte;
        int varInt = varShort;
        long varLonng = varInt;

        String Aprend = """
                            Playstation
                            XBox
                            Nintendo""";
        System.out.println(Aprend);

    }
}
