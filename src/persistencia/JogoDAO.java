/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Categoria;
import entidades.Jogo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JogoDAO {

    public static boolean inserir(Jogo jogo) {
        try {
            Connection conexao = Conexao.getConexao();
            String sql =" INSERT INTO jogo (titulo, descricao, preco, numeroDias, categoria_id, memoria, tipo) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, jogo.getTitulo());
            ps.setString(2, jogo.getDescricao());
            ps.setDouble(3, jogo.getPreco());
            ps.setInt(4, jogo.getNumeroDias());
            ps.setInt(5, jogo.getCategoria().getId());
            ps.setInt(6, jogo.getMemoria());
            ps.
        } catch (Exception e) {
        }
    }

}
