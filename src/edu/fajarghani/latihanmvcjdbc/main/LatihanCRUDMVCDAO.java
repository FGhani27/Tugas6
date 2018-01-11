/*
 * NIM  : 10116520
 * Nama : Fajar Abdul Ghani
 * Kelas: PBO-12
 */
package edu.fajarghani.latihanmvcjdbc.main;

import edu.fajarghani.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.fajarghani.latihanmvcjdbc.entity.Pelanggan;
import edu.fajarghani.latihanmvcjdbc.error.PelangganException;
import edu.fajarghani.latihanmvcjdbc.service.PelangganDao;
import edu.fajarghani.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author Flow NIM : 10116520 Nama : Fajar Abdul Ghani Kelas: PBO-12
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        );
    }
}
