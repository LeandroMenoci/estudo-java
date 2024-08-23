package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome ou parte do nome que deseja pesquisar: ");
        String nomeEntrada = entrada.nextLine();

        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas where nome like (?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + nomeEntrada + "%");
        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getCodigo() + "-->" + p.getNome());
        }

        stmt.close();
        conexao.close();
        entrada.close();
    }
}
