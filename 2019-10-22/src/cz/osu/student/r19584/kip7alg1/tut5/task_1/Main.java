package cz.osu.student.r19584.kip7alg1.tut5.task_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d.M.Y");
        LocalDate localDate = LocalDate.now();
        String date = dtf.format(localDate);

        Invoice invoice = new Invoice();
        invoice.item1 = new Item();
        invoice.item2 = new Item();

        double VAT = 21.0;

        invoice.id = rnd.nextInt(Integer.MAX_VALUE) + 1;

        invoice.date = date;

        invoice.item1.name = "Shitty PC";
        invoice.item1.setPrice(12000);
        invoice.item1.paid = true;

        invoice.item2.name = "3D printer";
        invoice.item2.setPrice(8000);
        invoice.item2.paid = true;

        System.out.println("Invoice id: " + invoice.id + "\n" + "Purchased on " + invoice.date + "\n" + "\nItems:"
                + "\n1. " + invoice.item1.name + " for " + invoice.item1.getPrice() + "kč (VAT: "
                + invoice.item1.getVAT(VAT) + "kč)" + ((invoice.item1.paid) ? " (paid)" : "(not paid)") + "\n2. "
                + invoice.item2.name + " for " + invoice.item2.getPrice() + "kč (VAT: " + invoice.item2.getVAT(VAT)
                + "kč)" + ((invoice.item2.paid) ? " (paid)" : "(not paid)") + "\n\nTotal price without VAT: "
                + invoice.totalPrice() + "kč" + "\nTotal price with VAT:    " + invoice.totalPrice(VAT) + "kč"
                + "\n\nYou paid " + invoice.paid() + " items");
    }
}
