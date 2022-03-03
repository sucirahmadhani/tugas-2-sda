import java.util.LinkedList;

public class linked_list1 {
    public static void main(String[] args) {
        LinkedList <String> saya = new LinkedList<>();
        saya.add("S");
        saya.add("U");
        saya.add("C");
        saya.add("I");
        saya.add(" ");
        saya.add("R");
        saya.add("A");
        saya.add("H");
        saya.add("M");
        saya.add("A");
        saya.add("D");
        saya.add("H");
        saya.add("A");
        saya.add("N");
        saya.add("I");
        System.out.println("Nama saya : "+saya);

        //nomor 1
        //add
        saya.addFirst(" ");
        saya.addFirst("S");
        saya.addFirst("S");
        saya.addFirst("I");
        saya.addFirst("M");
        System.out.println("Nama saya setelah penambahan karakter  : "+saya);

        //nomor 2
        //set (sisipan)
        saya.set(7, "S");
        System.out.println("Nama saya setelah penyisipan : "+saya);

        //nomor 3
        //remove
        saya.removeFirst();
        saya.removeLast();
        saya.remove(15);
        saya.remove(16);
        saya.remove(15);
        System.out.println("Nama saya setelah penghapusan : "+saya);

        //nomor 4
        //push
        saya.push("M");
        System.out.println("Nama saya setelah push : "+saya);

        //pop
        saya.pop();
        System.out.println("Nama saya setelah pop : "+saya);


    }
    
}
