package sdajava.wspolniowoscTrzechP;

import java.util.Scanner;

public class Main {

    public int aX,aY,bX,bY,cX,cY;


    public void dane() {

        Scanner wejscie = new Scanner(System.in);
        System.out.print("Podaj wspolrzedne dla:" + "\naX:  ");
        this.aX = wejscie.nextInt();
        System.out.print("aY   ");
        this.aY = wejscie.nextInt();
        System.out.print("bX   ");
        this.bX = wejscie.nextInt();
        System.out.print("bY   ");
        this.bY = wejscie.nextInt();
        System.out.print("cX   ");
        this.cX = wejscie.nextInt();
        System.out.print("cY   ");
        this.cY = wejscie.nextInt();
    }

    public void doMath() {

        int det = this.aX * this.bY + this.bX * this.cY + this.cX * this.aY - this.cX*this.bY- this.aX * this.cX - this.bX * this.aY;

        if (det > 0) {
            System.out.print( det +"   Punkt c znajduje się po lewej stronie wektora AB");
        } else if (det == 0) {
            System.out.print( det +"   Punkty są wspoliniowe");
        } else {
            System.out.print( det +"   Punkt c znajduje się po prawej stronie wektora AB");
        }
    }

    public static void main(String[] args) {

        Main wywolanie = new Main();
        wywolanie.dane();
        wywolanie.doMath();

    }
}
