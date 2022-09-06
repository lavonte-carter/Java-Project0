package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Model.AccountAtm;
import Util.utilConnection;

public class AccountRepository {
    Connection conn;

    public AccountRepository() {
        conn = utilConnection.getConnection();
    }

    public List<AccountAtm> getAllAccounts() {

        List<AccountAtm> allAccounts = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("Select  * From AccountAtm");
            while (rs.next()) {
                AccountAtm loadingAccount = new AccountAtm(rs.getString("username"), rs.getInt("balance"),
                        rs.getString("password"), rs.getInt("userid"));
                allAccounts.add(loadingAccount);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return allAccounts;
    }

    public List<AccountAtm> addAccount(AccountAtm a) {
        try {
            PreparedStatement statement = conn.prepareStatement("insert into AccountAtm (username, balance, password, userid)" +
                    "values(?,?,?,?)");
            statement.setString(1, a.getUserName());
            statement.setInt(2, a.getBalance());
            statement.setString(3, a.getPassword());
            statement.setInt(4, a.getUserid());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public List<AccountAtm> removeUser(int userid) {
        try {
            PreparedStatement statement = conn.prepareStatement("delete from AccountAtm where userid = ? ");
            statement.setInt(1, userid);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<AccountAtm> getAccountByUserID(int userid) {
        List<AccountAtm> username_accounts = new ArrayList<>();
        try {
            PreparedStatement statement = conn.prepareStatement("Select * from AccountAtm where userid is = ?");
            statement.setInt(1, userid);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                AccountAtm loadingAccount = new AccountAtm(rs.getString("username"), rs.getInt("balance"),
                        rs.getString("password"), rs.getInt("userid"));
                username_accounts.add(loadingAccount);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (username_accounts.size() == 0) {
            return username_accounts;
        } else {
            return username_accounts;
        }

    }

    public List<AccountAtm> updatePassword(String username, String password) {
        try {
            PreparedStatement statement = conn.prepareStatement("update AccountAtm set password = ? where username = ? ");
            statement.setString(1, password);
            statement.setString(2, username);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<AccountAtm> addMoney(String username, int balance) {
        try {
            PreparedStatement statement = conn.prepareStatement("update AccountAtm set balance = balance + ? where username = ? ");
            statement.setInt(1, balance);
            statement.setString(2, username);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }
}

