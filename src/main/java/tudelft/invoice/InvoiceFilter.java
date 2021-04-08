package tudelft.invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceFilter {

    public List<Invoice> filter() {

        InvoiceDao invoiceDao = new InvoiceDao();  // Ezezeuge ein Dao Object
        List<Invoice> allInvoices = invoiceDao.all(); // Weise der Variablen eine Liste zu.

        List<Invoice> filtered = new ArrayList<>(); // Erzeuge eine Ergebnisliste

        for(Invoice inv : allInvoices) { // iteriere durch die Liste aus der Datenbank.
            if(inv.getValue() < 100.0)
                filtered.add(inv);	// füge alle Datensätze größer 100 hinzu.
        }

        return filtered; // gibt die neue Liste zurück.

    }
}