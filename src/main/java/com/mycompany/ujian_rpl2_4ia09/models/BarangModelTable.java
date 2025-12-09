/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujian_rpl2_4ia09.models;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lenovo
 */
public class BarangModelTable extends AbstractTableModel {

    private List<BarangModel> barangList;

    private String[] columnNames = { 
        "Id",
        "Kode Barang",
        "Nama Barang",
        "Kategori",
        "Harga",
        "Stock"
    };

    public BarangModelTable(List<BarangModel> barangList) {
        this.barangList = barangList;
    }

    @Override
    public int getRowCount() {
        return barangList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        BarangModel barang = barangList.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return barang.getId();
            case 1:
                return barang.getKodeBarang();
            case 2:
                return barang.getNamaBarang();
            case 3:
                return barang.getKategori();
            case 4:
                return (int) barang.getHarga();
            case 5:
                return barang.getStok();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public void setBarangList(List<BarangModel> brgList) {
        this.barangList = brgList;
        fireTableDataChanged();
    }
}
