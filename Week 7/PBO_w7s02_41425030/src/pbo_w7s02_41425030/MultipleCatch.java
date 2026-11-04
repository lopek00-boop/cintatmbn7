/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w7s02_41425030;

/**
 *
 * @author ASUS
 */

// Nama: Cinta Tambunan 
// NIM: 41425030 
class MultipleCatch {
    public static void main(String args[]) { 
        int n = args.length;
        int a = 1;
        int c[] = new int[1];
        try { 
            if (n == 0)
                a = a / (a-1);
            else 
                c[21] = 5;
        } catch (ArithmeticException e) { 
            System.out.println("Ups, seem out we have an Arithmetic " 
                     + "Exception here...");
        } catch (Exception e) { 
            System.out.println("Let the other exception handler here...");
        }
    }
}

/* 
    5. Multiple Catch
a. Coba eksekusi program tanpa arguments. Catch statement mana yang dieksekusi?
Penjelasan: 
KODE EKSEKUSI: 
class MultipleCatch {
    public static void main(String args[]) { 
        int n = 0; 
        int a = 1;
        int c[] = new int[1];
        try { 
            if (n == 0)
                a = a / (a-1);
            else 
                c[21] = 5;
        } catch (ArithmeticException e) { 
            System.out.println("Ups, seem out we have an Arithmetic "
                     + "Exception here...");
        } catch (Exception e) { 
            System.out.println("Let the other exception handler here...");
        } 
OUTPUT: 
run:
Ups, seem out we have an Arithmetic Exception here...
BUILD SUCCESSFUL (total time: 0 seconds)
Penjelasan singkat: 
Karena nilai n = 0 (tanpa argumen), program masuk ke kondisi if dan melakukan 
pembagian dengan nol (1 / 0). Hal ini memicu ArithmeticException yang langsung ditangkap oleh blok catch pertama


b. Coba eksekusi program dengan sebuah argument. Catch statement mana yang dieksekusi?
Penjelasan: 
KODE EKSEKUSI: 
class MultipleCatch {
    public static void main(String args[]) { 
        int n = 1; 
        int a = 1;
        int c[] = new int[1];
        try { 
            if (n == 0)
                a = a / (a-1);
            else 
                c[21] = 5;
        } catch (ArithmeticException e) { 
            System.out.println("Ups, seem out we have an Arithmetic "
                     + "Exception here...");
        } catch (Exception e) { 
            System.out.println("Let the other exception handler here...");
        }
    }
}
OUTPUT: 
run:
Let the other exception handler here...
BUILD SUCCESSFUL (total time: 0 seconds)

Penjelasan singkat: 
Karena nilai n = 1(ada argumen), program masuk ke blok else dan mencoba mengakses indeks di luar batas array (c[21] = 5), 
yang memicu ArrayIndexOutOfBoundsException. Karena tidak ada blok catch khusus untuk error tersebut, Java mencocokkannya dengan blok kelas induknya, yaitu blok catch (Exception e)yang kedua.

c. Sekarang, ganti ArithmeticException dengan Excception sepeti yang ditunjukkan di
bawah ini: . Apa yang terjadi?Mengapa?Jelaskan 
Penjelasan: 
KODE EKSEKUSI: 
class MultipleCatch {
public static void main(String args[]) {
int n = args.length;
int a = 1;
int c[] = new int[1];
try {
if (n == 0)
a = a / (a-1);
else
c[21] = 5;
} catch (Exception e){
System.out.println("Ups, seem out we have an Arithmetic Exception here...");
} catch (ArithmeticException e){
System.out.println("Let the other exception handler here...");
}
}
} 
Penjelasan: 
Jika blok catch dibalik dengan menempatkan catch (Exception e) di posisi pertama dan catch (ArithmeticException e) di 
posisi kedua, maka program akan gagal dikompilasi (compile-time error) dengan pesan kesalahan "exception ArithmeticException has already been caught"/"unreachable catch block".

*/
