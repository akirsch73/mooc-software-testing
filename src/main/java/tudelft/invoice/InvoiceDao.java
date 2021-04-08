package tudelft.invoice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InvoiceDao {

	private static Connection c;

	public void InvoiceDao() {
		try {
			if (c != null) // Verbindung steht.
				return;

			c = DriverManager.getConnection("jdbc:hsqldb:file:mymemdb.db", "SA", ""); // falls null, stelle Verbindung her.
			c.prepareStatement("create table invoice (name varchar(100), value double)").execute(); // Erzeuge Tabelle mit zwei Spalten.
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Invoice> all() {

		List<Invoice> allInvoices = new ArrayList<>();

		try {
			PreparedStatement ps = c.prepareStatement("select * from invoice"); // frage alle Daten aus der Tabelle invoice ab

			ResultSet rs = ps.executeQuery(); // transferiere diese an rs

			while (rs.next()) {	// solange es eine weitere Zeile gibt, mache
				String name = rs.getString("name");
				double value = rs.getDouble("value");
				allInvoices.add(new Invoice(name, value)); // füge in den ArrayList diesen Eintrag hinzu.
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			return allInvoices; // schließlich gib die ArrayList zurück.
		}

	}

	public void save(Invoice inv) {
		try {
			PreparedStatement ps = c.prepareStatement("insert into invoice (name, value) values (?,?)"); // bereite einen SQL Befehl vor
			ps.setString(1, inv.getCustomer()); // füge in den Befehl einen Wert ein
			ps.setDouble(2, inv.getValue()); // füge einen weiteren Wert ein

			ps.execute(); // führe den Befehl aus

			c.commit();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void close() {
		try {
			c.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}