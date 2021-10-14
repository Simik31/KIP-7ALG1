package task_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {

    public static void main(String[] args) {  // <- signatura (definice)

        Random rnd = new Random();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d.M.Y");
        LocalDate localDate = LocalDate.now();
        String date = dtf.format(localDate);

        Faktura faktura = new Faktura();
        faktura.item1 = new Item();
        faktura.item2 = new Item();

        double DPH = 21.0;

        faktura.id = rnd.nextInt(Integer.MAX_VALUE) + 1;

        faktura.date = date;

        faktura.item1.name = "Shitty PC";
        faktura.item1.setPrice(12000);
        faktura.item1.paid = true;

        faktura.item2.name = "3D printer";
        faktura.item2.setPrice(8000);
        faktura.item2.paid = true;

        System.out.println(
            "Bill id: " + faktura.id + "\n" +
            "Purchased on " + faktura.date + "\n" +
            "\nItems:" +
                "\n1. " + faktura.item1.name + " for " + faktura.item1.getPrice() + "kč (DPH: " + faktura.item1.getDPH(DPH) + "kč)" + ((faktura.item1.paid)?" (paid)":"(not paid)") +
                "\n2. " + faktura.item2.name + " for " + faktura.item2.getPrice() + "kč (DPH: " + faktura.item2.getDPH(DPH) + "kč)" + ((faktura.item2.paid)?" (paid)":"(not paid)") +
            "\n\nTotal price without DPH: " + faktura.totalPrice() + "kč" +
            "\nTotal price with DPH:    " + faktura.totalPrice(DPH) + "kč" +
            "\n\nYou paid " + faktura.paid() + " items"
        );

    }


}

// static -> metoda (funkce)
/*
    System.out.print();

    System  = třída
    out     = atribut
    print() = metoda
 */