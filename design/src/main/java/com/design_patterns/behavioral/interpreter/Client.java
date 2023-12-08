package com.design_patterns.behavioral.interpreter;

interface AbstractSyntaxTree {
    boolean hasNext();

    Program getNextNode();
}

/**
 * Definition
 * The interpreter pattern converts a language's sentences into its grammar and
 * interprets them.
 */
public class Client {
    public static void main(AbstractSyntaxTree ast) {
        Context context = new Context("glide splitS glide barelRoll glide");

        while (ast.hasNext()) {
            Program node = ast.getNextNode();
            node.interpret(context);
        }
    }
}
