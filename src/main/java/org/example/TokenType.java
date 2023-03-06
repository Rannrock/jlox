package org.example;

public enum TokenType {

    // Single characters tokens
    LPAREN, RPAREN, LBRACE, RBRACE,
    COMMA, DOT, MINUS, PLUS, SEMICOLON,
    SLASH, STAR,

    // One or two character token.
    BANG, BANG_EQUAL, EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL, LESS, LESS_EQUAL,

    // Literals.
    IDENTIFIER, STRING, NUMBER,

    // Keywords.
    AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NIL, OR,
    PRINT, RETURN, SUPER, THIS, TRUE, VAR, WHILE,

    EOF
}
