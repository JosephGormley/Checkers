package com.example.joegormley.checkers;

/**
 * Created by joegormley on 1/10/18.
 */

enum Color {
    R, B
}
enum Type {
    P, K
}

public class Piece {

    /*************
     * MEMBER(S) *
     *************/
    Type piece;
    Color color;

    /******************
     * CONSTRUCTOR(S) *
     ******************/
    public Piece(Color color){
        piece = Type.P;
        this.color = color;
    }

    /*************
     * METHOD(S) *
     *************/
	/* Moves a checkers piece from src to des */
    void move(String src, String des){

    }

    public String toString(){
        return color + "" + piece;
    }

}
