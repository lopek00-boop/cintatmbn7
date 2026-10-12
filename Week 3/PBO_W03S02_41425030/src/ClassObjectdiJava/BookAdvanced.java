/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObjectdiJava;

/**
 *
 * @author ASUS
 */
/* Nama: Cinta Tambunan 
NIM: 41425030 
Prodi: DIV TRPL 2025
*/
public class BookAdvanced {
    private String t;
    private String a;
    private int y;

    public BookAdvanced(String t, String a, int y) {
        this.t = t;
        this.a = a;
        this.y = y;
    }

    @Override
    public String toString() {
        return t + " by " + a + " (" + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof BookAdvanced)) {
            return false;
        }
        BookAdvanced other = (BookAdvanced) o;
        return this.t.equals(other.getTitle())
            && this.a.equals(other.getAuthor())
            && this.y == other.getYear();
    }

    @Override
    public int hashCode() {
        int res = 17;
        res = 31 * res + t.hashCode();
        res = 31 * res + a.hashCode();
        res = 31 * res + y;
        return res;
    }

    @Override
    public BookAdvanced clone() {
        try {
            return (BookAdvanced) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing " + this);
    }

    public String getTitle() { return t; }
    public String getAuthor() { return a; }
    public int getYear() { return y; }

    public static void main(String[] args) {
        BookAdvanced b1 = new BookAdvanced(
            "The Hitchhiker's Guide to the Galaxy",
            "Douglas Adams", 1979);
        System.out.println(b1);

        BookAdvanced b2 = b1.clone();
        System.out.println(b2);

        System.out.println("b1 equals b2: " 
            + b1.equals(b2));

        System.out.println("b1 hash code: " 
            + b1.hashCode());
        System.out.println("b2 hash code: " 
            + b2.hashCode());

        b1 = null;
        System.gc();
    }
}
