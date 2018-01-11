/*
 * NIM  : 10116520
 * Nama : Fajar Abdul Ghani
 * Kelas: PBO-12
 */
package edu.fajarghani.latihanmvcjdbc.event;

import edu.fajarghani.latihanmvcjdbc.entity.Pelanggan;
import edu.fajarghani.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Flow
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggans);

}
