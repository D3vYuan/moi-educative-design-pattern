package com.design_patterns.behavioral.interpreter;

interface AbstractSyntaxTree {
    boolean hasNext();

    Program getNextNode();
}

public class Client {
    public static void main(AbstractSyntaxTree ast) {
        Context context = new Context("glide splitS glide barelRoll glide");

        while (ast.hasNext()) {
            Program node = ast.getNextNode();
            node.interpret(context);
        }
    }
}
