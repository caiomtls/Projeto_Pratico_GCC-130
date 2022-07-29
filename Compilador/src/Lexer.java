import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;

public class Lexer {
    public static void main(String[] args) {
        String filename = "/home/caio/IdeaProjects/Compilador/src/codigoComErro.txt";
        try {
            CharStream input = (CharStream) CharStreams.fromFileName(filename);
            GritoLexer lexer = new GritoLexer((org.antlr.v4.runtime.CharStream) input);
            Token token;
            while (!lexer._hitEOF) {
                token = lexer.nextToken();
                System.out.println("Token: " + token.toString());
                System.out.println("    Lexema: " + token.getText());
                System.out.println("    Classe: " + lexer.getVocabulary().getDisplayName(token.getType()));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}