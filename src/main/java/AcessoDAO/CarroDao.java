package AcessoDAO;

import ConnectionFA.ConnectionFactory;
import com.example.lp1.Carro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CarroDao {
    public void guardar(Carro carro) throws Exception{
        String sql = "INSERT INTO carro (modelo,marca,cor,placa) VALUES (?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        conn = ConnectionFactory.createConnectionToMySQL();
        pstm = (PreparedStatement) conn.prepareStatement(sql);

        pstm.setString(1, carro.getModelo());
        pstm.setString(2, carro.getMarca());
        pstm.setString(3, carro.getCor());
        pstm.setString(4, carro.getPlaca());


        pstm.execute();

        if (pstm!=null){
            pstm.close();
        }

        if (conn != null){
            conn.close();
        }
    }

    public void abrirgarargem(String placa)

    {
        String sql = "Select * from carro where placa = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        Carro carro = new Carro();
        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, String.valueOf(placa));
            //objeto para ler os dados do banco
            rset = pstm.executeQuery();


            // laço para percorrer o objeto de acesso ao dados do banco
            while (rset.next()) {

                carro.setPlaca(rset.getString("placa"));
                carro.setModelo(rset.getString("modelo"));
                carro.setMarca(rset.getString("marca"));
                carro.setCor(rset.getString("cor"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }

                if (pstm != null) {
                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
