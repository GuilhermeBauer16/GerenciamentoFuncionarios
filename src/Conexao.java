import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private Connection conexao;

    public boolean Conectar() {
        try {
            String url = "jdbc:sqlite:banco_de_dados/banco_sqlite.db";
            conexao = DriverManager.getConnection(url);
            System.out.println("Conexão estabelecida com sucesso!");
            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return false;
        }
    }

    public boolean Desconectar() {
        try {
            if (this.conexao.isClosed() == false) {
                this.conexao.close();
                System.out.println("Conexão fechada com sucesso!");
            }
            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao desconectar do banco de dados: " + e.getMessage());
            return false;
        }
    }
}
