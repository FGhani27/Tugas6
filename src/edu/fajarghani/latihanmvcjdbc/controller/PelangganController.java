/*
 * NIM  : 10116520
 * Nama : Fajar Abdul Ghani
 * Kelas: PBO-12
 */
package edu.fajarghani.latihanmvcjdbc.controller;

import edu.fajarghani.latihanmvcjdbc.error.PelangganException;
import edu.fajarghani.latihanmvcjdbc.model.PelangganModel;
import edu.fajarghani.latihanmvcjdbc.view.PelangganView;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Flow
 */
public class PelangganController {

    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }

    public void resetPelanggan(PelangganView view) {
        model.resetPelanggan();

    }

    public void insertPelanggan(PelangganView view) {

        String nama = view.getTxtNama().getText();
        String alamat = view.getTxtAlamat().getText();
        String telepon = view.getTxtTelepon().getText();
        String email = view.getTxtEmail().getText();

        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        } else if (nama.length() > 255) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh lebih dari 255 karakter ea");
        } else if (telepon.length() > 12) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh lebih dari 12 karakter ea");
        } else if (!email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(view, "Email Tidak Valid Bosqu");
        } else {

            model.setNama(nama);
            model.setAlamat(alamat);
            model.setTelepon(telepon);
            model.setEmail(email);

            try {
                model.insertPelanggan();
                JOptionPane.showMessageDialog(view, "Pelanggan Berhasil Ditambahkan uwu");
                model.resetPelanggan();
            } catch (PelangganException | HeadlessException | SQLException throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di data base dengan pesan ", throwable.getMessage()});
            }
        }

    }

    public void updatePelanggan(PelangganView view) {

        if (0 == view.getTablePelanggan().getSelectedRowCount()) {
            JOptionPane.showMessageDialog(view, "Silahkan seleksi baris data yang akan di ubah mamanx qwq");
            return;
        } else {
        }

        Integer id = Integer.parseInt(view.getTxtId().getText());

        String nama = view.getTxtNama().getText();
        String alamat = view.getTxtAlamat().getText();
        String telepon = view.getTxtTelepon().getText();
        String email = view.getTxtEmail().getText();

        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        } else if (nama.length() > 255) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh lebih dari 255 karakter ea");
        } else if (telepon.length() > 12) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh lebih dari 12 karakter ea");
        } else if (!email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(view, "Email Tidak Valid Bosqu");
        } else {

            model.setId(id);
            model.setNama(nama);
            model.setAlamat(alamat);
            model.setTelepon(telepon);
            model.setEmail(email);

            try {
                model.updatePelanggan();
                JOptionPane.showMessageDialog(view, "Pelanggan Berhasil Diubah uwu");
                model.resetPelanggan();
            } catch (PelangganException | HeadlessException | SQLException throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di data base dengan pesan ", throwable.getMessage()});
            }
        }

    }

    public void deletePelanggan(PelangganView view) {
        if (view.getTablePelanggan().getSelectedRowCount() == 0) {

            JOptionPane.showMessageDialog(view, "Silahkan seleksi baris data yang akan di hapus mamanx qwq");
            return;
        }

        if (JOptionPane.showConfirmDialog(view, "Cius mau di hapus ? ;w;") == JOptionPane.OK_OPTION) {
            Integer id = Integer.parseInt(view.getTxtId().getText());
            model.setId(id);

            try {
                model.deletePelanggan();
                JOptionPane.showMessageDialog(view, "Pelanggan Berhasil Dihapus uwu");
                model.resetPelanggan();
            } catch (PelangganException | HeadlessException | SQLException throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di data base dengan pesan ", throwable.getMessage()});
            }
        }

    }
}
