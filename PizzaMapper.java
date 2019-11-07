package dataSource;

import Model.Pizza;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PizzaMapper {

    public ArrayList<Pizza> getPizzas() {
        ArrayList<Pizza> pizzas = new ArrayList();
        Connection con = DataBaseConnecter.getConnection();
        Statement stmt;
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pizza");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                int price = rs.getInt("price");
                Pizza pizza = new Pizza(name, id, description, price);
                pizzas.add(pizza);

            }
        } catch (SQLException ex) {
            Logger.getLogger(PizzaMapper.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pizzas;

    }

    public static void main(String[] args) throws SQLException {
        ArrayList<Pizza> menuCard = new PizzaMapper().getPizzas();
        for (Pizza pizza : menuCard) {
            System.out.print(pizza);
        }

    }

}
